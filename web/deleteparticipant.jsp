<%-- 
    Document   : deleteparticipant
    Created on : Apr 18, 2022, 2:53:15 PM
    Author     : izzat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Participant</title>
        <%@page import="java.sql.*;" %>
        <style>
            p{
                font-family:Arial;
                margin-bottom: -3px;
                margin-top: -3px;
            }

            p2{
                font-family:Arial;
                font-size: 12px;
                margin-bottom: -3px;
            }

            p3{
                font-family:Arial;
                margin-bottom: -3px;
                margin-top: -3px;
                text-align: right;
            }
            
            .buttonblue {
                background-color: #007AFF;
                border: none;
                color: white;
                padding: 15px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                margin: 4px 2px;
                cursor: pointer;
            }
        </style>
    </head>
    <body>
        <%
            String name = request.getParameter("participantname");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/assignment?autoReconnect=true&useSSL=false", "root", "12345");
                Statement stmt = con.createStatement();
                stmt.executeUpdate("DELETE FROM assignment.participant WHERE firstname='" + name + "'");
                con.close();

            } catch (Exception e) {
                out.print(e);
            }
        %>
    
        <center><h1><p>Conference Online Registration</p></h1>
        <p>Participant Deleted Successfully!</p><br/><br/><br/>
        <input type="submit" class="buttonblue" value="Main Register Form" name="GoForm" onclick="window.location='registerform.jsp'"/>
        </center>
    
    </body>
</html>
