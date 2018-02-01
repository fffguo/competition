package com.example.competition.controller;

import com.example.competition.VO.ResultVO;
import com.example.competition.dao.entity.Report;
import com.example.competition.enums.ErrorEnum;
import com.example.competition.enums.ResultVOEnum;
import com.example.competition.exception.CompetitionException;
import com.example.competition.service.ReportService;
import com.example.competition.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * @作者：刘富国
 * @创建时间：2018/1/30 9:07
 */
@Slf4j
@Controller
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/report/{status}")
    public String getReportList(@PathVariable Integer status, ModelMap modelMap) {
        Report report = new Report();
        report.setReportStatus(status);
        modelMap.put("reportList", reportService.findAll(report));
        modelMap.put("status",status);
        modelMap.put("reportTableClass"+status,"active-menu");
        modelMap.put("reportTableClass","waves-effect waves-dark active-menu");
        return "/reportTable";
    }

    @PostMapping("/report/status")
    @ResponseBody
    public ResultVO<String> setStatus(@RequestParam(value = "reportId") Integer reportId, @RequestParam("status") Integer status) {
        Report report=reportService.findOne(reportId);
        if(report==null){
            log.error("【更改报名状态】，报名信息不存在：reportId={}",reportId);
            return ResultVOUtil.error(ResultVOEnum.ERROR.getCode(),"报名信息不存在");
        }
        if(status!=1&&status!=0&&status!=2&&status!=3){
            log.error("【更改报名状态】，状态非法：reportId={}，status={}",reportId,status);
            return ResultVOUtil.error(ResultVOEnum.ERROR.getCode(),"更改的状态非法");
        }
        if(report.getReportStatus()==status){
            log.error("【更改报名状态】，状态非法：reportId={}，status={}",reportId,status);
            return ResultVOUtil.error(ResultVOEnum.ERROR.getCode(),"请不要重复操作");
        }
        report.setReportStatus(status);
        report=reportService.save(report);
        if(report==null){
            log.error("【更改报名状态】，更新状态失败：reportId={}，status={}",reportId,status);
            return ResultVOUtil.error(ResultVOEnum.ERROR.getCode(),"更改失败");
        }
        if(status==1){
            return ResultVOUtil.success(report.getWorksName()+"已通过");
        }else if(status==2){
            return ResultVOUtil.success(report.getWorksName()+"已拒绝");
        }else if(status==3){
            return ResultVOUtil.success(report.getWorksName()+"删除成功");
        }
        return null;
    }



}
