/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.Password;

/**
 *
 * @author Siseko Zinyo 
 */
public class check {
    public static boolean isvalidpassword (String str){
    
    if (str.contains( "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$")){
    return true;
    }
    else {
    return false;
    }
   }
    
    public static void main(String args[])
    {
  
        // Test Case 1:
        String str1 = "Geeks@portal20";
        System.out.println(str1);
  
        // Test Case 2:
        String str2 = "Geeksforgeeks";
        System.out.println(str2);
  
      
}
}
