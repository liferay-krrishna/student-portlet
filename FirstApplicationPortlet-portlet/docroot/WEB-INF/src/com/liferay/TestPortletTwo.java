/**
 * 
 */
package com.liferay;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.xml.namespace.QName;

import com.liferay.model.Student;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.service.StudentLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * @author JavaBoss
 *
 */
public class TestPortletTwo extends MVCPortlet {
	
	@SuppressWarnings("unchecked")
	public void searchStudents(ActionRequest request, ActionResponse actionResponse) {
		System.out.println("in ActionRequest request, ActionResponse actionResponse) ");
		String fname=ParamUtil.getString(request, "firstName");
		int gender=ParamUtil.getInteger(request, "studentGender");
		System.out.println(fname+"  "+gender);
		List<Student> studentList =new ArrayList<Student>();		
			try {
				
				DynamicQuery dynamicQuery = null;
				if(gender==2){
					dynamicQuery=DynamicQueryFactoryUtil.forClass(Student.class)
							.add(PropertyFactoryUtil.forName("firstName").like(StringPool.PERCENT+fname+StringPool.PERCENT));		}
				else{
				dynamicQuery=DynamicQueryFactoryUtil
					.forClass(Student.class)
					.add(PropertyFactoryUtil.forName("firstName").like(StringPool.PERCENT+fname+StringPool.PERCENT))
					.add(PropertyFactoryUtil.forName("studentGender").eq(gender));	
				}
				studentList=StudentLocalServiceUtil.dynamicQuery(dynamicQuery);
				
				/*if((fname.equals(null)||fname.length()==0)&&(gender==2)){
					studentList=StudentLocalServiceUtil.getStudents(0, StudentLocalServiceUtil.getStudentsCount());
				}
				else if(fname.length()>0&& gender==2){
					studentList=StudentLocalServiceUtil.getByFirstName(StringPool.PERCENT+fname+StringPool.PERCENT);
				}
				else if((fname.length()==0||fname.equals(null))&&gender!=2){
					studentList=StudentLocalServiceUtil.findByByGender(gender);
				}
				else
				{
					studentList=StudentLocalServiceUtil.
							findByFirstNameAndGender(StringPool.PERCENT+fname+StringPool.PERCENT, gender);
				}*/
				System.out.println(studentList.size());
				request.setAttribute("studentList", studentList);
				
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
	}
	public void editStudentDetails(ActionRequest request, ActionResponse actionResponse) {
		System.out.println("edit std");
		long studentId=ParamUtil.getLong(request, "studentId");
		System.out.println(studentId);
		QName qName = new QName("http://liferay.com", "editEvent", "x");
		actionResponse.setEvent(qName, String.valueOf(studentId));
		
	}
	public void deleteStudentetails(ActionRequest request, ActionResponse actionResponse) {
		System.out.println("delete std");
		long studentId=ParamUtil.getLong(request, "studentId");
		System.out.println(studentId);
		try {
			StudentLocalServiceUtil.deleteStudent(studentId);
		} catch (PortalException | SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public void addStudent(ActionRequest request, ActionResponse actionResponse) {
	System.out.println("in action request processing\n\n");
	
	System.out.println(ParamUtil.getString(request, "firstName"));
	System.out.println(ParamUtil.getString(request, "lastName"));
	System.out.println(ParamUtil.getInteger(request, "studentAge"));
	System.out.println(ParamUtil.getString(request, "sex"));
	System.out.println(ParamUtil.getString(request, "address"));
	
	

List<Student> student;
try {
	student = StudentLocalServiceUtil.getStudents(0, 10);

	//StudentLocalServiceUtil.get
for(Student std:student){
	/*
	out.print(std.getFirstName());
	out.print(std.getLastName());
	out.print(std.getStudentAddress());
	out.print(std.getStudentAge());
	out.print(std.getStudentGender());
	out.print(std.getStudentId());*/
	
	
}

} catch (SystemException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


}
public void somethingToDo(ActionRequest request, ActionResponse actionResponse){
	
	try {
		//UnicodeLanguageUtil n;
		System.out.println("  selected items "+ParamUtil.getString(request, "todoItems"));
		String[] rowIds = ParamUtil.getParameterValues(request, "rowIds");
		
		for(String str:rowIds){
			System.out.println("row ids \t"+str);
		}
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
