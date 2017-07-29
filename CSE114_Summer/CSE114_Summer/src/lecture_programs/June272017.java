/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture_programs;

/**
 *
 * @author Ben Michalowicz
 */




import java.util.Calendar;
import java.util.GregorianCalendar;
public class June272017 {
    
    public static void main(String[] args) {
        
        Calendar x = new GregorianCalendar();
        
        
        System.out.println("Year: " + x.get(Calendar.YEAR));
        System.out.println("Month: " + x.get(Calendar.MONTH));
        System.out.println("Date: " + x.get(Calendar.DATE));
        System.out.println("Hour: " + x.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + x.get(Calendar.MINUTE));
        System.out.println("Second: " + x.get(Calendar.SECOND));
        System.out.println("Day Of Year: " + x.get(Calendar.DAY_OF_YEAR));
        System.out.println("Week of YEar: " + x.get(Calendar.WEEK_OF_YEAR));

        
    }
    
}
