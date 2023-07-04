<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conference Online Registration</title>
        
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
        
        <script language="JavaScript">
            function showInput(){
                
                var UserOption1  = document.getElementById('userinput1').value;
                var UserOption2  = document.getElementById('userinput2').value;
                
                if(document.getElementById('userinput1').value == 500 || document.getElementById('userinput1').value == 1000 || document.getElementById('userinput1').value == 1500){
                    document.getElementById('display').innerHTML=UserOption1;
                }else if(document.getElementById('userinput2').value == 300 || document.getElementById('userinput2').value == 600 || document.getElementById('userinput2').value == 900){
                    document.getElementById('display').innerHTML=UserOption2;
                }
                else{
                    document.getElementById('display').innerHTML=0;
                }
                
            }
        </script>
    </head>

    <body>

    <center><h1><p>Conference Online Registration</p></h1>
        <p>Please fill in the form below. We'll contact you as soon as possible.</p><br/><br/><br/>
    </center>

    <form action="insertdata.jsp">

        <div id='outerDiv'>
            <div id='formDiv1' style='float:left; width:48%; height:300px; padding-left: 10px;'>
                
                <div id='fullname'><strong><p>Full Name  <span class="warning">*</span></p></strong><br/>
                    <div id="firstName" style='float:left; width:50%'>
                        <input type="text" name="firstname" required size="45"><br/>
                        <label for="firstname"><p2>First Name</p2></label><br/><br/><br/>
                    </div>
                    <div id="lastName" style='float:right; width:50%'>
                        <input type="text" name="lastname" required size="45"><br/>
                        <label for="lastname"><p2>Last Name</p2></label><br/><br/><br/>
                    </div>
                </div>
                
                <strong><p>Area  <span class="warning">*</span></p></strong><br/>
                <select name="areas">
                    <option value="" disabled selected hidden>Please select</option>
                    <option value="Bangi">Bangi</option>
                    <option value="Kajang">Kajang</option>
                    <option value="Putrajaya">Putrajaya</option>
                </select><br/><br/><br/>
                
                <strong><p>Address  <span class="warning">*</span></p></strong><br/>
                <input type="text" name="address" required style="width:97.5%"><br/>
                <label for="address"><p2>Street Address</p2></label>
                <input type="text" name="address2" style="width:97.5%"><br/>
                <label for="address2"><p2>Street Address Line 2</p2></label>
                
                <div>
                    <div id="city" style='float:left; width:50%'>
                        <input type="text" name="city" required size="45"><br/>
                        <label for="city"><p2>City</p2></label>
                    </div>
                    <div id="state" style='float:right; width:50%;padding-bottom: 5px;'>
                        <input type="text" name="state" required size="45"><br/>
                        <label for="state"><p2>State / Province</p2></label>
                    </div>
                </div>
                
                <div>
                    <div id="postal" style='float:left; width:50%'>
                        <input type="text" name="postal" required size="45"><br/>
                        <label for="postal"><p2>Postal / Zip Code</p2></label><br/><br/><br/>
                    </div>
                        <select name="country">
                        <option value="" disabled selected hidden>Please select</option>
                        <option value="Malaysia">Malaysia</option>
                        <option value="Singapore">Singapore</option>
                        <option value="Indonesia">Indonesia</option>
                        </select><br/>
                        <label for="country"><p2>Country</p2></label><br/><br/><br/>
                        <br>
                </div>
                
                <strong><p>Email  <span class="warning">*</span></p></strong><br/>
                <input type="email" name="email" required placeholder="ex: myname@example.com" style="width:47%"><br/>
                <label for="email"><p2>example@example.com</p2></label>
                <br/><br/><br/>
                
                <strong><p>Phone Number  <span class="warning">*</span></p></strong><br/>
                <input type="text" name="phone" placeholder="(000)000-0000" required style="width:45%"><br/>
                
            </div>
            
            <div id='formDiv2' style='float:right; width:48%; height:300px;'>
                
                <strong><p>First time to attend this conference?  <span class="warning">*</span></p></strong><br>
                <p><input type="radio" name="firsttime" value="Yes">
                    <label for="Yes">Yes</label><br>
                    <input type="radio" name="firsttime" value="No">
                    <label for="No">No</label><br></p>
                <br/><br/><br/>
                
                <strong><p>I will attend:  <span class="warning">*</span></p></strong><br>
                <p><input type="checkbox" name="event" value="Event 1">
                    <label for="event1"> Event 1 - Date of Event 1</label><br>
                    <input type="checkbox" name="event" value="Event 2">
                    <label for="event2"> Event 2 - Date of Event 2</label><br>
                    <input type="checkbox" name="event" value="Event 3">
                    <label for="event3"> Event 3 - Date of Event 3</label><br></p>
                <br/><br/><br/>
                
                <strong><p>What's your T-Shirt size?  <span class="warning">*</span></p></strong><br>
                <select name="size">
                    <option value="" disabled selected hidden>Please select</option>
                    <option value="S">S</option>
                    <option value="M">M</option>
                    <option value="L">L</option>
                    <option value="XL">XL</option>
                </select>
                <br/><br/><br/>
                
                <strong><p style="padding-bottom: 30px">Registration Fee  <span class="warning">*</span></p></strong><br>
                
                <p><input type="radio" name="participanttype" value="Normal">
                    <strong><label for="normal">Conference Registration Fee (Normal Participant) <span style="padding-left: 80px;">500.00MYR</span></label></strong><br>
                <br><p2># of Papers</p2>
                <select name="papers" id="userinput1" style="width:10%">
                    <option value="" disabled selected hidden>Please select</option>
                    <option value="500">1</option>
                    <option value="1000">2</option>
                    <option value="1500">3</option>
                </select><br/><br/></p><hr style="width:80%; text-align:right;margin-left: 0px;">  
            
                <br><p><input type="radio" name="participanttype" value="Student">
                    <strong><label for="student">Conference Registration Fee (Student Participant) <span style="padding-left: 80px;">300.00MYR</span></label></strong><br>
                <br><p2># of Papers</p2>
                <select name="papers" id="userinput2" style="width:10%">
                    <option value="" disabled selected hidden>Please select</option>
                    <option value="300">1</option>
                    <option value="600">2</option>
                    <option value="900">3</option>
                </select><br/><br/></p><hr style="width:80%; text-align:right;margin-left: 0px;">  

                <input style="margin-right: 250px;" class="buttonblue" value="Check Total Amount" onclick="showInput();"/> Total <span id='display'> 0</span>.00MYR<br/><br/>
                
               
                <input type="submit" class="buttonblue" value="Search Tool" name="GoSearch" onclick="window.location='search.jsp'"/>
                <input type="submit" class="buttongreen" value="Submit" style="margin-left: 20px;"/>
                <input type="reset" class="buttongray" value="Reset" style="margin-left: 80px;"/>
                
            </div>
            
        </div>

    </form>

</body>

</html>
