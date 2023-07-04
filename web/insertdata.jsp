<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registered Successfully!</title>
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
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String areas = request.getParameter("areas");
            String address = request.getParameter("address");
            String address2 = request.getParameter("address2");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String postal = request.getParameter("postal");
            String country = request.getParameter("country");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String firsttime = request.getParameter("firsttime");
            String fee = request.getParameter("papers");
            
            String choosenevent = "";
            String[] event = request.getParameterValues("event");
            for(int i=0;i< event.length;i++){
                choosenevent+=event[i]+", ";
            }
            
            String size = request.getParameter("size");
            
            String participanttype = request.getParameter("participanttype");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/assignment?autoReconnect=true&useSSL=false", "root", "12345");
                Statement stmt = con.createStatement();
                stmt.executeUpdate("insert into assignment.participant (firstname,lastname,area,address,address2,city,state,postal,country,email,phone,firsttime,event,size,participanttype,fee) values ('" + firstname + "','" + lastname + "','" + areas + "','" + address + "','" + address2 + "','" + city + "','" + state + "','" + postal + "','" + country + "','" + email + "','" + phone + "','" + firsttime + "','" + choosenevent + "','" + size + "','" + participanttype + "','" + fee + "')");
                con.close();

            } catch (Exception e) {
                out.print(e);
            }
        %>
    
        <center><h1><p>Conference Online Registration</p></h1>
        <p>Participant Registered Successfully!</p><br/><br/><br/>
        <input type="submit" class="buttonblue" value="Main Register Form" name="GoForm" onclick="window.location='registerform.jsp'"/>
        </center>
    
    </body>
</html>
