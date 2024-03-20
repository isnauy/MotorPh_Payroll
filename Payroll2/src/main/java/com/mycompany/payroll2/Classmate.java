/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payroll2;

/**
 *
 * @author krisn
 */
public class Classmate {
    private String name;
    private String subject;
    private int age;

public Classmate (String name,String subject,int age){
    this.name= name;
    this.subject = subject;
    this.age=age;
}

public String getname(){
    return name;
}

public void setname(String newname){
    this.name = newname;
}

public String getsubject(){
    return subject;
}

public void setsubject(String newsubject){
    this.subject = newsubject;
}

public int getage(){
    return age;
}

public void setage(int newage){
    this.age = newage;
}

}
