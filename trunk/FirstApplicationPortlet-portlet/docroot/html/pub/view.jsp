 <%@ include file="init.jspf" %>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker" %>
<%@page import="com.liferay.service.StudentLocalServiceUtil"%>
<%@page import="com.liferay.model.Student"%>
<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil" %>

<div>
<h3> <liferay-ui:message key="Search Books" /> </h3>
<%
	List<Student> studentList =new ArrayList<Student>();
	if(	renderRequest.getAttribute("studentList")!=null){
		studentList= (List<Student>)renderRequest.getAttribute("studentList");
	}
	else{
		studentList=StudentLocalServiceUtil.getStudents(0, StudentLocalServiceUtil.getStudentsCount());
		
	}
	//String portletId=PortalUtil.getPortletId(request);
	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter(ActionRequest.ACTION_NAME, "searchPage");
	/* iteratorURL.setPortletId(portletId);
    iteratorURL.setWindowState(WindowState.NORMAL.toString()); */
   /*  iteratorURL.setParameter("bookExt", (String)renderRequest.getAttribute("bookExt"));
    iteratorURL.setParameter("bookTypeExt", (String)renderRequest.getAttribute("bookTypeExt"));
	iteratorURL.setParameter("searchFileds", (String)renderRequest.getAttribute("searchFields"));
	 *///System.out.println(" iterratorurl ------- "+(String)renderRequest.getAttribute("searchFields"));
%>
<portlet:actionURL  var="searchURL" name="searchStudents" />

<aui:form action="<%=searchURL.toString() %>"  method="post" name="bookDetailForm"> 
	<aui:layout cssClass="searchField row-fluid">	
	<div class="span10">
		 <aui:column>		
			<aui:input inlineLabel="left" name="firstName" type="text"  label="FirstName" > 
			</aui:input>	
			<aui:input inlineLabel="right" name="studentAge" type="number" label="studentAge">
			</aui:input>
			
			
			<aui:select label="Gender" name="studentGender"  inlineLabel="left">
			        <aui:option label="Select" value="2" selected="<%=true %>"  />
					<aui:option label="Male" value="0" />
					<aui:option label="Female" value="1" />					
			</aui:select>								
		
			 <aui:button type="submit" value="Search" />
		</aui:column>
	</div>	
	</aui:layout>
</aui:form>
	<aui:form  action=""  name="fmItem">
	<aui:input name="todoItems" type="hidden" />
	<liferay-ui:search-container delta="5" emptyResultsMessage="Sorry. There are no where about to display." 
			iteratorURL="<%=iteratorURL %>"  rowChecker="<%= new RowChecker(renderResponse) %>">
		<liferay-ui:search-container-results total="<%= studentList.size() %>" 
			results="<%= ListUtil.subList(studentList,searchContainer.getStart(),searchContainer.getEnd()) %>"/>
			<liferay-ui:search-container-row modelVar="student" className="Student"  keyProperty="studentId">
				 
					<liferay-ui:search-container-column-text name="First Name"  property="firstName" />
					<liferay-ui:search-container-column-text name="Last name" property="lastName" />					
					<liferay-ui:search-container-column-text name="Age"  property="studentAge" />
					<liferay-ui:search-container-column-text name="Gender" property="studentGender" />
					<liferay-ui:search-container-column-text name="PhoneNo" property="phoneNo" />
					<liferay-ui:search-container-column-text name="Addrress" property="studentAddress" />
					<liferay-ui:search-container-column-text name="Hobbies" property="hobies" />
					<% 	
					PortletURL editURL = renderResponse.createActionURL();
					editURL.setParameter(ActionRequest.ACTION_NAME,"editStudentDetails");
					editURL.setParameter("studentId", String.valueOf(student.getStudentId()));
					PortletURL deleteURL = renderResponse.createActionURL();
					deleteURL.setParameter(ActionRequest.ACTION_NAME, "deleteStudentetails");
					deleteURL.setParameter("studentId", String.valueOf(student.getStudentId()));
					%>
				<liferay-ui:search-container-column-text name="action" >
					<a href="<%=editURL.toString() %>"><liferay-ui:message key="edit" /></a> | <a href="<%=deleteURL.toString() %>" class="deleteButton" ><liferay-ui:message key="delete" /></a>
				</liferay-ui:search-container-column-text>
			</liferay-ui:search-container-row>
			  
	 <liferay-ui:search-iterator searchContainer="<%=searchContainer %>" /> 
	</liferay-ui:search-container>
<%-- <aui:button  type="submit" name="update" value="UpdateBook" ></aui:button>
<aui:button href="<%= somethingToDoURL.toString() %>" namevalue="To Do Something"></aui:button> --%>
</div>
<aui:button onClick='<%= renderResponse.getNamespace() + "delete();" %>' value="Todo Something" />
</aui:form>
<script>
Liferay.provide(
        window,
        '<portlet:namespace />delete',
         function() {
                    var cmd =   Liferay.Util.listCheckedExcept(document.<portlet:namespace />fmItem,   '<portlet:namespace />allRowIds'); 
                    //alert(A.all('input[type=checkbox]'));
                    // alert(cmd);
                   
                    document.<portlet:namespace />fmItem.method = "post";                
                    document.<portlet:namespace />fmItem.<portlet:namespace />todoItems.value = cmd;
                    alert(cmd);
                    submitForm(document.<portlet:namespace />fmItem, 
                    		'<portlet:actionURL   name="somethingToDo" />');
                   
                         },

          ['liferay-util-list-fields']

);
</script> 