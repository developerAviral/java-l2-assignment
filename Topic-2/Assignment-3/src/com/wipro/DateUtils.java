package com.wipro;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.util.Calendar.*;

public class DateUtils {

    public static void getDiffYearsAndMonths() {
        LocalDate bday = LocalDate.of(1955, Month.MAY, 19);
        LocalDate today = LocalDate.now();
        Period age = Period.between(bday, today);
        int years = age.getYears();
        int months = age.getMonths() + age.getYears()*12;
        System.out.println("number of years: " + years);
        System.out.println("number of months: " + months);
        }

}
