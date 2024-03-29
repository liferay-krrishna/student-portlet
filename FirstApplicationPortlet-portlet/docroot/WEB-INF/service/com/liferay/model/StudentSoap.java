/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.service.http.StudentServiceSoap}.
 *
 * @author JavaBoss
 * @see com.liferay.service.http.StudentServiceSoap
 * @generated
 */
public class StudentSoap implements Serializable {
	public static StudentSoap toSoapModel(Student model) {
		StudentSoap soapModel = new StudentSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setStudentId(model.getStudentId());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setLastName(model.getLastName());
		soapModel.setStudentAge(model.getStudentAge());
		soapModel.setStudentGender(model.getStudentGender());
		soapModel.setStudentAddress(model.getStudentAddress());
		soapModel.setHobies(model.getHobies());
		soapModel.setPhoneNo(model.getPhoneNo());

		return soapModel;
	}

	public static StudentSoap[] toSoapModels(Student[] models) {
		StudentSoap[] soapModels = new StudentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StudentSoap[][] toSoapModels(Student[][] models) {
		StudentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StudentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StudentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StudentSoap[] toSoapModels(List<Student> models) {
		List<StudentSoap> soapModels = new ArrayList<StudentSoap>(models.size());

		for (Student model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StudentSoap[soapModels.size()]);
	}

	public StudentSoap() {
	}

	public long getPrimaryKey() {
		return _studentId;
	}

	public void setPrimaryKey(long pk) {
		setStudentId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getStudentId() {
		return _studentId;
	}

	public void setStudentId(long studentId) {
		_studentId = studentId;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public int getStudentAge() {
		return _studentAge;
	}

	public void setStudentAge(int studentAge) {
		_studentAge = studentAge;
	}

	public int getStudentGender() {
		return _studentGender;
	}

	public void setStudentGender(int studentGender) {
		_studentGender = studentGender;
	}

	public String getStudentAddress() {
		return _studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		_studentAddress = studentAddress;
	}

	public String getHobies() {
		return _hobies;
	}

	public void setHobies(String hobies) {
		_hobies = hobies;
	}

	public long getPhoneNo() {
		return _phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		_phoneNo = phoneNo;
	}

	private String _uuid;
	private long _studentId;
	private String _firstName;
	private String _lastName;
	private int _studentAge;
	private int _studentGender;
	private String _studentAddress;
	private String _hobies;
	private long _phoneNo;
}