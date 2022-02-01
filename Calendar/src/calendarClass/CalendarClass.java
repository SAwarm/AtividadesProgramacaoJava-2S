/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendarClass;

/**
 *
 * @author Jonas Elias
 */
public class CalendarClass {

    private int day;
    private int month;
    private int year;

    CalendarClass(int d, int m, int a) {
        this.year = a;
        
        
    }
    
    void setDayMonth(int d, int m) {
        // months 31 days
        if (d == 31) {
            int[] months = {1, 3, 5, 7, 8, 10, 12};
            
            for (int i = 0; i < months.length; i++) {
                if (months[i] == m) {
                    this.day = d;
                    this.month = m;
                }
            }
        }
        
        // months 28, 29
        if (d == 28 || d == 29) {
            int[] months = {2};
            
            for (int i = 0; i < months.length; i++) {
                if (months[i] == m) {
                    this.day = d;
                    this.month = m;
                }
            }
        }
        
        // months 30
        if (d == 30) {
            int[] months = {2};
            
            for (int i = 0; i < months.length; i++) {
                if (months[i] == m) {
                    this.day = d;
                    this.month = m;
                }
            }
        }
        
        if (d <= 31) {
            this.day = d;
            this.month = m;   
        }
    }

}
