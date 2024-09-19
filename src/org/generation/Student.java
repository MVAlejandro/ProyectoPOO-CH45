package org.generation;

public class Student {
	String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
// Ejercicio 4
    public Student(String firstName, String lastName, int registration, int grade, int year) {
    	this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    } // Constructor Student 1
    
    public Student(String firstName, String lastName, int registration) {
        this(firstName, lastName, registration, 0, 1); 
    } // Constructor Student 2 grade & year por default
    
    public Student(String firstName, String lastName, int registration, int year) {
        this(firstName, lastName, registration, 0, year);
    } // Constructor Student 3 grade por default
// Ejercicio 4
    
    
// Ejercicio 3
    public void printFullName(){
        //TODO implement
    	System.out.println(firstName + " " + lastName);
     } // printFullName

    public boolean isApproved() {
         //TODO implement: should return true if grade >= 60
    	return grade >= 60;
     } // isApproved

     public int changeYearIfApproved(){
         //TODO implement: the student should advance to the next year if he/she grade is >= 60
         // Make year = year + 1, and print "Congragulations" if the student has been approved
    	 if (isApproved()) {
    		 year++;
    		 System.out.println("Congragulations " + firstName + ", you have been approved.");
    	 } else {
    		 System.out.println("Sorry " + firstName + ", you're repproved");
    	 } // else
         return year;
     } // changeYearIfApproved
// Ejercicio 3
     
     public String toString() {
         return "Student: {" + "Name= " + firstName + " " + lastName + ", id= " + registration 
        		 + ", Grade= " + grade+ ", Year= " + year + "}";
     } // toString
    
} // class Student
