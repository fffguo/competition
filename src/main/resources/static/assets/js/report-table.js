$(document).ready(function () {
})

//设置状态
function setStatus(reportId, status, _this) {
    $.ajax({
        type: "post",
        url: projectName + "/report/setStatus",
        data: "reportId=" + reportId + "&status=" + status,
        dataType: "json",
        success: function (data) {
            if (data.code == 1) {
                if (status == 1) {
                    $(_this).css("color", "green");
                    $(_this).next().css("color", "black");
                }
                if (status == 2) {
                    $(_this).css("color", "red");
                    $(_this).prev().css("color", "black");
                }
                Materialize.toast(data.data, 4000);
            }
            if (data.code == 0) {
                Materialize.toast(data.message, 4000);
            }
        },
    });
}

//modal设置状态
function modalSetStatus(reportId, status) {
    $.ajax({
        type: "post",
        url: projectName + "/report/setStatus",
        data: "reportId=" + reportId + "&status=" + status,
        dataType: "json",
        success: function (data) {
            if (data.code == 1) {
                Materialize.toast(data.data, 4000);
                setIconColor(status,reportId)
            }
            if (data.code == 0) {
                Materialize.toast(data.message, 4000);
            }
        },
    });
}

//modal保存详情模板
function baseSave(reportStatus) {
    $("#edit").attr("data-dismiss","modal");

    var reportId = $("#modalReportId").val();
    var worksName = $("#worksName").val();
    var worksNo = $("#worksNo").val();
    var teacherName = $("#teacherName").val();
    var teacherDepartment = $("#teacherDepartment").val();
    var teacherPhone = $("#teacherPhone").val();
    var teacherEmail = $("#teacherEmail").val();
    var teacherQq = $("#teacherQq").val();
    var mainStudentNo = $("#mainStudentNo").val();
    var mainStudentName = $("#mainStudentName").val();
    var mainStudentGrade = $("#mainStudentGrade").val();
    var mainStudentSpecialty = $("#mainStudentSpecialty").val();
    var mainStudentDepartment = $("#mainStudentDepartment").val();
    var mainStudentPhone = $("#mainStudentPhone").val();
    var mainStudentEmail = $("#mainStudentEmail").val();
    var mainStudentQq = $("#mainStudentQq").val();
    var oneStudentNo = $("#oneStudentNo").val();
    var oneStudentName = $("#oneStudentName").val();
    var oneStudentGrade = $("#oneStudentGrade").val();
    var oneStudentSpecialty = $("#oneStudentSpecialty").val();
    var oneStudentDepartment = $("#oneStudentDepartment").val();
    var oneStudentPhone = $("#oneStudentPhone").val();
    var oneStudentEmail = $("#oneStudentEmail").val();
    var oneStudentQq = $("#oneStudentQq").val();
    var twoStudentNo = $("#twoStudentNo").val();
    var twoStudentName = $("#twoStudentName").val();
    var twoStudentGrade = $("#twoStudentGrade").val();
    var twoStudentSpecialty = $("#twoStudentSpecialty").val();
    var twoStudentDepartment = $("#twoStudentDepartment").val();
    var twoStudentPhone = $("#twoStudentPhone").val();
    var twoStudentEmail = $("#twoStudentEmail").val();
    var twoStudentQq = $("#twoStudentQq").val();
    $.ajax({
        type: "post",
        url: projectName + "/report/update",
        data: "reportId=" + reportId + "&worksName=" + worksName
        + "&worksNo=" + worksNo + "&teacherName=" + teacherName
        + "&teacherDepartment=" + teacherDepartment + "&teacherPhone=" + teacherPhone
        + "&teacherEmail=" + teacherEmail + "&teacherQq=" + teacherQq
        + "&mainStudentNo=" + mainStudentNo + "&mainStudentName=" + mainStudentName
        + "&mainStudentGrade=" + mainStudentGrade + "&mainStudentSpecialty=" + mainStudentSpecialty
        + "&mainStudentDepartment=" + mainStudentDepartment + "&mainStudentPhone=" + mainStudentPhone
        + "&mainStudentEmail=" + mainStudentEmail + "&mainStudentQq=" + mainStudentQq
        + "&oneStudentNo=" + oneStudentNo + "&oneStudentName=" + oneStudentName
        + "&oneStudentGrade=" + oneStudentGrade + "&oneStudentSpecialty=" + oneStudentSpecialty
        + "&oneStudentDepartment=" + oneStudentDepartment + "&oneStudentPhone=" + oneStudentPhone
        + "&oneStudentEmail=" + oneStudentEmail + "&oneStudentQq=" + oneStudentQq
        + "&twoStudentNo=" + twoStudentNo + "&twoStudentName=" + twoStudentName
        + "&twoStudentGrade=" + twoStudentGrade + "&twoStudentSpecialty=" + twoStudentSpecialty
        + "&twoStudentDepartment=" + twoStudentDepartment + "&twoStudentPhone=" + twoStudentPhone
        + "&twoStudentEmail=" + twoStudentEmail + "&twoStudentQq=" + twoStudentQq
        + "&reportStatus=" + reportStatus ,
        dataType: "json",
        success: function (data) {
            if(data.code==1){
                Materialize.toast(data.data, 4000);
            }
            if (data.code==0){
                Materialize.toast(data.message, 4000);
            }
            editCancel();
        },
    });
}
//modal保存并通过
function saveAndPass() {
    baseSave(1);
}
//modal保存详情
function save() {
    var reportStatus = $("#reportStatus").val();
    if (reportStatus == "待审核") reportStatus = 0;
    if (reportStatus == "已通过") reportStatus = 1;
    if (reportStatus == "未通过") reportStatus = 2;
    if (reportStatus == "已删除") reportStatus = 3;
    baseSave(reportStatus);//执行保存
}

//modal开始查看详情
function road(reportId) {
    addValueSpan(reportId);//modal赋值span
    edit2Read(reportId);//modal按钮转换，编辑转预览
}

//modal开始编辑详情
function edit() {
    addValueInput();//赋值input
    showInput();//显示input
    delSpan();//清空span
    read2Edit();//按钮预览转编辑
}

//modal赋值input
function addValueInput() {
    var reportId = $("#modalReportId").val();
    $.ajax({
        type: "get",
        url: projectName + "/report/findOne",
        data: "reportId=" + reportId,
        dataType: "json",
        success: function (data) {
            if (data.code == 1) {
                var report = data.data._report;
                $("#modalTitle").val(report.worksName);
                $("#worksName").val(report.worksName);
                $("#worksNo").val(report.worksNo);
                $("#createTime").val(timestampToTime(report.createTime));
                $("#updateTime").val(timestampToTime(report.updateTime));
                $("#teacherName").val(report.teacherName);
                $("#teacherDepartment").val(report.teacherDepartment);
                $("#teacherPhone").val(report.teacherPhone);
                $("#teacherEmail").val(report.teacherEmail);
                $("#teacherQq").val(report.teacherQq);
                $("#mainStudentNo").val(report.mainStudentNo);
                $("#mainStudentName").val(report.mainStudentName);
                $("#mainStudentGrade").val(report.mainStudentGrade);
                $("#mainStudentSpecialty").val(report.mainStudentSpecialty);
                $("#mainStudentDepartment").val(report.mainStudentDepartment);
                $("#mainStudentPhone").val(report.mainStudentPhone);
                $("#mainStudentEmail").val(report.mainStudentEmail);
                $("#mainStudentQq").val(report.mainStudentQq);
                $("#oneStudentNo").val(report.oneStudentNo);
                $("#oneStudentName").val(report.oneStudentName);
                $("#oneStudentGrade").val(report.oneStudentGrade);
                $("#oneStudentSpecialty").val(report.oneStudentSpecialty);
                $("#oneStudentDepartment").val(report.oneStudentDepartment);
                $("#oneStudentPhone").val(report.oneStudentPhone);
                $("#oneStudentEmail").val(report.oneStudentEmail);
                $("#oneStudentQq").val(report.oneStudentQq);
                $("#twoStudentNo").val(report.twoStudentNo);
                $("#twoStudentName").val(report.twoStudentName);
                $("#twoStudentGrade").val(report.twoStudentGrade);
                $("#twoStudentSpecialty").val(report.twoStudentSpecialty);
                $("#twoStudentDepartment").val(report.twoStudentDepartment);
                $("#twoStudentPhone").val(report.twoStudentPhone);
                $("#twoStudentEmail").val(report.twoStudentEmail);
                $("#twoStudentQq").val(report.twoStudentQq);
                if (report.reportStatus == 0) $("#reportStatus").val("待审核");
                if (report.reportStatus == 1) $("#reportStatus").val("已通过");
                if (report.reportStatus == 2) $("#reportStatus").val("未通过");
                if (report.reportStatus == 3) $("#reportStatus").val("已删除");
            }
            if (data.code == 0) {
                Materialize.toast(data.message, 4000);
            }
        },
    });
}

//modal显示input
function showInput() {
    $("#worksName").attr("type", "text");
    $("#worksNo").attr("type", "text");
    $("#createTime").attr("type", "text");
    $("#updateTime").attr("type", "text");
    $("#teacherName").attr("type", "text");
    $("#teacherDepartment").attr("type", "text");
    $("#teacherPhone").attr("type", "text");
    $("#teacherEmail").attr("type", "text");
    $("#teacherQq").attr("type", "text");
    $("#mainStudentNo").attr("type", "text");
    $("#mainStudentName").attr("type", "text");
    $("#mainStudentGrade").attr("type", "text");
    $("#mainStudentSpecialty").attr("type", "text");
    $("#mainStudentDepartment").attr("type", "text");
    $("#mainStudentPhone").attr("type", "text");
    $("#mainStudentEmail").attr("type", "text");
    $("#mainStudentQq").attr("type", "text");
    $("#oneStudentNo").attr("type", "text");
    $("#oneStudentName").attr("type", "text");
    $("#oneStudentGrade").attr("type", "text");
    $("#oneStudentSpecialty").attr("type", "text");
    $("#oneStudentDepartment").attr("type", "text");
    $("#oneStudentPhone").attr("type", "text");
    $("#oneStudentEmail").attr("type", "text");
    $("#oneStudentQq").attr("type", "text");
    $("#twoStudentNo").attr("type", "text");
    $("#twoStudentName").attr("type", "text");
    $("#twoStudentGrade").attr("type", "text");
    $("#twoStudentSpecialty").attr("type", "text");
    $("#twoStudentDepartment").attr("type", "text");
    $("#twoStudentPhone").attr("type", "text");
    $("#twoStudentEmail").attr("type", "text");
    $("#twoStudentQq").attr("type", "text");
    $("#reportStatus").attr("type", "text");
}

//modal隐藏input
function hideInput() {
    $("#worksName").attr("type", "hidden");
    $("#worksNo").attr("type", "hidden");
    $("#createTime").attr("type", "hidden");
    $("#updateTime").attr("type", "hidden");
    $("#teacherName").attr("type", "hidden");
    $("#teacherDepartment").attr("type", "hidden");
    $("#teacherPhone").attr("type", "hidden");
    $("#teacherEmail").attr("type", "hidden");
    $("#teacherQq").attr("type", "hidden");
    $("#mainStudentNo").attr("type", "hidden");
    $("#mainStudentName").attr("type", "hidden");
    $("#mainStudentGrade").attr("type", "hidden");
    $("#mainStudentSpecialty").attr("type", "hidden");
    $("#mainStudentDepartment").attr("type", "hidden");
    $("#mainStudentPhone").attr("type", "hidden");
    $("#mainStudentEmail").attr("type", "hidden");
    $("#mainStudentQq").attr("type", "hidden");
    $("#oneStudentNo").attr("type", "hidden");
    $("#oneStudentName").attr("type", "hidden");
    $("#oneStudentGrade").attr("type", "hidden");
    $("#oneStudentSpecialty").attr("type", "hidden");
    $("#oneStudentDepartment").attr("type", "hidden");
    $("#oneStudentPhone").attr("type", "hidden");
    $("#oneStudentEmail").attr("type", "hidden");
    $("#oneStudentQq").attr("type", "hidden");
    $("#twoStudentNo").attr("type", "hidden");
    $("#twoStudentName").attr("type", "hidden");
    $("#twoStudentGrade").attr("type", "hidden");
    $("#twoStudentSpecialty").attr("type", "hidden");
    $("#twoStudentDepartment").attr("type", "hidden");
    $("#twoStudentPhone").attr("type", "hidden");
    $("#twoStudentEmail").attr("type", "hidden");
    $("#twoStudentQq").attr("type", "hidden");
    $("#reportStatus").attr("type", "hidden");
}

//modal赋值span
function addValueSpan(reportId) {
    $.ajax({
        type: "get",
        url: projectName + "/report/findOne",
        data: "reportId=" + reportId,
        dataType: "json",
        success: function (data) {
            if (data.code == 1) {
                var report = data.data._report;
                $("#modalReportId").val(report.reportId);
                $("#modalTitle").text(report.worksName);
                $("#worksName").prev().text(report.worksName);
                $("#worksNo").prev().text(report.worksNo);
                $("#createTime").prev().text(timestampToTime(report.createTime));
                $("#updateTime").prev().text(timestampToTime(report.updateTime));
                $("#teacherName").prev().text(report.teacherName);
                $("#teacherDepartment").prev().text(report.teacherDepartment);
                $("#teacherPhone").prev().text(report.teacherPhone);
                $("#teacherEmail").prev().text(report.teacherEmail);
                $("#teacherQq").prev().text(report.teacherQq);
                $("#mainStudentNo").prev().text(report.mainStudentNo);
                $("#mainStudentName").prev().text(report.mainStudentName);
                $("#mainStudentGrade").prev().text(report.mainStudentGrade);
                $("#mainStudentSpecialty").prev().text(report.mainStudentSpecialty);
                $("#mainStudentDepartment").prev().text(report.mainStudentDepartment);
                $("#mainStudentPhone").prev().text(report.mainStudentPhone);
                $("#mainStudentEmail").prev().text(report.mainStudentEmail);
                $("#mainStudentQq").prev().text(report.mainStudentQq);
                $("#oneStudentNo").prev().text(report.oneStudentNo);
                $("#oneStudentName").prev().text(report.oneStudentName);
                $("#oneStudentGrade").prev().text(report.oneStudentGrade);
                $("#oneStudentSpecialty").prev().text(report.oneStudentSpecialty);
                $("#oneStudentDepartment").prev().text(report.oneStudentDepartment);
                $("#oneStudentPhone").prev().text(report.oneStudentPhone);
                $("#oneStudentEmail").prev().text(report.oneStudentEmail);
                $("#oneStudentQq").prev().text(report.oneStudentQq);
                $("#twoStudentNo").prev().text(report.twoStudentNo);
                $("#twoStudentName").prev().text(report.twoStudentName);
                $("#twoStudentGrade").prev().text(report.twoStudentGrade);
                $("#twoStudentSpecialty").prev().text(report.twoStudentSpecialty);
                $("#twoStudentDepartment").prev().text(report.twoStudentDepartment);
                $("#twoStudentPhone").prev().text(report.twoStudentPhone);
                $("#twoStudentEmail").prev().text(report.twoStudentEmail);
                $("#twoStudentQq").prev().text(report.twoStudentQq);
                if (report.reportStatus == 0)
                    $("#reportStatus").prev().text("待审核");
                if (report.reportStatus == 1)
                    $("#reportStatus").prev().text("已通过");
                if (report.reportStatus == 2)
                    $("#reportStatus").prev().text("未通过");
                if (report.reportStatus == 3)
                    $("#reportStatus").prev().text("已删除");
            }
            if (data.code == 0) {
                Materialize.toast(data.message, 4000);
            }
        },
    });

}

//modal清空span
function delSpan() {
    $("#worksName").prev().text("");
    $("#worksNo").prev().text("");
    $("#createTime").prev().text("");
    $("#updateTime").prev().text("");
    $("#teacherName").prev().text("");
    $("#teacherDepartment").prev().text("");
    $("#teacherPhone").prev().text("");
    $("#teacherEmail").prev().text("");
    $("#teacherQq").prev().text("");
    $("#mainStudentNo").prev().text("");
    $("#mainStudentName").prev().text("");
    $("#mainStudentGrade").prev().text("");
    $("#mainStudentSpecialty").prev().text("");
    $("#mainStudentDepartment").prev().text("");
    $("#mainStudentPhone").prev().text("");
    $("#mainStudentEmail").prev().text("");
    $("#mainStudentQq").prev().text("");
    $("#oneStudentNo").prev().text("");
    $("#oneStudentName").prev().text("");
    $("#oneStudentGrade").prev().text("");
    $("#oneStudentSpecialty").prev().text("");
    $("#oneStudentDepartment").prev().text("");
    $("#oneStudentPhone").prev().text("");
    $("#oneStudentEmail").prev().text("");
    $("#oneStudentQq").prev().text("");
    $("#twoStudentNo").prev().text("");
    $("#twoStudentName").prev().text("");
    $("#twoStudentGrade").prev().text("");
    $("#twoStudentSpecialty").prev().text("");
    $("#twoStudentDepartment").prev().text("");
    $("#twoStudentPhone").prev().text("");
    $("#twoStudentEmail").prev().text("");
    $("#twoStudentQq").prev().text("");
    $("#reportStatus").prev().text("");
}

//modal按钮转换，编辑转预览
function edit2Read(reportId) {
    $("#edit").text("编辑");
    $("#edit").attr("onclick", "edit()");
    $("#edit").removeAttr("data-dismiss");
    $("#modalCheck").attr("onclick", "modalSetStatus(" + reportId + ",2)");
    $("#modalCheck").attr("class", "btn btn-danger");
    $("#modalCheck").text("拒绝");
    $("#modalPass").attr("onclick", "modalSetStatus(" + reportId + ",1)");
    $("#modalPass").text("通过");
    $("#modalClose").text("关闭");
    $("#modalClose").attr("onclick", "");
}

//modal按钮转换，预览转编辑
function read2Edit() {
    $("#edit").text("保存");
    $("#edit").attr("onclick", "save()");
    $("#modalCheck").attr("onclick", "save()");
    $("#modalCheck").attr("class", "btn btn-info");
    $("#modalCheck").text("保存");
    $("#modalPass").attr("onclick", "saveAndPass()");
    $("#modalPass").text("保存并通过");
    $("#modalClose").text("取消");
    $("#modalClose").attr("onclick", "editCancel()");
    $("#modalCloseRightTop").attr("onclick", "editCancel()")
}

//modal取消编辑
function editCancel() {
    hideInput();
    edit2Read();
}

//导出excel
function exportExcel(status){
    window.open(projectName+"/report/excel?status="+status);
}



//时间戳转data
function timestampToTime(timestamp) {
    var date = new Date(timestamp);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
    Y = date.getFullYear() + '-';
    M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';
    D = date.getDate() < 10 ? '0' + date.getDate() + ' ' : +date.getDate() + ' ';
    h = date.getHours() < 10 ? '0' + date.getHours() + ':' : +date.getHours() + ":";
    m = date.getMinutes() < 10 ? '0' + date.getMinutes() + ':' : +date.getMinutes() + ":";
    s = date.getSeconds() < 10 ? '0' + date.getSeconds() : +date.getSeconds();
    return Y + M + D + h + m + s;
}


