/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payroll2;

import static com.mycompany.payroll2.Utility.scan;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author krisn
 */
public abstract class EmployeeModelImpl implements EmployeeModel {
 
    
    @Override
    public Employee[] getEmployeeModelList(){
        
    }
    
    @Override
    public Employee[] setEmployeeModelList(){
        try{
            File employeeFile = new File("C:/Users/krisn/Desktop/Payroll2/src/main/java/com/mycompany/payroll2/EmployeeList.csv");
            scan = new Scanner (employeeFile);
             ArrayList<Employee> employeelist = new ArrayList<>();
            
            while (scan.hasNextLine()){
                /*String employeedata = scan.nextLine();
                System.out.println(employeedata);*/
                String line = scan.nextLine();
                String[] tokens = line.split(","); // Assuming CSV format with comma as delimiter
            }
            
        }   
        catch (Exception e){
            System.out.println(e);
        }
}
