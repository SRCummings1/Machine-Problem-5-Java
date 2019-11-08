package string_array;
public class firstNames {
   public static void main(String[] args) {
       // TODO Auto-generated method stub
       String string_array[] =new String[]{"George", "Fred", "Sam", "Mary", "Sarah", "Bella", "Joy", "Rita", "Marta", "Sue", "Nancy"}; //define string array string
      
       System.out .println("The array before sort"); //prints the array
       for(int i=0 ; i <= string_array.length - 1 ; i++){
           System.out.println(string_array [i]);
       }
       System.out .println("The array after sort"); //prints the array from last to first
       for(int i=string_array.length - 1 ; i >= 0 ; i--){
           System.out.println(string_array [i]);
       }
   }
}