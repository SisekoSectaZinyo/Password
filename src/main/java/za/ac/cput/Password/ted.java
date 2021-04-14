/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.Password;

/**
  *
 * @author Ted Japhet NZAMBA MABIKA 219197695
 * 
 * User Details
 */
public class ted {
    private String name, Surname, userAccount;


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        
    }
  @Override
    public String toString() {
        return "tedj{" + "name=" + name + ", Surname=" + Surname + ", userAccount=" + userAccount + '}';
    }

    }
