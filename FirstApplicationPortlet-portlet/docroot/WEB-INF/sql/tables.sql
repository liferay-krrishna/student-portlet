create table TestApp_Student (
	studentId LONG not null primary key,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	studentAge INTEGER,
	studentGender INTEGER,
	studentAddress VARCHAR(75) null
);

create table student (
	uuid_ VARCHAR(75) null,
	studentId LONG not null primary key,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	studentAge INTEGER,
	studentGender INTEGER,
	studentAddress VARCHAR(75) null,
	hobies VARCHAR(75) null,
	phoneNo LONG
);