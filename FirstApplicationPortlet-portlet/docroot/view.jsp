
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
<%-- 
<portlet:renderURL var="homeURL"></portlet:renderURL> --%>

<portlet:actionURL var="addStudentActionURL" windowState="normal" name="addStudent" />


<h2>Add Student</h2>
<form action="<%=addStudentActionURL%>" name="studentForm"  method="POST">

	<b>First Name</b><br/>
	<input  type="text" name="<portlet:namespace/>firstName" id="<portlet:namespace/>firstName"/><br/>
	<b>Last Name</b><br/>
	<input type="text" name="<portlet:namespace/>lastName" id="<portlet:namespace/>lastName"/><br/>
	<b>Age</b><br/>
	<input type="text" name="<portlet:namespace/>studentAge" id="<portlet:namespace/>studentAge"/><br/>
	<b>Gender</b><br/>
	<input type="radio" name="<portlet:namespace/>sex" value="1">Male<br>
	<input type="radio" name="<portlet:namespace/>sex" value="0">Female<br/>
	<b>Address</b><br/>
	<textarea rows="4" cols="50" name="<portlet:namespace/>address">
	</textarea><br/>
	<input type="submit" name="<portlet:namespace />addStudent" id="addStudent" value="Add Student"/>
</form>
