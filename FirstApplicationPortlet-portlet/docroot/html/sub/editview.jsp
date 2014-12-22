
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@page import="com.liferay.service.StudentLocalServiceUtil"%>
<%@page import="com.liferay.model.Student"%>
<%@page import="javax.portlet.PortletSession" %>
<portlet:defineObjects />


<portlet:actionURL var="updateStudentActionURL" windowState="normal" name="updateStudent" />

<%
long studentId=Long.parseLong((String)portletSession.getAttribute("studentId1",PortletSession.APPLICATION_SCOPE));
Student selecteStudentObject=StudentLocalServiceUtil.fetchStudent(studentId);

%>
<h2>Update Student</h2>
<form action="<%=updateStudentActionURL.toString()%>" name="studentForm"  method="POST">
	<input  type="hidden" name="<portlet:namespace/>studentId" id="<portlet:namespace/>studentId" 
		value="<%=selecteStudentObject.getStudentId()%>"/>
	<b>First Name</b><br/>
	<input  type="text" name="<portlet:namespace/>firstName" id="<portlet:namespace/>firstName" 
		value="<%=selecteStudentObject.getFirstName()%>"/><br/>
	<b>Last Name</b><br/>
	<input type="text" name="<portlet:namespace/>lastName" id="<portlet:namespace/>lastName" value="<%=selecteStudentObject.getLastName()%>"/><br/>
	<b>Age</b><br/>
	<input type="text" name="<portlet:namespace/>studentAge" id="<portlet:namespace/>studentAge" value="<%=selecteStudentObject.getStudentGender()%>"/><br/>
	<b>Gender</b><br/>
	<input type="radio" name="<portlet:namespace/>sex" value="1" checked="true">Male<br>
	<input type="radio" name="<portlet:namespace/>sex" value="0">Female<br/>
	<b>Hobbies</b><br>
	<input type="checkbox" name="<portlet:namespace/>hobbies" value="sports">Sports&nbsp;
	<input type="checkbox" name="<portlet:namespace/>hobbies" value="reading books">Reading&nbsp;
	<input type="checkbox" name="<portlet:namespace/>hobbies" value="listening books">Listening&nbsp;<br>
	<b>Phone Number</b><br/>
	<input type="text" name="<portlet:namespace/>phoneNo" id="<portlet:namespace/>phoneNo"  value="<%=selecteStudentObject.getPhoneNo()%>"/><br/>
	
	<b>Address</b><br/>
	<textarea rows="4" cols="50" name="<portlet:namespace/>address" ><%=selecteStudentObject.getStudentAddress()%>
	</textarea><br/>
	<input type="submit" name="<portlet:namespace />updateStudent" id="updateStudent" value="Update Student"/>
</form>
