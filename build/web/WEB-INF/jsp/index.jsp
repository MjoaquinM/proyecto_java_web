<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        
        <p>
            <a href="stopApache.htm">Apache STOP</a>
        </p>
        <p>
            <a href="startApache.htm">Apache START</a>
        </p>
        <p>
            <a href="reloadApache.htm">Apache RELOAD</a>
        </p>
        
        <form action="showTransaction.htm">
            <input type="text" name="id"/>
            <input type="submit" value="Buscar"/>
        </form>
        
        <p>
            <a href="adminModSecurity.htm">Admin ModSecurity</a>
        </p>
        
    </body>
</html>
