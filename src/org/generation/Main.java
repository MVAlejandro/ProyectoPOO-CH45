package org.generation;

public class Main {

	public static void main(String[] args) {
		// Creación de Students
        Student student1 = new Student("Luis", "Loranca", 120120, 70, 1);
        Student student2 = new Student("Elizabeth", "Díaz", 884545, 59, 1);
        Student student3 = new Student("Alejandro", "Martínez", 458787, 80, 1);
        
        // Creación de un Course
        Course course1 = new Course("Mathematics 1", "Professor M", 1);
        
        // Mostrar información de los estudiantes
        System.out.println("-----------------------------------------------------------------");
        System.out.println("| " + student1);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("| " + student2);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("| " + student3);
        System.out.println("-----------------------------------------------------------------");
        
        // Enroll students en course
        course1.enroll(student1);
        course1.enroll(student2);
        course1.enroll(student3);
        
        // printFullName
        student1.printFullName();
        student2.printFullName();
        student3.printFullName();
        System.out.println("-----------------------------------------------------------------");
        
        
        // Mostrar información del curso
        System.out.println("-----------------------------------------------------------------");
        System.out.println("| " + course1);
        System.out.println("-----------------------------------------------------------------");
        
        // countStudents
        System.out.println("Total enrolled students in "+ course1.courseName + ": " + course1.countStudents());
        System.out.println("-----------------------------------------------------------------");
        
        // bestGrade
        System.out.println("Best grade in the course: " + course1.bestGrade());
        System.out.println("-----------------------------------------------------------------");
        
        // changeYearIfApproved
        student1.changeYearIfApproved();
        student2.changeYearIfApproved();
        student3.changeYearIfApproved();
        System.out.println("-----------------------------------------------------------------");
        
        // Enroll de varios students con sobrecarga del método
        Student[] newStudents = {
            new Student("Juan", "Pérez", 135464, 65, 1),
            new Student("José", "Dávila", 778979, 90, 1)
        };
        course1.enroll(newStudents);
        System.out.println("Total enrolled students after adding new students: " + course1.countStudents());
		
     // Mostrar información de los estudiantes actualizada
        System.out.println("-----------------------------------------------------------------");
        System.out.println("| " + student1);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("| " + student2);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("| " + student3);
        System.out.println("-----------------------------------------------------------------");
	} // main

} // class Main
