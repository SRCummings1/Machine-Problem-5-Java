package date_array;

public class MyDate {
	   private int day , year;
	   private String month;
	   public MyDate(String month, int day, int year) {
	       this.month = month;
	       this.day = day;
	       this.year = year;
	   }
	   public String toString() {
	       return month+" "+day+", "+year;
	   }
	}

