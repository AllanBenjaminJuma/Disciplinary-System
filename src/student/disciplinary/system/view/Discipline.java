/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.disciplinary.system.view;

/**
 *
 * @author allen
 */
class Discipline {
    private String casename, punishment, date, registrationnumber;
    
    public Discipline(String casename,String punishment, String date, String registrationnumber)
    {  
    this.casename = casename;
    this.punishment = punishment;
    this.date = date;
    this.registrationnumber = registrationnumber;
    }
    public String getCaseName(){
    return casename;
    }
    public String getPunishment(){
    return punishment;
    }
    public String getDate(){
    return date;
    }
    public String getRegistrationNumber(){
    return registrationnumber;
    }
}

