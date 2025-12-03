/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.Semana1;

/**
 *
 * @author User
 */
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar hoy= Calendar.getInstance();
        System.out.println("Fecha: "+hoy.getTime());
        Calendar Esteban= Calendar.getInstance();
        Esteban.set(2006, Calendar.JUNE,10);
        System.out.println("Esteban nacio en: "+Esteban.getTime());
    }
}
