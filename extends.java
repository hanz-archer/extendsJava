import java.util.Scanner;
public class Date {
    static int day;
    static String Month;
    static int year;
}
class getDate extends Date{
    public void Dates() {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter Day: ");
        day = Scan.nextInt();
        System.out.println("Enter Month: ");
        Month = Scan.next();
        System.out.println("Enter Year: ");
        year = Scan.nextInt();
        
    }
    static class theDate extends Date{
        public void Dates(int day, String Month, int year){
            System.out.println("The date is: "+Month+"/"+day+"/"+year);
        }
    }
    static class leapYear extends Date{
    	public void Dates(int year) {
    		System.out.println("The year is: "+year);
    		if(year %4 == 0) {
    			System.out.println("The year is leap year!");
    		}
    		else
    			System.out.println("The year is not a leap year!");
    	}
    }
    static class Tester{
        public static void main(String[] args){
            getDate gdate = new getDate();
            gdate.Dates();
            theDate td = new theDate();
            td.Dates(day, Month, year);
            leapYear lp = new leapYear();
            lp.Dates(year);
        		}
    	}
}