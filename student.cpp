/*
 * student.cpp
 *
 *  Created on: 06-Apr-2020
 *      Author: sunbam
 */
#include "student.h"
#include<cstring>
#include<iostream>
using namespace std;

Student::Student()
{
	int rollno =0;
	strcpy(name,"");
}
Student::Student(int r,const char *n)
{
	rollno = r;
	strcpy(name,n);
}
void Student::display() {
	cout << rollno << ", " << name << endl;
}

Student::~Student() {
	// TODO Auto-generated destructor stub
}
