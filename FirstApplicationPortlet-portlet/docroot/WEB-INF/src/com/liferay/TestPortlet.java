/**
 * 
 */
package com.liferay;

import java.io.IOException;
import java.util.Arrays;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Event;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.PortletSession;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.model.Student;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.service.StudentLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * @author JavaBoss
 *
 */
public class TestPortlet extends MVCPortlet {

	public void addStudent(ActionRequest request, ActionResponse actionResponse)
			throws IOException {
		System.out.println("in action request processing\n\n");

		String firstName = ParamUtil.getString(request, "firstName");
		String lastName = ParamUtil.getString(request, "lastName");
		int studentAge = ParamUtil.getInteger(request, "studentAge");
		int sex = ParamUtil.getInteger(request, "sex");
		String hobbies[] = request.getParameterValues("hobbies");
		String hobbiesl = "";
		long phone = ParamUtil.getInteger(request, "phoneNo");
		String address = ParamUtil.getString(request, "address");
		if(hobbies.length>0){
			hobbiesl = hobbies[0];}
		for (int i = 1; i < hobbies.length; i++) {
			hobbiesl = hobbiesl + "," + hobbies[i];
		}
		long studentId;
		try {
			studentId = CounterLocalServiceUtil.increment(Student.class.toString());
			Student student = StudentLocalServiceUtil.createStudent(studentId);
			student.setFirstName(firstName);
			student.setLastName(lastName);
			student.setStudentAge(studentAge);
			student.setPhoneNo(phone);
			student.setStudentAddress(address);
			student.setStudentGender(sex);
			student.setHobies(hobbiesl);
			StudentLocalServiceUtil.addStudent(student);

		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// actionResponse.setRenderParameter("mvcPath", "/html/test/view.jsp");

	}
	public void updateStudent(ActionRequest request, ActionResponse actionResponse)
			throws IOException {
		System.out.println("in action request processing\n\n");

		String firstName = ParamUtil.getString(request, "firstName");
		String lastName = ParamUtil.getString(request, "lastName");
		int studentAge = ParamUtil.getInteger(request, "studentAge");
		int sex = ParamUtil.getInteger(request, "sex");
		String hobbies[] = request.getParameterValues("hobbies");
		String hobbiesl = "";
		long phone = ParamUtil.getInteger(request, "phoneNo");
		System.out.println(ParamUtil.getString(request, "address"));
		String address = ParamUtil.getString(request, "address");
		if(hobbies.length>0){
		hobbiesl = hobbies[0];}
		for (int i = 1; i < hobbies.length; i++) {
			hobbiesl = hobbiesl + "," + hobbies[i];
		}
		long studentId;
		try {
			studentId = ParamUtil.getLong(request,"studentId");
			Student student = StudentLocalServiceUtil.fetchStudent(studentId);
			student.setFirstName(firstName);
			student.setLastName(lastName);
			student.setStudentAge(studentAge);
			student.setPhoneNo(phone);
			student.setStudentAddress(address);
			student.setStudentGender(sex);
			student.setHobies(hobbiesl);
			StudentLocalServiceUtil.updateStudent(student);

		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// actionResponse.setRenderParameter("mvcPath", "/html/test/view.jsp");

	}

	public void processEvent(EventRequest request, EventResponse response) {

		Event event = request.getEvent();
		String studentId = (String) event.getValue();
		System.out.println("event " + studentId);
		PortletSession ps = request.getPortletSession();
		ps.setAttribute("studentId1", studentId,
				PortletSession.APPLICATION_SCOPE);

		response.setRenderParameter("studentId", studentId);
		response.setRenderParameter("mvcPath", "/html/sub/editview.jsp");

	}
}