/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.payroll2;

import java.util.ArrayList;

/**
 *
 * @author krisn
 */

public class Payroll2 {

    public static void main(String[] args) {
        
        /*Employee emp1 = new Employee(10001,"Garcia","Manuel III","10/11/1983","Valero Carpark Building Valero Street 1227, Makati City","966-860-270",
                "44-4506057-3","820126853951","442-605-657-000","691295330870","Regular","Chief Executive Officer","N/A",90000,
                1500,2000,1000,45000,535.71d);
        
        Employee emp2 = new Employee (10002,"Lim","Antonio","06/19/1988","San Antonio De Padua 2, Block 1 Lot 8 and 2, Dasmarinas, Cavite","171-867-411",
                "52-2061274-9","331735646338","683-102-776-000","663904995411","Regular","Chief Operating Officer","Garcia, Manuel III",60000,
                1500,2000,1000,30000,357.14);

        Employee emp3 = new Employee (10002,"Lim","Antonio","06/19/1988","San Antonio De Padua 2, Block 1 Lot 8 and 2, Dasmarinas, Cavite","171-867-411",
                "52-2061274-9","331735646338","683-102-776-000","663904995411","Regular","Chief Operating Officer","Garcia, Manuel III",60000,
                1500,2000,1000,30000,357.14);*/
                       
        /*System.out.println("Employee number: "+emp1.getEmpNum());
        System.out.println("Name: "+emp1.getLastName()+", "+emp1.getFirstName());
        System.out.println("Birthday: "+emp1.getBirthday());
        System.out.println("Address: "+emp1.getAddress());
        System.out.println("Phone Number: "+emp1.getPhoneNum());
        System.out.println("SSS number: "+emp1.getSSS());
        System.out.println("PhilHealth Number: "+emp1.getPhilHealth());
        System.out.println("TIN Number: "+emp1.getTIN());
        System.out.println("PagIbig Number: "+emp1.getPagIbig());
        System.out.println("Employement Status: "+emp1.getStatus());
        System.out.println("Position: "+emp1.getPosition());
        System.out.println("Immediate Supervisor: "+emp1.getSupervisor());
        System.out.println("Basic Salary: PHP "+emp1.getBscSalary());
        System.out.println("Rice Subsidy: PHP "+emp1.getRiceSubsidy());
        System.out.println("Phone Allowance: PHP "+emp1.getPhoneAllowance());
        System.out.println("Clothing Allowance: PHP "+emp1.getClothingAllowance());
        System.out.println("Gross-Semi Monthly Rate: PHP "+emp1.getGrossSemiMonthlyRate());
        System.out.println("Hourly Rate: PHP "+emp1.getHourlyRate());
        System.out.println("---------------------------------------------------");
        System.out.println("Employee number: "+emp2.getEmpNum());
        System.out.println("Name: "+emp2.getLastName()+", "+emp2.getFirstName());
        System.out.println("Birthday: "+emp2.getBirthday());
        System.out.println("Address: "+emp2.getAddress());
        System.out.println("Phone Number: "+emp2.getPhoneNum());
        System.out.println("SSS number: "+emp2.getSSS());
        System.out.println("PhilHealth Number: "+emp2.getPhilHealth());
        System.out.println("TIN Number: "+emp2.getTIN());
        System.out.println("PagIbig Number: "+emp2.getPagIbig());
        System.out.println("Employement Status: "+emp2.getStatus());
        System.out.println("Position: "+emp2.getPosition());
        System.out.println("Immediate Supervisor: "+emp2.getSupervisor());
        System.out.println("Basic Salary: PHP "+emp2.getBscSalary());
        System.out.println("Rice Subsidy: PHP "+emp2.getRiceSubsidy());
        System.out.println("Phone Allowance: PHP "+emp2.getPhoneAllowance());
        System.out.println("Clothing Allowance: PHP "+emp2.getClothingAllowance());
        System.out.println("Gross-Semi Monthly Rate: PHP "+emp2.getGrossSemiMonthlyRate());
        System.out.println("Hourly Rate: PHP "+emp2.getHourlyRate());
        System.out.println("---------------------------------------------------");
        System.out.println("Employee number: "+emp3.getEmpNum());
        System.out.println("Name: "+emp3.getLastName()+", "+emp3.getFirstName());
        System.out.println("Birthday: "+emp3.getBirthday());
        System.out.println("Address: "+emp3.getAddress());
        System.out.println("Phone Number: "+emp3.getPhoneNum());
        System.out.println("SSS number: "+emp3.getSSS());
        System.out.println("PhilHealth Number: "+emp3.getPhilHealth());
        System.out.println("TIN Number: "+emp3.getTIN());
        System.out.println("PagIbig Number: "+emp3.getPagIbig());
        System.out.println("Employement Status: "+emp3.getStatus());
        System.out.println("Position: "+emp3.getPosition());
        System.out.println("Immediate Supervisor: "+emp3.getSupervisor());
        System.out.println("Basic Salary: PHP "+emp3.getBscSalary());
        System.out.println("Rice Subsidy: PHP "+emp3.getRiceSubsidy());
        System.out.println("Phone Allowance: PHP "+emp3.getPhoneAllowance());
        System.out.println("Clothing Allowance: PHP "+emp3.getClothingAllowance());
        System.out.println("Gross-Semi Monthly Rate: PHP "+emp3.getGrossSemiMonthlyRate());
        System.out.println("Hourly Rate: PHP "+emp3.getHourlyRate());
        System.out.println("---------------------------------------------------");*/
        
       
        /*Utility scan = new Utility();
        scan.empScan();*/
        
        //calling Utility class
        //Utility.empScan();
        
        //Deductions deduc = new Deductions();

        //double sahod = 50000;
        /*System.out.println("Basic Salary: " + emp1.getBscSalary());
        System.out.println("------------------------------------");
        System.out.println("SSS Contribution: "+emp1.getdeduction().getSSSAmount(emp1.getBscSalary()));
        System.out.println("PagIbig Contribution: "+emp1.getdeduction().getPagIbigAmount(emp1.getBscSalary()));
        System.out.println("PhilHealth Contribution: "+emp1.getdeduction().getPhilHealthAmount(emp1.getBscSalary()));
        System.out.println("Total Contribution: "+emp1.getdeduction().gettotalContribution(emp1.getdeduction().getPagIbigAmount(emp1.getBscSalary()),
                emp1.getdeduction().getSSSAmount(emp1.getBscSalary()), 
          emp1.getdeduction().getPhilHealthAmount(emp1.getBscSalary())));
        System.out.println("------------------------------------");
        System.out.printf("Witholding Tax: %,.2f \n",emp1.getdeduction().getTINAmount(emp1.getBscSalary()));
        System.out.println("------------------------------------");
        System.out.println("Net Salary: "+emp1.getnetSalary(emp1.getBscSalary(),
                emp1.getdeduction().gettotalContribution(emp1.getdeduction().getPagIbigAmount(emp1.getBscSalary()), 
                        emp1.getdeduction().getSSSAmount(emp1.getBscSalary()), 
                        emp1.getdeduction().getPhilHealthAmount(emp1.getBscSalary())),
                emp1.getdeduction().getTINAmount(emp1.getBscSalary())));*/
        
        //arraylist Practice
        /*ArrayList<Classmate> classmatelist = new ArrayList<Classmate>();
        
        Classmate classmate1 = new Classmate("Lisa","Science",14);
        Classmate classmate2 = new Classmate("Maria","Filipino",15);
        Classmate classmate3 = new Classmate("Boy","Comp Prog",21);
        
        classmatelist.add(classmate1);
        classmatelist.add(classmate2);
        classmatelist.add(classmate3);
        
        for (Classmate c : classmatelist){
            System.out.println(c.getname());
            System.out.println(c.getsubject());
            System.out.println(c.getage());
        }*/
        
        Utility.ReadFile();
    }
}
