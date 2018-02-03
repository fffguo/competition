package com.example.competition.controller;

import com.example.competition.VO.ResultVO;
import com.example.competition.dao.entity.Report;
import com.example.competition.enums.ResultVOEnum;
import com.example.competition.service.ReportService;
import com.example.competition.utils.BeanUtil;
import com.example.competition.utils.DateUtil;
import com.example.competition.utils.ExcelUtil;
import com.example.competition.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.DateUtils;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.IntrospectionException;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @作者：刘富国
 * @创建时间：2018/1/30 9:07
 */
@Slf4j
@Controller
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/link")
    public String getReportList(@RequestParam("status") Integer status, ModelMap modelMap) {
        Report report = new Report();
        report.setReportStatus(status);
        modelMap.put("reportList", reportService.findAll(report));
        modelMap.put("status", status);
        modelMap.put("reportTableClass" + status, "active-menu");
        modelMap.put("reportTableClass", "waves-effect waves-dark active-menu");
        return "reportTable";
    }

    @PostMapping("/setStatus")
    @ResponseBody
    public ResultVO<String> setStatus(@RequestParam(value = "reportId") Integer reportId, @RequestParam("status") Integer status) {
        Report report = reportService.findOne(reportId);
        if (report == null) {
            log.error("【更改报名状态】，报名信息不存在：reportId={}", reportId);
            return ResultVOUtil.error(ResultVOEnum.ERROR.getCode(), "报名信息不存在");
        }
        if (status != 1 && status != 0 && status != 2 && status != 3) {
            log.error("【更改报名状态】，状态非法：reportId={}，status={}", reportId, status);
            return ResultVOUtil.error(ResultVOEnum.ERROR.getCode(), "更改的状态非法");
        }
        if (report.getReportStatus() == status) {
            log.error("【更改报名状态】，状态非法：reportId={}，status={}", reportId, status);
            return ResultVOUtil.error(ResultVOEnum.ERROR.getCode(), "请不要重复操作");
        }
        report.setReportStatus(status);
        report = reportService.save(report);
        if (report == null) {
            log.error("【更改报名状态】，更新状态失败：reportId={}，status={}", reportId, status);
            return ResultVOUtil.error(ResultVOEnum.ERROR.getCode(), "更改失败");
        }
        if (status == 1) {
            return ResultVOUtil.success(report.getWorksName() + "已通过");
        } else if (status == 2) {
            return ResultVOUtil.success(report.getWorksName() + "已拒绝");
        } else if (status == 3) {
            return ResultVOUtil.success(report.getWorksName() + "删除成功");
        }
        return null;
    }

    @GetMapping("/findOne")
    @ResponseBody
    public ResultVO<ModelMap> findOne(@RequestParam("reportId") Integer reportId, ModelMap modelMap) {
        Report report = reportService.findOne(reportId);
        if (report == null) {
            log.error("【查询报名信息详情】，报名信息不存在：reportId={}", reportId);
            return ResultVOUtil.error(ResultVOEnum.ERROR.getCode(), "报名信息不存在");
        }
        modelMap.put("_report", report);
        return ResultVOUtil.success(modelMap);
    }

    @PostMapping("/update")
    @ResponseBody
    public ResultVO<String> update(Report report) {
        if (StringUtils.isEmpty(report.getReportId())) {
            log.error("【更新报名信息】，Id不能为空：reportId={}", report.getReportId());
            return ResultVOUtil.error(ResultVOEnum.ERROR.getCode(), "Id不能为空");
        }
        Report result = reportService.findOne(report.getReportId());
        if (result == null) {
            log.error("【更新报名信息】，报名信息不存在：reportId={}", report.getReportId());
            return ResultVOUtil.error(ResultVOEnum.ERROR.getCode(), "报名信息不存在");
        }
        try {
            report.setCreateTime(result.getCreateTime());
            reportService.save(report);
        } catch (Exception e) {
            log.error("【更新报名信息】，更新失败：reportId={}，message={}", report.getReportId(), e.getMessage());
            return ResultVOUtil.error(ResultVOEnum.ERROR.getCode(), "保存失败");
        }
        return ResultVOUtil.success("保存成功");
    }

    @PostMapping("/insert")
    public ResultVO<String> insert(Report report) {
        if (!StringUtils.isEmpty(report.getReportId())) {
            log.error("【新增报名信息】，id必须为空：reportId={}", report.getReportId());
            return ResultVOUtil.error(ResultVOEnum.ERROR.getCode(), "报名信息已存在");
        }
        try {
            reportService.save(report);
        } catch (Exception e) {
            log.error("【新增报名信息】，新增失败,message={}", e.getMessage());
            return ResultVOUtil.error(ResultVOEnum.ERROR.getCode(), "新增失败");
        }
        return ResultVOUtil.success("保存成功");
    }

    @GetMapping("/excel")
    public String exportExcel(@RequestParam("status") Integer status,HttpServletResponse response) throws IOException, IllegalAccessException, IntrospectionException, InvocationTargetException {
        String fileName ="";
        if(status.equals(0)){
            fileName="报名信息表（未审核）";
        }else if(status.equals(1)){
            fileName="报名信息表（已通过）";
        }else if(status.equals(2)){
            fileName="报名信息表（未通过）";
        }else if(status.equals(3)){
            fileName="报名信息表（已删除）";
        }else if(status.equals(-1)){
            fileName="报名信息总表";
        }
        //填充projects数据
        List<Report> reports = createData(status);
        List<Map<String, Object>> list = createExcelRecord(reports,fileName);
        String columnNames[] = {"序号","项目编号","项目名字", "报名表状态", "学生负责人学号", "学生负责人名字", "学生负责人专业", "学生负责人手机号", "学生负责人email", "学生负责人院系", "学生负责人年级", "学生负责任人QQ", "学生成员1学号", "学生成员1姓名", "学生成员1专业", "学生成员1手机号", "学生成员1email", "学生成员1院系", "学生成员1年级", "学生成员1QQ", "学生成员2学号", "学生成员2名字", "学生成员2专业", "学生成员2手机号", "学生成员2email", "学生成员2院系", "学生成员2年级", "学生成员2QQ", "教师名字", "教师手机号", "教师email", "教师院系", "教师QQ", "申请时间", "更新时间"};//列名
        String keys[] = {"id", "worksNo", "worksName", "reportStatus", "mainStudentNo", "mainStudentName", "mainStudentSpecialty", "mainStudentPhone", "mainStudentEmail", "mainStudentDepartment", "mainStudentGrade", "mainStudentQq", "oneStudentNo", "oneStudentName", "oneStudentSpecialty", "oneStudentPhone", "oneStudentEmail", "oneStudentDepartment", "oneStudentGrade", "oneStudentQq", "twoStudentNo", "twoStudentName", "twoStudentSpecialty", "twoStudentPhone", "twoStudentEmail", "twoStudentDepartment", "twoStudentGrade", "twoStudentQq", "teacherName", "teacherPhone", "teacherEmail", "teacherDepartment", "teacherQq", "createTime", "updateTime"};//map中的key
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            ExcelUtil.createWorkBook(list, keys, columnNames).write(os);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] content = os.toByteArray();
        InputStream is = new ByteArrayInputStream(content);
        // 设置response参数，可以打开下载页面
        response.reset();
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + new String((fileName + ".xls").getBytes(), "iso-8859-1"));
        ServletOutputStream out = response.getOutputStream();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(out);
            byte[] buff = new byte[2048];
            int bytesRead;
            // Simple read/write loop.
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (final IOException e) {
            throw e;
        } finally {
            if (bis != null)
                bis.close();
            if (bos != null)
                bos.close();
        }
        return null;
    }

    private List<Report> createData(Integer status) {
        Report report=new Report();
        if(!status.equals(-1)){
            report.setReportStatus(status);
        }
        return reportService.findAll(report);
    }

    private List<Map<String, Object>> createExcelRecord(List<Report> reports,String sheetName) throws IllegalAccessException, IntrospectionException, InvocationTargetException {
        List<Map<String, Object>> listmap = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("sheetName", sheetName);
        listmap.add(map);
        for (int i=0;i<reports.size();i++) {
            Map<String, Object> mapValue =BeanUtil.convertBean(reports.get(i));
            if(reports.get(i).getReportStatus()==0) mapValue.put("reportStatus","待审核");
            if(reports.get(i).getReportStatus()==1) mapValue.put("reportStatus","已通过");
            if(reports.get(i).getReportStatus()==2) mapValue.put("reportStatus","未通过");
            if(reports.get(i).getReportStatus()==3) mapValue.put("reportStatus","已删除");
            mapValue.put("id",i+1);
            mapValue.put("createTime", DateUtil.date2String(reports.get(i).getCreateTime(),"yyyy/MM/dd HH:mm"));
            mapValue.put("updateTime", DateUtil.date2String(reports.get(i).getUpdateTime(),"yyyy/MM/dd HH:mm"));
            listmap.add(mapValue);
        }
        return listmap;
    }
}
