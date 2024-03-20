/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payroll2;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author krisn
 */
public class Utility {
    // "public static" to use in other class
    public static Scanner scan = new Scanner(System.in);
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    //scanner method
    public static void empScan (){
        System.out.print("Enter anything:");
        String input = scan.nextLine();
        System.out.println("Output is: "+ input);
    }
    
    public static void ReadFile(){
        try{
            File employeeFile = new File("C:/Users/krisn/Desktop/Payroll2/src/main/java/com/mycompany/payroll2/EmployeeList.csv");
            scan = new Scanner (employeeFile);
            while (scan.hasNextLine()){
                String employeedata = scan.nextLine();
                System.out.println(employeedata);
            }
            
        }   
        catch (Exception e){
            System.out.println(e);
        }
    }
    
    
    
}
