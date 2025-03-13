// PARTNER NAME: ALEJANDRO BELLO
// PARTNER NAME: N/A
// CS111 SECTION #: 3033
// DATE:03/12/2025

public class Main
{
    public static void main(String[] args)

    {   
//DECLARATION + INITIALIZATION SECTION 
int monthToday = 0;
int dayToday = 0;
int yearToday = 0;
int jdnDate = 0;

//INPUT SECTION:
//CALCULATION SECTION:
monthToday = 8;
dayToday = 26;
yearToday = 1918;
jdnDate = Main.calcJulianDate(monthToday, dayToday, yearToday);

//OUTPUT SECTION:
System.out.println("The calculated Julian Date for Katherine Johnson's birthday is: " + jdnDate);
//moon landing date
monthToday = 7;
dayToday = 20;
yearToday = 1969; 

jdnDate = Main.calcJulianDate(monthToday, dayToday, yearToday);
    System.out.println("The calculated Julian Date for when we landed on the moon is: " + jdnDate);

    monthToday = 2; 
    dayToday = 8; 
    yearToday = 2001;
    jdnDate = Main.calcJulianDate(monthToday, dayToday, yearToday);
    System.out.println("The calculated Julian Date for my birthday is: " + jdnDate);
}

//DESCRIPTION: calculate the Julian date given month, day, and year 
//PRECONDITION: valid integers for month, day, and year, month < 12
//POSTCONDITION: return an integer, julain date

public static int calcJulianDate(int month, int day, int year) {
    int a = 0;
    int m = 0; 
    int y = 0;
    int jdnToday = 0;

    a = (14 - month) / 12;
    m = month + 12 * a - 3;
    y = year + 4800 - a; 
    //jdnToday = jdnToday
    return day + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;

    }   

}

