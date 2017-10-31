<!DOCTYPE HTML>
<html>
<head>
    <title>Login</title>
<#assign ctx=springMacroRequestContext.getContextPath()/>
    <!-- Custom Theme files -->
    <link href="${ctx}/css/style.css" rel="stylesheet" type="text/css" media="all"/>
    <!-- Custom Theme files -->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords"
          content="Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
    <!--Google Fonts-->
    <link href='http://fonts.useso.com/css?family=Roboto:500,900italic,900,400italic,100,700italic,300,700,500italic,100italic,300italic,400'
          rel='stylesheet' type='text/css'>
    <link href='http://fonts.useso.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet'
          type='text/css'>
    <!--Google Fonts-->
</head>
<body>
<div class="login">
    <div class="login-top">
        <h1>LOGIN FORM</h1>
        <form method="post" action="/verifyUser" onsubmit="return check_form(this);">
            <input type="text" placeholder="Username" name="username" onfocus="this.placeholder = '';"
                   onblur="this.placeholder = 'Username';">

            <input type="password" placeholder="password" name="password" onfocus="this.placeholder = '';"
                   onblur="this.placeholder = 'password';">

            <div class="forgot">
                <a href="#">forgot Password</a>
                <input type="submit" value="Login">
            </div>
        </form>
    </div>
    <div class="login-bottom">
        <h3>New User &nbsp;<a href="/register">Register</a>&nbsp Here</h3>
    </div>
    <div>
    ${user}
    </div>
</div>
</body>
<script type="text/javascript">
    function validate_required(field, alerttxt) {
        with (field) {
            if (value == null || value == "") {
                alert(alerttxt);
                return false
            }
            else {
                return true
            }
        }
    }

    function check_form(thisform) {
        with (thisform) {
            if (validate_required(username, "Username must be filled out!") == false) {
                username.focus();
                return false
            }if  (validate_required(password, "password must be filled out!") == false) {
                password.focus();
                return false
            }
        }
    }
</script>
</html>