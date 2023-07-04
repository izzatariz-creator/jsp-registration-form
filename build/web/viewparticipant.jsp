<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Participant</title>
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
            
            p .warning{
                font-family:Arial;
                margin-bottom: -3px;
                margin-top: -3px;
                color:red;
            }

            .buttongreen {
                background-color: #4CAF50;
                border: none;
                color: white;
                padding: 15px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                margin: 4px 2px;
                cursor: pointer;
                width: 160px;
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
            
            .buttongray {
                background-color: #ABABAB;
                border: none;
                color: white;
                padding: 15px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                margin: 4px 2px;
                cursor: pointer;
                width: 160px;
            }

            input[type=text] {
                width: 95%;
                padding: 12px 20px;
                margin: 8px 0;
                box-sizing: border-box;
                border: 1px solid #555;
                border-radius: 4px;
            }
            
            input[type=email] {
                width: 95%;
                padding: 12px 20px;
                margin: 8px 0;
                box-sizing: border-box;
                border: 1px solid #555;
                border-radius: 4px;
            }


            select{
                width: 47%;
                height: 45px;
                box-sizing: border-box;
                border: 1px solid #555;
                border-radius: 4px;
            }

            select2{
                width: 5%;
                padding: 12px 20px;
                box-sizing: border-box;
                border: 1px solid #555;
                border-radius: 4px;
            }
        </style>
    </head>
    <body>
        <%

            String ppt = request.getParameter("type");

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/assignment?autoReconnect=true&useSSL=false", "root", "12345");
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(ppt);

        %>
        <table border=1 align="left" style="text-align:left">
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Area</th>
                <th>Street Address</th>
                <th>Street Address 2</th>
                <th>City</th>
                <th>State / Province</th>
                <th>Postal/Zip Code</th>
                <th>Country</th>
                <th>Email</th>
                <th>Phone Number</th>
                <th>First Time</th>
                <th>Event To Attend</th>
                <th>T-Shirt Size</th>
                <th>Registration Type</th>
                <th>Fee</th>
            </tr>
            <%                    while (rs.next()) {
                    String fname = rs.getString("firstname");
                    String lname = rs.getString("lastname");
                    String area = rs.getString("area");
                    String add = rs.getString("address");
                    String add2 = rs.getString("address2");
                    String city = rs.getString("city");
                    String state = rs.getString("state");
                    String postal = rs.getString("postal");
                    String country = rs.getString("country");
                    String email = rs.getString("email");
                    String phone = rs.getString("phone");
                    String firsttime = rs.getString("firsttime");
                    String event = rs.getString("event");
                    String size = rs.getString("size");
                    String registrationtype = rs.getString("participanttype");  
                    String fee = rs.getString("fee");
            %>

            <tr>
                <td><%=fname%></td>
                <td><%=lname%></td>
                <td><%=area%></td>
                <td><%=add%></td>
                <td><%=add2%></td>
                <td><%=city%></td>
                <td><%=state%></td>
                <td><%=postal%></td>
                <td><%=country%></td>
                <td><%=email%></td>
                <td><%=phone%></td>
                <td><%=firsttime%></td>
                <td><%=event%></td>
                <td><%=size%></td>
                <td><%=registrationtype%></td>
                <td><%=fee%></td>
            </tr>


            <%
                        }%>
        </table>
        <p><input type="submit" class="buttonblue" value="Back" onclick="window.location='search.jsp'" name="GoBack" style="margin-top: 100px;margin-right: 1000px;"/></p>
        <%
                    con.close();

                } catch (Exception e) {
                    out.print(e);
}

        %>
       
    </body>
    
     
</html>
