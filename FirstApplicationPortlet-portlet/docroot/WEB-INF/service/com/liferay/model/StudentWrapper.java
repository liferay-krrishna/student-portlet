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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Student}.
 * </p>
 *
 * @author JavaBoss
 * @see Student
 * @generated
 */
public class StudentWrapper implements Student, ModelWrapper<Student> {
	public StudentWrapper(Student student) {
		_student = student;
	}

	@Override
	public Class<?> getModelClass() {
		return Student.class;
	}

	@Override
	public String getModelClassName() {
		return Student.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("studentId", getStudentId());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("studentAge", getStudentAge());
		attributes.put("studentGender", getStudentGender());
		attributes.put("studentAddress", getStudentAddress());
		attributes.put("hobies", getHobies());
		attributes.put("phoneNo", getPhoneNo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long studentId = (Long)attributes.get("studentId");

		if (studentId != null) {
			setStudentId(studentId);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		Integer studentAge = (Integer)attributes.get("studentAge");

		if (studentAge != null) {
			setStudentAge(studentAge);
		}

		Integer studentGender = (Integer)attributes.get("studentGender");

		if (studentGender != null) {
			setStudentGender(studentGender);
		}

		String studentAddress = (String)attributes.get("studentAddress");

		if (studentAddress != null) {
			setStudentAddress(studentAddress);
		}

		String hobies = (String)attributes.get("hobies");

		if (hobies != null) {
			setHobies(hobies);
		}

		Long phoneNo = (Long)attributes.get("phoneNo");

		if (phoneNo != null) {
			setPhoneNo(phoneNo);
		}
	}

	/**
	* Returns the primary key of this student.
	*
	* @return the primary key of this student
	*/
	@Override
	public long getPrimaryKey() {
		return _student.getPrimaryKey();
	}

	/**
	* Sets the primary key of this student.
	*
	* @param primaryKey the primary key of this student
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_student.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this student.
	*
	* @return the uuid of this student
	*/
	@Override
	public java.lang.String getUuid() {
		return _student.getUuid();
	}

	/**
	* Sets the uuid of this student.
	*
	* @param uuid the uuid of this student
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_student.setUuid(uuid);
	}

	/**
	* Returns the student ID of this student.
	*
	* @return the student ID of this student
	*/
	@Override
	public long getStudentId() {
		return _student.getStudentId();
	}

	/**
	* Sets the student ID of this student.
	*
	* @param studentId the student ID of this student
	*/
	@Override
	public void setStudentId(long studentId) {
		_student.setStudentId(studentId);
	}

	/**
	* Returns the first name of this student.
	*
	* @return the first name of this student
	*/
	@Override
	public java.lang.String getFirstName() {
		return _student.getFirstName();
	}

	/**
	* Sets the first name of this student.
	*
	* @param firstName the first name of this student
	*/
	@Override
	public void setFirstName(java.lang.String firstName) {
		_student.setFirstName(firstName);
	}

	/**
	* Returns the last name of this student.
	*
	* @return the last name of this student
	*/
	@Override
	public java.lang.String getLastName() {
		return _student.getLastName();
	}

	/**
	* Sets the last name of this student.
	*
	* @param lastName the last name of this student
	*/
	@Override
	public void setLastName(java.lang.String lastName) {
		_student.setLastName(lastName);
	}

	/**
	* Returns the student age of this student.
	*
	* @return the student age of this student
	*/
	@Override
	public int getStudentAge() {
		return _student.getStudentAge();
	}

	/**
	* Sets the student age of this student.
	*
	* @param studentAge the student age of this student
	*/
	@Override
	public void setStudentAge(int studentAge) {
		_student.setStudentAge(studentAge);
	}

	/**
	* Returns the student gender of this student.
	*
	* @return the student gender of this student
	*/
	@Override
	public int getStudentGender() {
		return _student.getStudentGender();
	}

	/**
	* Sets the student gender of this student.
	*
	* @param studentGender the student gender of this student
	*/
	@Override
	public void setStudentGender(int studentGender) {
		_student.setStudentGender(studentGender);
	}

	/**
	* Returns the student address of this student.
	*
	* @return the student address of this student
	*/
	@Override
	public java.lang.String getStudentAddress() {
		return _student.getStudentAddress();
	}

	/**
	* Sets the student address of this student.
	*
	* @param studentAddress the student address of this student
	*/
	@Override
	public void setStudentAddress(java.lang.String studentAddress) {
		_student.setStudentAddress(studentAddress);
	}

	/**
	* Returns the hobies of this student.
	*
	* @return the hobies of this student
	*/
	@Override
	public java.lang.String getHobies() {
		return _student.getHobies();
	}

	/**
	* Sets the hobies of this student.
	*
	* @param hobies the hobies of this student
	*/
	@Override
	public void setHobies(java.lang.String hobies) {
		_student.setHobies(hobies);
	}

	/**
	* Returns the phone no of this student.
	*
	* @return the phone no of this student
	*/
	@Override
	public long getPhoneNo() {
		return _student.getPhoneNo();
	}

	/**
	* Sets the phone no of this student.
	*
	* @param phoneNo the phone no of this student
	*/
	@Override
	public void setPhoneNo(long phoneNo) {
		_student.setPhoneNo(phoneNo);
	}

	@Override
	public boolean isNew() {
		return _student.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_student.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _student.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_student.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _student.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _student.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_student.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _student.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_student.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_student.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_student.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StudentWrapper((Student)_student.clone());
	}

	@Override
	public int compareTo(com.liferay.model.Student student) {
		return _student.compareTo(student);
	}

	@Override
	public int hashCode() {
		return _student.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.model.Student> toCacheModel() {
		return _student.toCacheModel();
	}

	@Override
	public com.liferay.model.Student toEscapedModel() {
		return new StudentWrapper(_student.toEscapedModel());
	}

	@Override
	public com.liferay.model.Student toUnescapedModel() {
		return new StudentWrapper(_student.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _student.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _student.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_student.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StudentWrapper)) {
			return false;
		}

		StudentWrapper studentWrapper = (StudentWrapper)obj;

		if (Validator.equals(_student, studentWrapper._student)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Student getWrappedStudent() {
		return _student;
	}

	@Override
	public Student getWrappedModel() {
		return _student;
	}

	@Override
	public void resetOriginalValues() {
		_student.resetOriginalValues();
	}

	private Student _student;
}