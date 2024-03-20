/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payroll2;

/**
 *
 * @author krisn
 */
public class Employee {
    private int empNum; //system generated; incremental
    private String lastName; //user input
    private String firstName; //user input
    private String birthday; //user input
    private String address; //user input
    private String phoneNum; //user input
    private String SSS; //user input
    private String PhilHealth; //user input
    private String TIN; //user input
    private String PagIbig; //user input
    private String status; //either  sys gen or user input
    private String position; //user input
    private String supervisor; //user input
    private double riceSubsidy; //fixed 1500; non taxable
    private double phoneAllowance; //user input; non taxable
    private double clothingAllowance; //either 500,800 or 1000; non taxable
    private double grossSemiMonthlyRate; //system generated
    private double hourlyRate; //system generated
    
    private Deductions deduction = new Deductions();
    private double bscSalary; //user input
    private double netSalary;
        

    
public Employee(int empNum, String lastName, String firstName, String birthday, String address, String phoneNum, String SSS, String PhilHealth, String TIN, String PagIbig, String status, String position,
        String supervisor, double bscSalary, double riceSubsidy, double phoneAllowance, double clothingAllowance, double grossSemiMonthlyRate, double hourlyRate ){
    this.empNum = empNum;
    this.lastName = lastName;
    this.firstName = firstName;
    this.birthday = birthday;
    this.address = address;
    this.phoneNum = phoneNum;
    this.SSS = SSS;
    this.PhilHealth = PhilHealth;
    this.TIN = TIN;
    this.PagIbig = PagIbig;
    this.status = status;
    this.position = position;
    this.supervisor = supervisor;
    this.bscSalary = bscSalary;
    this.riceSubsidy = riceSubsidy;
    this.phoneAllowance = phoneAllowance;
    this.clothingAllowance = clothingAllowance;
    this.grossSemiMonthlyRate = grossSemiMonthlyRate;
    this.hourlyRate = hourlyRate;
    this.netSalary = 0;
}

public int getEmpNum(){
    return empNum;
}

public void setEmpNum(int newEmpNum){
    this.empNum = newEmpNum;
}

public String getLastName(){
    return lastName;
}

public void setLastName(String newLastName){
    this.lastName = newLastName;
}

public String getFirstName(){
    return firstName;
}

public void setFirstName(String newFirstName){
    this.firstName = newFirstName;
}

public String getBirthday(){
    return birthday;
}

public void setBirthday(String newBirthday){
    this.birthday = newBirthday;
}

public String getAddress(){
    return address;
}

public void setAddress(String newAddress){
    this.address = newAddress;
}

public String getPhoneNum(){
    return phoneNum;
}

public void setPhonenum(String newPhoneNum){
    this.phoneNum = newPhoneNum;
}

public String getSSS(){
    return SSS;
}

public void setSSS(String newSSS){
    this.SSS = newSSS;
}

public String getPhilHealth(){
    return PhilHealth;
}

public void setPhilHealth(String newPhilhealth){
    this.PhilHealth = newPhilhealth;
}

public String getTIN(){
    return TIN;
}

public void setTIN(String newTIN){
    this.TIN = newTIN;
}

public String getPagIbig(){
    return PagIbig;
}

public void setPagIbig(String newPagIbig){
    this.PagIbig = newPagIbig;
}

public String getStatus(){
    return status;
}

public void setStatus(String newStatus){
    this.status = newStatus;
}

public String getPosition(){
    return position;
}

public void setPosition(String newPosition){
    this.position = newPosition;
}

public String getSupervisor(){
    return supervisor;
}

public void setSupervisor(String newSupervisor){
    this.supervisor = newSupervisor;
}

public double getBscSalary(){
    return bscSalary;
}

public void setBscSalary(double newBscSalary){
    this.bscSalary = newBscSalary;
}

public double getRiceSubsidy(){
    return riceSubsidy;
}

public void setRiceSubsidy(double newRiceSubsidy){
    this.riceSubsidy = newRiceSubsidy;
}

public double getPhoneAllowance(){
    return phoneAllowance;
}

public void setPhoneAllowance(double newPhoneAllowance){
    this.phoneAllowance = newPhoneAllowance;
}

public double getClothingAllowance(){
    return clothingAllowance;
}

public void setClothingAllowance(double newClothingAllowance){
    this.clothingAllowance = newClothingAllowance;
}

public double getGrossSemiMonthlyRate(){
    return grossSemiMonthlyRate;
}

public void setGrossSemiMonthlyRate(double newGrossSemiMonthlyRate){
    this.grossSemiMonthlyRate = newGrossSemiMonthlyRate;
}

public double getHourlyRate(){
    return hourlyRate;
}

public void setHourlyRate(double newHourlyRate){
    this.hourlyRate = newHourlyRate;
}

public double getnetSalary(double bscSalary,double totalContribution,double TINAmount){
        netSalary = bscSalary-totalContribution-TINAmount;
    return netSalary;
}

public void setnetSalary(double newnetSalary){
    this.netSalary = newnetSalary;
}

public Deductions getdeduction(){
    return this.deduction;
}

public void setdeduction(Deductions newdeduction){
    this.deduction = newdeduction;
}


}
