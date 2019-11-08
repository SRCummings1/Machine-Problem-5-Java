

package one_dimensional_array;
import java.util.Scanner;
public class OneDimensionalArrays {

int[] createIntegers(int size_of_array)
{
// Your code will create an array of ints as large as specified in size_of_array
// Fill the array in with the values: 0, 100, 200, 300, ....
// Return the array that you just created
int arr[]=new int[size_of_array];
for(int i=0;i<size_of_array;i++){
arr[i]=i*100;
}
return arr;
}
void printArray(int[] myArray)
{
// Print out your array with one number per line. Get the size of the
// array from the "myArray" parameter (no hard coding the size)
int size_of_array = myArray.length;
for(int i=0;i<size_of_array;i++){
System.out.println(myArray[i]);
}
}

public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);

System.out.println("Enter size of array to create: ");
int num = keyboard.nextInt();
// Construct an instance of the OneDimensionalArrays class
// Using this object instance, call createIntegers to create
// an array of integers. Don't forget to save the results
// Then call the printArray method to print out the contents
// of your array.
OneDimensionalArrays oneDimensionalArrays = new OneDimensionalArrays();
int arr[]=oneDimensionalArrays.createIntegers(num);
oneDimensionalArrays.printArray(arr);


}
}
