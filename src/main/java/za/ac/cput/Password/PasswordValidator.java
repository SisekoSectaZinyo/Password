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
public class PasswordValidator 
{
   public boolean isValid (String Password) 
   {
       if (Password.length()>=5 && Password.length()<=10)
       {
           return true;
       } 
       else
            return false;
   }

   public static boolean isValidPassword (String Password) 
   {
       if (Password.length()>=5 && Password.length()<=10)
       {
           return true;
       } 
       else
            return false;
   }
   
   } 
    
