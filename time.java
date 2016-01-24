/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author semasuka
 */
public class time{
        private int hours;
        private int minutes;
        private int seconds;
        
    public void setTime(int h,int m,int s){
        
        hours=((h>=0 && h<24) ? h:0);
        minutes=((m>=0 && m<60) ? m:0);
        seconds=((s>=0 && s<60)? s:0);
    }
    public String toMilitary(){
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
    public String normal(){
        return String.format("%d:%02d:%02d %s" ,((hours==0 || hours==12) ? 12:hours%12),minutes,seconds,(hours<12)? "AM":"PM");
    }
}