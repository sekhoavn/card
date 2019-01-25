/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author sidhu376
 */
public class Student1Tester {
    
    public static void main(String[] args) {
        //Array of Objects
        Student1[] studentList=new Student1[3];
        
        //Object of Student class
        Student1 s1=new Student1("Name1",123);
        
        //Populating array with Object
        studentList[0]=s1;
        
        studentList[1]=new Student1("Name2",124);
        studentList[2]=new Student1("Name3",125);
        
        for(int i=0;i<studentList.length;i++)
        {
            System.out.println(studentList[i].getName());
        }
        

    }
    
}
