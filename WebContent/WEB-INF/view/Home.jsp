<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>


			<script type="text/javascript">

		
				function validateForm() 
				{
					var fld1 = document.forms["myform"]["name"].value;
					var fld2 = document.forms["myform"]["email"].value;
					var fld3 = document.forms["myform"]["pass"].value;
					var fld4 = document.forms["myform"]["confirmpass"].value;
					//var fld5 = document.forms["myform"]["mobile"].value;
					
					if (fld1 == null || fld1 == "" ||
						fld2 == null || fld2 == "" ||
						fld3 == null || fld3 == "" ||
						fld4 == null || fld4 == "" 
						//fld5 == null || fld5 == ""
						) 
					{
						alert("Please fill all details...");
						return false;
					}
				
					 if(fld3 != fld4)
					{
						alert("Password does not matches...");
						return false;
					} 
					
					/* alert("Congrates You Registered Successfully."); */
				}	
	</script>



<body>


		<form name="myform" onsubmit="return validateForm()" >
        Name:<input type="text" name="name" /><br/>
        Email ID:<input type="email" name="email" /><br/>
        Password:<input type="password" name="pass" /><br/>
        Confirm Password:<input type="password" name="confirmpass" /><br/>
        <input type="submit" value="register me" />
        </form>
        If Already registered
        <a href = "Login.html">Click Here !</a>



</body>
</html>