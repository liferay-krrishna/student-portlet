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

package com.liferay.model.impl;

import com.liferay.model.Student;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Student in entity cache.
 *
 * @author JavaBoss
 * @see Student
 * @generated
 */
public class StudentCacheModel implements CacheModel<Student>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", studentId=");
		sb.append(studentId);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", studentAge=");
		sb.append(studentAge);
		sb.append(", studentGender=");
		sb.append(studentGender);
		sb.append(", studentAddress=");
		sb.append(studentAddress);
		sb.append(", hobies=");
		sb.append(hobies);
		sb.append(", phoneNo=");
		sb.append(phoneNo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Student toEntityModel() {
		StudentImpl studentImpl = new StudentImpl();

		if (uuid == null) {
			studentImpl.setUuid(StringPool.BLANK);
		}
		else {
			studentImpl.setUuid(uuid);
		}

		studentImpl.setStudentId(studentId);

		if (firstName == null) {
			studentImpl.setFirstName(StringPool.BLANK);
		}
		else {
			studentImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			studentImpl.setLastName(StringPool.BLANK);
		}
		else {
			studentImpl.setLastName(lastName);
		}

		studentImpl.setStudentAge(studentAge);
		studentImpl.setStudentGender(studentGender);

		if (studentAddress == null) {
			studentImpl.setStudentAddress(StringPool.BLANK);
		}
		else {
			studentImpl.setStudentAddress(studentAddress);
		}

		if (hobies == null) {
			studentImpl.setHobies(StringPool.BLANK);
		}
		else {
			studentImpl.setHobies(hobies);
		}

		studentImpl.setPhoneNo(phoneNo);

		studentImpl.resetOriginalValues();

		return studentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		studentId = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		studentAge = objectInput.readInt();
		studentGender = objectInput.readInt();
		studentAddress = objectInput.readUTF();
		hobies = objectInput.readUTF();
		phoneNo = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(studentId);

		if (firstName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		objectOutput.writeInt(studentAge);
		objectOutput.writeInt(studentGender);

		if (studentAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(studentAddress);
		}

		if (hobies == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hobies);
		}

		objectOutput.writeLong(phoneNo);
	}

	public String uuid;
	public long studentId;
	public String firstName;
	public String lastName;
	public int studentAge;
	public int studentGender;
	public String studentAddress;
	public String hobies;
	public long phoneNo;
}