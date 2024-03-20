/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payroll2;

/**
 *
 * @author krisn
 */
public class Deductions {
    
    private double SSSAmount;
    private double PhilHealthAmount;
    private double TINAmount;
    private double PagIbigAmount;
    private double totalContribution;
    
    public Deductions () {
        this.SSSAmount = 0;
        this.PhilHealthAmount = 0;
        this.TINAmount = 0;
        this.PagIbigAmount = 0;
        this.totalContribution = 0;
    }
    
    //Computes for SSS Deduction
    public double getSSSAmount(double bscSalary){
        if (bscSalary>=24750){
            SSSAmount = 1125;
        }
        if (bscSalary>=24250 && bscSalary<24750){
            SSSAmount = 1102.50;
        }
        if (bscSalary>=23750 && bscSalary<24250){
            SSSAmount = 1080;
        }
        if (bscSalary>=23250 && bscSalary<23750){
            SSSAmount = 1057.50;
        }
        if (bscSalary>=22750 && bscSalary<23250){
            SSSAmount = 1035;
        }
        if (bscSalary>=22250 && bscSalary<22750){
            SSSAmount = 1012.5;
        }
        if (bscSalary>=21750 && bscSalary<22250){
            SSSAmount = 990;
        }
        if (bscSalary>=21250 && bscSalary<21750){
            SSSAmount = 967.50;
        }
        if (bscSalary>=20750 && bscSalary<21250){
            SSSAmount = 945;
        }
        if (bscSalary>=20250 && bscSalary<20750){
            SSSAmount = 922.50;
        }
        if (bscSalary>=19750 && bscSalary<20250){
            SSSAmount = 900.00;
        }
        if (bscSalary>=19250 && bscSalary<19750){
            SSSAmount = 877.50;
        }
        if (bscSalary>=18750 && bscSalary<19250){
            SSSAmount = 855.00;
        }
        if (bscSalary>=18250 && bscSalary<18750){
            SSSAmount = 832.50;
        }
        if (bscSalary>=17750 && bscSalary<18250){
            SSSAmount = 810.00;
        }
        if (bscSalary>=17250 && bscSalary<17750){
            SSSAmount = 787.50;
        }
        if (bscSalary>=16750 && bscSalary<17250){
            SSSAmount = 765.00;
        }
        if (bscSalary>=16250 && bscSalary<16750){
            SSSAmount = 742.50;
        }
        if (bscSalary>=15750 && bscSalary<16250){
            SSSAmount = 720.00;
        }
        if (bscSalary>=15250 && bscSalary<15750){
            SSSAmount = 697.50;
        }
        if (bscSalary>=14750 && bscSalary<15250){
            SSSAmount = 675.00;
        }
        if (bscSalary>=14250 && bscSalary<14750){
            SSSAmount = 652.50;
        }
        if (bscSalary>=13750 && bscSalary<14250){
            SSSAmount = 630.00;
        }
        if (bscSalary>=13250 && bscSalary<13750){
            SSSAmount = 607.50;
        }
        if (bscSalary>=12750 && bscSalary<13250){
            SSSAmount = 585.00;
        }
        if (bscSalary>=12250 && bscSalary<12750){
            SSSAmount = 562.50;
        }
        if (bscSalary>=11750 && bscSalary<12250){
            SSSAmount = 540.00;
        }
        if (bscSalary>=11250 && bscSalary<11750){
            SSSAmount = 517.50;
        }
        if (bscSalary>=10750 && bscSalary<11250){
            SSSAmount = 495.00;
        }
        if (bscSalary>=10250 && bscSalary<10750){
            SSSAmount = 472.50;
        }
        if (bscSalary>=9750 && bscSalary<10250){
            SSSAmount = 450.00;
        }
        if (bscSalary>=9250 && bscSalary<9750){
            SSSAmount = 427.50;
        }
        if (bscSalary>=8750 && bscSalary<9250){
            SSSAmount = 405.00;
        }
        if (bscSalary>=8250 && bscSalary<8750){
            SSSAmount = 382.50;
        }
        if (bscSalary>=7750 && bscSalary<8250){
            SSSAmount = 360.00;
        }
        if (bscSalary>=7250 && bscSalary<7750){
            SSSAmount = 337.50;
        }
        if (bscSalary>=6750 && bscSalary<7250){
            SSSAmount = 315.00;
        }
        if (bscSalary>=6250 && bscSalary<6750){
            SSSAmount = 292.50;
        }
        if (bscSalary>=5750 && bscSalary<6250){
            SSSAmount = 270.00;
        }
        if (bscSalary>=5250 && bscSalary<5750){
            SSSAmount = 247.50;
        }
        if (bscSalary>=4750 && bscSalary<5250){
            SSSAmount = 225.00;
        }
        if (bscSalary>=4250 && bscSalary<4750){
            SSSAmount = 202.50;
        }
        if (bscSalary>=3750 && bscSalary<4250){
            SSSAmount = 180.00;
        }
        if (bscSalary>=3250 && bscSalary<3750){
            SSSAmount = 157.50;
        }
        if (bscSalary<3250){
            SSSAmount = 135.00;
        }
        return SSSAmount;
    }


    public void setSSSAmount(double newSSSAmount){
        this.SSSAmount = newSSSAmount;
    }
    
    
    // PhilHealth Getter and Setter
    public double getPhilHealthAmount(double bscSalary){
        if (bscSalary<=10000){
            PhilHealthAmount = (bscSalary*0.03)/2;
        }
        else if (bscSalary>10000 && bscSalary<60000){
            PhilHealthAmount = (bscSalary*0.03)/2;
        }
        else if(bscSalary>=60000){
            PhilHealthAmount = (bscSalary*0.03)/2;
        }
        return PhilHealthAmount;
    }

    public void setPhilHealthAmount(double newPhilHealthAmount){
        this.PhilHealthAmount = newPhilHealthAmount;
    }
    
    public double getTINAmount(double bscSalary){
        /*if (salaryTax<=20832){
            TINAmount = 0;
        }
        else if (salaryTax>=20833 && salaryTax<33333){
            TINAmount = (salaryTax-20833)*0.20;
        }
        else if (salaryTax>=33333 && salaryTax<66667){
            TINAmount = 2500+(salaryTax-33333)*0.25;
        }
        else if (salaryTax>=66667 && salaryTax<166667){
            TINAmount = 10833+(salaryTax-66667)*0.30;
        }
        else if (salaryTax>=166667 && salaryTax<666667){
            TINAmount = 40833.33+(salaryTax-166667)*0.32;
        }
        else if (salaryTax>=666667){
            TINAmount = 200833.33+(salaryTax-666667)*0.35;
        }*/
        
        double govMandateDeduc = getSSSAmount(bscSalary)+getPagIbigAmount(bscSalary)+getPhilHealthAmount(bscSalary);
        double salaryTax = bscSalary-govMandateDeduc;
        
        if (salaryTax<=20832){
            TINAmount =  0;
        }
        else if (salaryTax>=20833 && salaryTax<33333){
            TINAmount = (salaryTax-20833)*0.20;
        }
        else if (salaryTax>=33333 && salaryTax<66667){
            TINAmount = 2500+(salaryTax-33333)*0.25;
        }
        else if (salaryTax>=66667 && salaryTax<166667){
            TINAmount = 10833+(salaryTax-66667)*0.30;
        }
        else if (salaryTax>=166667 && salaryTax<666667){
            TINAmount = 40833.33+(salaryTax-166667)*0.32;
        }
        else if (salaryTax>=666667){
            TINAmount = 200833.33+(salaryTax-666667)*0.35;
        }
        
        return TINAmount;
    }

    public void setTINAmount(double newTINAmount){
        this.TINAmount = newTINAmount;
    }
    
    public double getPagIbigAmount(double bscSalary){
        
        if (bscSalary>=1000 && bscSalary<=1500){
            PagIbigAmount = bscSalary*0.01;
            }
        else if (bscSalary>1500){
            PagIbigAmount = bscSalary*0.02;
        }
        else {
            PagIbigAmount = 0;
        }
        return PagIbigAmount;
    }

    public void setPagIbigAmount(double newPagIbigAmount){
        this.PagIbigAmount = newPagIbigAmount;
    }
    
    public double gettotalContribution(double PagIbigAmount, double SSSAmount, double PhilHealthAmount){
        totalContribution = SSSAmount+PagIbigAmount+PhilHealthAmount;
        return totalContribution;
    }

    public void settotalContribution(double newtotalContribution){
        this.totalContribution = newtotalContribution;
    }


}
