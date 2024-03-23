/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payroll2;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author krisn
 */
public class TimeinTimeout {
    private String timein;
    private LocalTime timeout;
    private long hoursworked;
   
    
    
    public TimeinTimeout(){
        
        LocalTime time = LocalTime.now();
        
        this.timein = time.format(Utility.formatter);
        this.timeout = LocalTime.of(0, 0);
        this.hoursworked = 0;
    }
    
    public String gettimein (){
        return timein;
    }
    
    public void settimein (String newtimein){
        this.timein = newtimein;
    }
    
    public LocalTime gettimeout (){
        return timeout;
    }
    
    public void settimeout (int newtimeouthours, int newtimeoutminutes){
        this.timeout = LocalTime.of(newtimeouthours,newtimeoutminutes);
    }
    
        public long gethoursworked(String timein, LocalTime timeout) {
        LocalTime time = LocalTime.parse(timein, Utility.formatter);
        long hoursworked = ChronoUnit.HOURS.between(time, timeout);
        return hoursworked;
    }
        
}
