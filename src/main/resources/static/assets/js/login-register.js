var pathName=window.document.location.pathname;
var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
var loginVerify1=false;
var loginVerify2=false;
// var registerVerify1=false;
// var registerVerify2=false;
// var registerVerify3=false;
var tip="";


$(document).ready(function () {
    // $("#logout").attr("href",projectName+"/logout");
});

//隐藏提示小图
function hideIcon() {
    $(".icon").hide();
}

//登录，验证loginName
function loginVerifyLoginName() {
    if($("#loginOne").val().trim()==""){
        addIcon("false","login","1");
        loginVerify1=false;
        tip="学号不能为空！";
    }else{
        addIcon("true","login","1");
        loginVerify1=true;
    }
}
//登录，验证password
function loginVerifyPassword() {
    if($("#loginTwo").val().trim()==""){
        addIcon("false","login","2");
        loginVerify2=false;
        tip="密码不能为空！";
    }else{
        addIcon("true","login","2");
        loginVerify2=true;
    }
}
//登录
function login() {
    loginVerifyPassword();
    loginVerifyLoginName();
    if(!(loginVerify1==true&&loginVerify2==true)){
        alert(tip);
    } else {
        $("#loginForm").submit();
    }
}

//注册 ，验证loginName是否可用
// function verifyLoginName() {
//     var loginName = $("#registerMail").val();
//     var regEmail = /^([a-zA-Z0-9_.-]+)@([da-z.-]+).([a-z.]{2,6})$/;
//     if (!regEmail.test(loginName)) {
//         addIcon("false", "register", "1");
//         registerVerify1=false;
//         tip="请输入正确的电子邮箱格式";
//     } else {
//         //异步验证loginName是否可用
//         $.ajax({
//             type:"post",
//             url:projectName+"/register/verify/loginName",
//             data:"loginName="+loginName,
//             dataType:"json",
//             success:function (data) {
//                 if(data.data==1){
//                     addIcon("true", "register", "1");
//                     registerVerify1=true;
//                 }else{
//                     addIcon("false", "register", "1");
//                     registerVerify1=false;
//                     tip="邮箱已被注册！";
//                 }
//             },
//         });
//     }
// }
// //注册，验证密码是否符合密码复杂度要求
// function verifyPassword1() {
//     var password=$("#registerPassword1").val();
//     var regPassword = /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,16}$/;//6到16位数字与字母组合
//     if(!regPassword.test(password)){
//         addIcon("false", "register", "2");
//         registerVerify2=false;
//         tip="请输入6-16位，数字与字母组合的密码！";
//     }else{
//         addIcon("true", "register", "2");
//         registerVerify2=true;
//     }
// }
// //注册，校验第二个密码
// function verifyPassword2() {
//     if($("#registerPassword1").val()==$("#registerPassword2").val()&&$("#registerPassword1").val()!=""){
//         addIcon("true", "register", "3");
//         registerVerify3=true;
//     }else{
//         addIcon("false", "register", "3");
//         registerVerify3=false;
//         tip="两次密码输入不一致！";
//     }
// }
// //注册
// function register() {
//     verifyPassword2();
//     verifyPassword1();
//     verifyLoginName();
//     if(registerVerify1==true&&registerVerify2==true&&registerVerify3==true){
//         $.ajax({
//
//         });
//     }else{
//         alert(tip);
//     }
// }


//  错误/正确，登录/注册，小图位置
function addIcon(status, loginOrRegister, number) {
    if (loginOrRegister == "login") {
        if (status == "true") {
            if (number == "1") {
                $("#loginIcon1").find("img").attr("src", "assets/img/trueIcon.png");
                $("#loginIcon1").show();
            } else if (number == "2") {
                $("#loginIcon2").find("img").attr("src", "assets/img/trueIcon.png");
                $("#loginIcon2").show();
            }
        } else if (status == "false") {
            if (number == "1") {
                $("#loginIcon1").find("img").attr("src", "assets/img/errorIcon.png");
                $("#loginIcon1").show();
            } else if (number == "2") {
                $("#loginIcon2").find("img").attr("src", "assets/img/errorIcon.png");
                $("#loginIcon2").show();
            }
        }
    } else if (loginOrRegister == "register") {
        if (status == "true") {
            if (number == "1") {
                $("#registerIcon1").find("img").attr("src", "assets/img/trueIcon.png");
                $("#registerIcon1").show();
            } else if (number == "2") {
                $("#registerIcon2").find("img").attr("src", "assets/img/trueIcon.png");
                $("#registerIcon2").show();
            } else if (number == "3") {
                $("#registerIcon3").find("img").attr("src", "assets/img/trueIcon.png");
                $("#registerIcon3").show();
            }
        } else if (status == "false") {
            if (number =="1") {
                $("#registerIcon1").find("img").attr("src", "assets/img/errorIcon.png");
                $("#registerIcon1").show();
            } else if (number == "2") {
                $("#registerIcon2").find("img").attr("src", "assets/img/errorIcon.png");
                $("#registerIcon2").show();
            } else if (number == "3") {
                $("#registerIcon3").find("img").attr("src", "assets/img/errorIcon.png");
                $("#registerIcon3").show();
            }
        }
    }

}
