<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Add New Employee</h1>
       <form:form method="post" action="savexyz" commandName="command">  
      	<table >  
         <tr>  
          <td>Name : </td> 
          <td><form:input path="FirstName"  /></td>
         </tr>  
         <tr>  
          <td>Salary :</td>  
          <td><form:input path="LastName" /></td>
         </tr> 
         <tr>  
          <td>Designation :</td>  
          <td><form:input path="UserId" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
