package date_array;

public class DateArray {

	  
	   public static void main(String[] args) {
	       MyDate dateArr[] = new MyDate[4];
	       MyDate date1 = new MyDate("May", 16, 1984);
	       MyDate date2 = new MyDate("November", 14, 1978);
	       MyDate date3 = new MyDate("September", 21, 1980);
	       MyDate date4 = new MyDate("July", 3, 1987);
	       dateArr[0] = date1;
	       dateArr[1] = date2;
	       dateArr[2] = date3;
	       dateArr[3] = date4;
	       for(int i=dateArr.length-1; i>=0; i--){
	           System.out.println(dateArr[i].toString());
	       }
	   }

	}