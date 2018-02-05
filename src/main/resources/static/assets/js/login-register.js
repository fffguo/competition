var pathName=window.document.location.pathname;
var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
var loginVerify1=false;
var loginVerify2=false;

//登录，验证loginName
function loginVerifyLoginName() {
    if($("#username").val().trim()==""){
        $("#username").next().attr("data-error","wrong");
    }else{
        $("#username").next().attr("data-success","success");
        loginVerify1=true;
    }
}
//登录，验证password
function loginVerifyPassword() {
    if($("#password").val().trim()==""){
        $("#password").next().attr("data-error","wrong");
    }else{
        $("#password").next().attr("data-success","success");
        loginVerify2=true;
    }
}

//登录
function login() {
    loginVerifyPassword();
    loginVerifyLoginName();
    if((loginVerify1==true&&loginVerify2==true)){
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
