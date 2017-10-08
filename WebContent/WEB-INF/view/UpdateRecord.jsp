<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<form:form method="post" action="updatexyz" commandName="command">  
      	<table >
      	
      <%-- 	<tr>  
          <td>Student ID : </td> 
          <td><form:input path="StudentId"/></td>
         </tr>   --%>
      	  
         <tr>  
          <td>Enter ID : </td>
          
          <td><form:input path="StudentId"/></td>
         </tr>  
         <tr>  
          <td>Enter the Changed Name :</td>  
          <td><form:input path="StudentName"/></td>
         </tr> 
         
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Update" /></td>  
         </tr>  
        </table>  
       </form:form>  