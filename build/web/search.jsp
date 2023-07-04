<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Tool</title>
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
                width: 160px;
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
            
            .buttonred {
                background-color: #de1212;
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

        <div id='formDiv1' style='width:48%; height:300px; padding-left: 30px; padding-top: 30px;'>

            <div id='viewtool'><strong><p>Search Tool</p></strong><br/>

                <form action="viewparticipant.jsp">

                    <p><input type="radio" name="type" value="SELECT * FROM assignment.participant">
                        <label for="all">View All Participant</label><br>
                        <input type="radio" name="type" value="SELECT * FROM assignment.participant WHERE participanttype='Student'">
                        <label for="student">View Student Participants</label><br>
                        <input type="radio" name="type" value="SELECT * FROM assignment.participant WHERE participanttype='Normal'">
                        <label for="normal">View Normal Participant</label><br></p>
                    <br/>

                    <input type="submit" class="buttonblue" value="View"/>

                </form>

                <br/><br/>

                <form action="searchparticipant.jsp">

                    <div style='float:left; width:60%'>
                    <label for="participantname"><p2>Insert Registered Participant Name</p2></label><br/>
                    <input type="text" name="participantname" required size="45"><br/>
                    </div><br/><br/><br/><br/><br/>

                    <input type="submit" class="buttonblue" value="Search" name="GoSearch"/>
                    <input type="submit" class="buttonred" value="Remove" name="GoRemove" style="margin-left: 50px;" onclick="form.action='deleteparticipant.jsp';"/></br></br>
                    <input type="submit" class="buttonblue" value="Back" onclick="window.location='registerform.jsp'" name="GoBack" style="margin-left: 219px;"/>

                </form>

            </div> 



        </div>

    </body>

</html>