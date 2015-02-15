//*******************************************************************************************************
//Andreas Landgrebe cs111 fall semester 2012
//
//Lab 5 Problem 1
//
//Uses Student class to get lab and exam scores for two students and to compute and print out averages.
//*******************************************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class GradeBook
{
    public static void main (String[] argv)
    {
	Scanner input = new Scanner(System.in);
	
	DecimalFormat fmt = new DecimalFormat("0.#");
	
	Student student1, student2;

	System.out.println("enter the name of the first student");
	String name = input.nextLine();
	System.out.println("enter the id of the first student");
	int id = input.nextInt();
	input.nextLine();
	System.out.println("enter the major of the first student");
	String major = input.nextLine();
        student1 = new Student(name, id, major);

	System.out.println("enter the name of the second student");
	name = input.nextLine();
	System.out.println("enter the id of the second student");
	id = input.nextInt();
	input.nextLine();
	System.out.println("enter the major of the second student");
	major = input.nextLine();
        student2 = new Student(name, id, major);

	System.out.println("Enter the score for lab1 for the first student");
	double lab1 = input.nextDouble();
	student1.setLab1(lab1);
	
	System.out.println("Enter the score for lab2 for the first student");
	double lab2 = input.nextDouble();
	student1.setLab2(lab2);
	
	System.out.println("Enter the score for exam1 for the first student");
	double exam1 = input.nextDouble();
	student1.setExam1(exam1);
	
	System.out.println("Enter the score for exam2 for the first student");
	double exam2 = input.nextDouble();
	student1.setExam2(exam2);

	
	
	System.out.println("Enter the score for lab1 for the second student");
	lab1 = input.nextDouble();
	student2.setLab1(lab1);
	
	System.out.println("Enter the score for lab2 for the second student");
	lab2 = input.nextDouble();
	student2.setLab2(lab2);
	
	System.out.println("Enter the score for exam1 for the second student");
	exam1 = input.nextDouble();
	student2.setExam1(exam1);

	System.out.println("Enter the score for exam2 for the second student");
	exam2 = input.nextDouble();
	student2.setExam2(exam2);
	

	System.out.println ("Student Name\tIdNo\tMajor\t\t\tLab1\tLab2\tExam1\tExam2");
	System.out.println (student1.toString());
	System.out.println (student2.toString());
	System.out.println ("Laboratory work:");
	System.out.println("Student Name\tLab1\tLab2\tLab Average");
	System.out.println(student1.getName() + "\t" + student1.getLab1() + "\t" + student1.getLab2() + "\t" + fmt.format(student1.labAverage()));
	
	System.out.println(student2.getName() + "\t" + student2.getLab1() + "\t" + student2.getLab2() + "\t" + fmt.format(student2.labAverage()));
	System.out.println("Exam Work:");
	System.out.println("Student Name\texam1\texam2\tExam Average");
	System.out.println(student1.getName() + "\t" + student1.getExam1() + "\t" + student1.getExam2() + "\t" + fmt.format(student1.examAverage()));
	System.out.println(student2.getName() + "\t" + student2.getExam1() + "\t" + student2.getExam2() + "\t" + fmt.format(student2.examAverage()));

	System.out.println("Overall Average");
	System.out.println("Student Name\t Average");
	System.out.println(student1.getName() + "\t" + fmt.format(student1.average()));
	System.out.println(student2.getName() + "\t" + fmt.format(student2.average()));	
   }
}

			   		 