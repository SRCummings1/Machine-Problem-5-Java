package string_array;

public class NameReverse {

	public static void main(String[] args) {
String string_array[] =new String[] {"George","Fred","Sam","Mary","Sarah","Bella","Joy","Rita","Marta","Sue","Nancy"};
	System.out.println("The array before reversal");
	for(int i=0 ; i <= string_array.length - 1; i++) {
		System.out.println(string_array[i]);
	}
System.out.println("The array after reversal");
	for(int i=string_array.length - 1 ; i>=0; i--) {
		System.out.println(string_array [i]);
	}
	
	
	}

}
