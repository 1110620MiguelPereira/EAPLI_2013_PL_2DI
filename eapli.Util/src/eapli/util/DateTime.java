/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class DateTime {

    public static Calendar today() {
        Calendar today = new GregorianCalendar();
        return today;
    }

    public static int weekNumber(Calendar date) {
        return date.get(Calendar.WEEK_OF_YEAR);
    }

    public static int weekNumber(Date date) {
        return weekNumber(dateToCalendar(date));
    }

    public static Calendar dateToCalendar(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }

    public static int currentWeekNumber() {
        return weekNumber(today());
    }

        public static Calendar firstDateOfWeek(int year, int week) {
        Calendar date = new GregorianCalendar();
        date.clear();
        date.set(Calendar.YEAR, year);
        date.set(Calendar.WEEK_OF_YEAR, week);
        return date;
    }
    
    public static Calendar lastDateOfWeek(int year, int week) {
        Calendar date = firstDateOfWeek(year, week);
        date.add(Calendar.DATE, 6);
        return date;
    }

    public static int currentYear() {
        return today().get(Calendar.YEAR);
    }

    /**
     * returns the current month of the year
     * 
     * @return current month (1 - 12) of the year
     */
    public static int currentMonth() {
        return today().get(Calendar.MONTH) + 1 ;
    }

    public static Calendar newCalendarDate(int year, int month, int day) {
        Calendar date = new GregorianCalendar(year, month, day);
        return date;
    }

    /**
     * @deprecated
     * 
     * @param year
     * @param month
     * @param day
     * @return 
     */ 
    public static Date newDate(int year, int month, int day) {
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day);
        return c.getTime();
    }

    /**
     * @deprecated
     * 
     * @param aDateString
     * @param format
     * @return 
     */
    public static Date parseDate(String aDateString, String format) {
        try {
            SimpleDateFormat df = new SimpleDateFormat(format);
            Date date = df.parse(aDateString);
            return date;
        } catch (ParseException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * @deprecated
     * 
     * @param aDateString
     * @return 
     */
    public static Date parseDate(String aDateString) {
        return parseDate(aDateString, "dd-MM-yyyy");
    }
}
