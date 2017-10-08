<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Add New Employee</h1>
       <form:form method="post" action="savexyz" commandName="command">  
      	<table >
      	
      <%-- 	<tr>  
          <td>Student ID : </td> 
          <td><form:input path="StudentId"/></td>
         </tr>   --%>
      	  
         <tr>  
          <td>Student Name : </td>
          
          <td><form:textarea path="StudentName"/></td>
         </tr>  
         <tr>  
          <td>Address :</td>  
          <td><form:input path="Address"/></td>
         </tr> 
         <tr>  
          <td>Mobile number :</td>  
          <td><form:input path="MobileNo"/></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
         
    
         
        </table>  
             <a href="UpdateRecord"> click here to Update already saved record </a><br>
             <a href="DeleteRecord"> click here to Delete already saved record </a>
       </form:form>  
