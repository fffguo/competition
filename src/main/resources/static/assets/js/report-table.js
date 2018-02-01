$(document).ready(function () {
});

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
            }
            if (data.code == 0) {
                Materialize.toast(data.message, 4000);
            }
        },
    });
}

//给模态框赋值
function getReportDetail(reportId) {
    $.ajax({
        type: "get",
        url: projectName + "/report/findOne",
        data: "reportId=" + reportId,
        dataType: "json",
        success: function (data) {
            if (data.code == 1) {
                var report = data.data._report;
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
                if (report.reportStatus == 0) {
                    $("#reportStatus").prev().text("待审核");
                }
                if (report.reportStatus == 1) {
                    $("#reportStatus").prev().text("已通过");
                }
                if (report.reportStatus == 2) {
                    $("#reportStatus").prev().text("未通过");
                }
                if (report.reportStatus == 3) {
                    $("#reportStatus").prev().text("已删除");
                }
                $("#modalCheck").attr("onclick","modalSetStatus("+report.reportId+",2)");
                $("#modalPass").attr("onclick","modalSetStatus("+report.reportId+",1)");
            }
            if (data.code == 0) {
                Materialize.toast(data.message, 4000);
            }
        },
        error: function () {
            alert("f")
        }
    });

}

//时间戳转data
function timestampToTime(timestamp) {
    var date = new Date(timestamp);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
    Y = date.getFullYear() + '-';
    M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';
    D = date.getDate() < 10 ? '0' + date.getDate() +' ' : +date.getDate() +' ';
    h = date.getHours() < 10 ? '0' + date.getHours() + ':' : +date.getHours() + ":";
    m = date.getMinutes() < 10 ? '0' + date.getMinutes() + ':' : +date.getMinutes() + ":";
    s = date.getSeconds() < 10 ? '0' + date.getSeconds()  : +date.getSeconds() ;
    return Y + M + D + h + m + s;
}


