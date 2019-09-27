package com.wipro;

enum Days{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
public class Week {
    public void getDay(int i){

        switch(i) {
            case 1:
                System.out.println(Days.MONDAY);
                break;
            case 2:
                System.out.println(Days.TUESDAY);
                break;
            case 3:
                System.out.println(Days.WEDNESDAY);
                break;
            case 4:
                System.out.println(Days.THURSDAY);
                break;
            case 5:
                System.out.println(Days.FRIDAY);
                break;
            case 6:
                System.out.println(Days.SATURDAY);
                break;
            case 7:
                System.out.println(Days.SUNDAY);
                break;
                default:
                    System.out.println("Please enter valid Day number. ");
        }
    }
}
