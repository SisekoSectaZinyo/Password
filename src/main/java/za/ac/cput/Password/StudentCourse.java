/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.Password;

/**
 *
 * @Ismail_Watara_219018790
 */
public class StudentCourse {
    String name;
    int Age;
    
    public static void main(String[] args){
    
    StudentCourse a = new StudentCourse();
    a.setName("Ismail");
    a.setAge(21);
    System.out.println(a.getName());
    System.out.println(a.getAge());
    
    a.printDetails();
    
    }
    
    public void setName(String name){
    this.name = name;
    }
    
    public void setAge(int Age){
    this.Age = Age;
    }
        
    public String getName(){
    return this.name;
    }
    public int getAge(){
    return this.Age;
    }
    
    public void printDetails(){
    System.out.println(getName()+ "," + getAge());
    }
    }
    

