<%-- 
    Document   : showTransaction
    Created on : Apr 19, 2017, 5:10:36 PM
    Author     : martin
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>
            Este es el registro de la transacción Nro: ${dtx.id}
        </p>
        
        <p>
            <strong>Esta es la parte A:</strong>
            <br/>
            ${dtx.partA}
        </p>
        <p>
            <strong>Esta es la parte B:</strong>
            <br/>
            ${dtx.partB}
        </p>
        <p>
            <strong>Esta es la parte C:</strong>
            <br/>
            ${dtx.partC}
        </p>
        <p>
            <strong>Esta es la parte E:</strong>
            <br/>
            ${dtx.partE}
        </p>
        <p>
            <strong>Esta es la parte F:</strong>
            <br/>
            ${dtx.partF}
        </p>
        <p>
            <strong>Esta es la parte H:</strong>
            <br/>
            ${dtx.partH}
        </p>
        <p>
            <strong>Esta es la parte Z:</strong>
            <br/>
            ${dtx.partZ}
        </p>
    </body>
</html>
