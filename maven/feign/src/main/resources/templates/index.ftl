﻿<!DOCTYPE html>
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
<div class="main">
    <!-----start-main---->
    ${user}
    <!-----//end-main---->
</div>
<script></script>

</body>
</html>