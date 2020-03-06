package org.example;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    /*public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }*/
    public static ArrayList<Student> studentarr=new ArrayList<Student>();
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            printoptions();
            int n=sc.nextInt();
            switch(n)
            {
                case 1: addstudent();
                    break;
                case 2: removestudent();
                    break;
                case 3: fetchstudent();
                    break;
                case 4: printallstudents();
                    break;
                case 5: System.exit(0);
                default: System.out.println("please choose correct option");
            }
        }
    }
    public static void printoptions()
    {
        System.out.println("1.add a student\n2.remove a student\n 3.fetch a student\n4.print all students\n5.exit");
    }
    public static void addstudent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first name of student");
        String firstname=sc.next();
        System.out.println("enter last name of student");
        String lastname=sc.next();
        System.out.println("enter data of birth use dd-mm-yyyy of student");
        String dob=sc.next();
        System.out.println("enter rollno of student");
        String rollno=sc.next();
        System.out.println("enter branch of student");
        String branch=sc.next();
        System.out.println("enter section of student");
        String section=sc.next();
        System.out.println("enter year of student");
        String year=sc.next();
        System.out.println("enter gender of student");
        String gender=sc.next();
        System.out.println("enter sgpa of student");
        String sgpa=sc.next();
        System.out.println("enter cgpa of student");
        String cgpa=sc.next();
        Student student11=new Student(firstname,lastname,dob,rollno,branch,section,year,gender,sgpa,cgpa);
        studentarr.add(student11);
        System.out.println("Student added sucessfully");
    }
    public static void removestudent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter roll no of student to remove");
        String rollno1=sc.next();
        for(int i=0;i<studentarr.size();i++)
        {
            if(studentarr.get(i).rollno.compareTo(rollno1)==0)
            {
                studentarr.remove(i);
                System.out.println("person with given roll no is removed");
                break;
            }
        }
    }
    public static void fetchstudent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter roll no of student to fetch");
        String rollno1=sc.next();
        for(int i=0;i<studentarr.size();i++)
        {
            if(studentarr.get(i).rollno.compareTo(rollno1)==0)
            {
                printdetails(i);
                break;
            }
        }
    }
    public static void printallstudents()
    {
        for(int i=0;i<studentarr.size();i++)
            printdetails(i);
    }
    public static void printdetails(int n)
    {
        System.out.println("------------------------------------------");
        System.out.println("STUDENT DETAILS");
        Student student1=studentarr.get(n);
        System.out.println("first name                 "+student1.firstname);
        System.out.println("last name of student       "+student1.lastname);
        System.out.println("data of birth of student   "+student1.dob);
        System.out.println("rollno of student          "+student1.rollno);
        System.out.println("branch of student          "+student1.branch);
        System.out.println("section of student         "+student1.section);
        System.out.println("year of student            "+student1.year);
        System.out.println("gender of student          "+student1.gender);
        System.out.println("sgpa of student            "+student1.sgpa);
        System.out.println("cgpa of student            "+student1.cgpa);
        System.out.println("------------------------------------------");
    }
}
