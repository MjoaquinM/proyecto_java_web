<%-- 
    Document   : adminModSecurity
    Created on : Apr 19, 2017, 10:52:18 PM
    Author     : martin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><strong>Página de administración</strong></h1>
        
        <form action="setVariables.htm">
            <select id="SecRuleEngine" name="SecRuleEngine">
                <option value="On">On</option>
                <option value="DetectionOnly">DetectionOnly</option>
                <option value="Off">Off</option>
            </select>
            <input type="submit" value="Aplicar"/>
        </form>
        ${sel}
        <h1>El ModSecurity.conf es:</h1>
        ${msc}
    </body>
</html>
