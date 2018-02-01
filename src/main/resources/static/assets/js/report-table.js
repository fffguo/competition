$(document).ready(function () {
});
//设置状态
function setStatus(reportId,status,_this) {
    $.ajax({
        type:"post",
        url:projectName+"/report/status",
        data:"reportId="+reportId+"&status="+status,
        dataType:"json",
        success:function (data) {
            if(data.code==1){
                if(status==1){
                    $(_this).css("color","green");
                    $(_this).next().css("color","black");
                }
                if(status==2){
                    $(_this).css("color","red");
                    $(_this).prev().css("color","black");
                }
                Materialize.toast(data.data, 4000);
            }
            if(data.code==0){
                Materialize.toast(data.message, 4000);
            }
        },
        error:function () {
            alert("f")
        }
    });
}


//设置模态框
function setDataTarget(reportId,_this) {
    $(_this).attr("data-target","#"+reportId);
}

