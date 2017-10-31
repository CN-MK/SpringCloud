<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <#assign ctx=springMacroRequestContext.getContextPath()/>
    <link href="${ctx}/css/style.css" rel='stylesheet' type='text/css'/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);

    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
</head>
<body>
<div class="login">
    <div class="login-top">
        <h1>Resigter</h1>
        <form>
            <input type="text" class="text" value="Name" onfocus="this.value = '';"
                   onblur="if (this.value == '') {this.value = 'Name';}" id="active">

            <input type="password" class="text" value="Password" onfocus="this.value = '';"
                   onblur="if (this.value == '') {this.value = 'Password';}">

            <input type="text" class="text" value="your@email.com " onfocus="this.value = '';"
                   onblur="if (this.value == '') {this.value = 'your@email.com ';}">

            <input type="text" class="text" value="Mobile" onfocus="this.value = '';"
                   onblur="if (this.value == '') {this.value = 'Mobile ';}">
        </form>
        <div class="forgot"></div>
        <h3>By creating an account, you agree to our <span><a href="#">Terms & Conditions</a> <span></h3>
    </div>
        <div class="login-bottom">
            <h3><a href="/insertParam">Create account</a></h3>
        </div>

</div>
</body>
</html>