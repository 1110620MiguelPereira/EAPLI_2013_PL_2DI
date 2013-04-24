/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paulo Gandra Sousa
 * 
 * based on code form Nuno Silva
 */
public class Console {

    // TODO refactor to readLine
    static public String readLineFromConsole(String strPrompt) {
        try {
            System.out.println(strPrompt);

            InputStreamReader converter = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(converter);

            return in.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // TODO refactor to readInteger
    static public int readIntegerFromConsole(String strPrompt) {
        do {
            try {
                String strInt = readLineFromConsole(strPrompt);

                int valor = Integer.parseInt(strInt);

                return valor;
            } catch (NumberFormatException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);
    }

    static public BigDecimal readBigDecimal(String strPrompt) {
        do {
            try {
                String strInt = readLineFromConsole(strPrompt);

                BigDecimal valor = new BigDecimal(strInt);
                return valor;
            } catch (NumberFormatException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);
    }

    // TODO refactor to readBoolean
    static public boolean readBoolean(String strPrompt) {
        do {
            try {
                String strBool = readLineFromConsole(strPrompt).toLowerCase();

                if (strBool.equals("s") || strBool.equals("y")) {
                    return true;
                } else if (strBool.equals("n")) {
                    return false;
                }
            } catch (NumberFormatException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);
    }

    // TODO refactor to readDate
    static public Date readDateFromConsole(String strPrompt) {
        do {
            try {
                String strDate = readLineFromConsole(strPrompt);

                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

                Date date = df.parse(strDate);

                return date;
            } catch (ParseException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);
    }
    
    static public Calendar readMonthYearFromConsole(String strPrompt) {
        do {
            try {
                String strDate = readLineFromConsole(strPrompt);
                strDate="01-"+strDate;
                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

                Date date =df.parse(strDate);
                
                return DateTime.dateToCalendar(date);
            } catch (ParseException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);
    }

    // TODO move to DateTime util class and rename to parseDate
    static public Date dateFromString(String strDate) {
        try {

            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

            Date date = df.parse(strDate);

            return date;
        } catch (ParseException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
