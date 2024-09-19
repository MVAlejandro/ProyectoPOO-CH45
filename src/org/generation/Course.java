package org.generation;

import java.util.ArrayList;
import java.util.List;

public class Course {
	String courseName;
	String professorName;
	int year;
	
	public Course(String courseName, String professorName, int year) {
    	this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
    } // Constructor Course
	
	List<Student> enrolledStudents = new ArrayList<>( );
	
// Ejercicio 5
	public void enroll(Student student){
	    //TODO add the student to the collection
		enrolledStudents.add( student );
	} // enroll
// Eejrcicio 7 
    public void enroll(Student[] students) {
        for (Student student : students) {
            enroll(student);
        } // for
    } // enroll Sobrecarga del método
// Ejercicio 7

	public void unEnroll(Student student){
	    //TODO remove this student from the collection
	    // Hint: check if that really is this student
		enrolledStudents.remove( student );
	} // unEnroll

	public int countStudents(){
	    //TODO implement
		return enrolledStudents.size();
	} // countStudents
	   
	public int bestGrade(){
	    //TODO implement
		int bestGrade = enrolledStudents.get(0).grade;

        for (Student student : enrolledStudents) {
        	if (student.grade > bestGrade) {
                bestGrade = student.grade;
            } // if
        } // for

        return bestGrade;
	} // bestGrade
// Ejercicio 5
	
	public String toString() {
        return "Course: {" + "Name= " + courseName + ", Professor= " + professorName 
       		 + ", Year= " + year + "}";
    } // toString
	
} // class Course
