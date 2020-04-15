/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author allen
 */
public class NewStudent {
    private String firstname; 
    private String lastname;
    private String regnumber;
    
     public NewStudent(String firstname, String lastname, String regnumber){
    
        this.firstname = firstname;
        this.lastname = lastname;
        this.regnumber = regnumber;
    }
    public String getFirstName(){
        return firstname;
    }
    public void setFirstName(String firstname){
        this.firstname = firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public void setLastName(String lastname){
        this.lastname = lastname;
    }
    public String getRegNumber(){
        return regnumber;
    }
    public void setRegNumber(String regnumber){
        this.regnumber = regnumber;
    }
}
