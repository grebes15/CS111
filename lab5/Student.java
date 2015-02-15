//*********************************************************************************************************************************
//Andreas Landgrebe cs111 fall semester 2012
//
//Lab 5 Problem 1
//
//Defines a student class to represent an individual student with a name, student id, major, two lab scores, and two test scores.
//
//*********************************************************************************************************************************

public class Student
{
    private int studentId; 
    private double lab1, lab2, exam1, exam2;
    private String name, major;

    public Student(String n, int id, String m)
    {	
        name = n;     
	studentId = id;
	major = m;
    }


    public String getName()
    {
	return name;
    }
    public int getid()
    {
	return studentId;
    }
    public String getMajor()
    {
	return major;
    }
    public double getLab1()
    {
	return lab1;
    }
    public double getLab2()
    {
	return lab2;
    }
    public double getExam1()
    {
	return exam1;
    }
    public double getExam2()
    {
	return exam2;
    }
    public void setName (String n)
    {
	name = n;
    }
    public void setStudentId (int id)
    {
	studentId = id;
    }
    public void setMajor (String m)
    {
	major = m;
    }
    public void setLab1 (double l1)
    {
	lab1 = l1;
    }
    public void setLab2 (double l2)
    {
	lab2 = l2;
    }
    public void setExam1 (double e1)
    {
	exam1 = e1;
    }
    public void setExam2 (double e2)
    {
	exam2 = e2;
    }
    public double labAverage()
    {
	return (lab1 + lab2) * (100/60.0);
    }
    public double examAverage()
    {
        return (exam1 + exam2)/2;
    }

    public double average()
    {
	return examAverage()*.4 + labAverage()*.6;
    }
    public String toString()
    {
	return name + "\t" +studentId + "\t" + major + "\t" + lab1 + "\t" + lab2 + "\t" + exam1 + "\t" + exam2;
    }
}





