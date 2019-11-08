package fractions;

import java.util.*;

public class Fraction
{
private Scanner scan = new Scanner(System.in);
private int num=1;
private int denom=1;

public Fraction()
{
}

public Fraction(int n, int d)
{
// Fill in code (good to use setFraction)
setFraction(n,d);
}

public void setFraction(int n, int d)
{
//Fill in code ... don't forget to reduce

num=n;
denom=d;
reduce();
}
public int gcd(int a, int b)     //Euclids algorithm
{while(a!=b)
   {if(a>b)
      a -= b;
    else
      b -= a;
   }
return a;
}       
public Fraction add(Fraction op)
{
//Fill in code ... don't forget to reduce
// Algebra HINT: a/b + c/d = (a*d + b*c)/(b*d)

num = this.num*op.denom+op.num*this.denom;
denom = this.denom*op.denom;
reduce();
return new Fraction(num,denom);
}

public Fraction subtract(Fraction op)
{
//Fill in code ... don't forget to reduce
// Algebra HINT: a/b - c/d = (a*d - b*c)/(b*d)
num = this.num*op.denom-op.num*this.denom;
denom = this.denom*op.denom;
reduce();
return new Fraction(num,denom);
}

public Fraction multiply(Fraction op)
{
//Fill in code ... don't forget to reduce
// Algebra HINT: a/b * c/d = (a*c)/ (b*d)
    num = this.num*op.num;
    denom = this.denom*op.denom;
    reduce();
return new Fraction(num,denom);
}

public Fraction divide(Fraction op)
{
//Fill in code ... don't forget to reduce
// Algebra HINT: a/b / c/d = (a*d)/ (b*c)

    num = this.num*op.denom;
    denom = this.denom*op.num;
    reduce();
    return new Fraction(num,denom);
}


private void reduce()
{
// Pseudo code:
// set smaller = minimum ( abs(num), abs(denom));
// Loop through the possible divisors: 2, 3, 4, ... smaller
// For each possible divisor:
// while (num and denom are evenly divisible by divisor)
// {
// num /= divisor;
// denom /= divisor;
// smaller /= divisor;
// }
int factor=gcd(num,denom);
num/=factor;
denom/=factor;

}

public boolean equals(Fraction f)
{
// Assuming all fractions are reduced
// Fill in code
if(num==f.num&&denom==f.denom)
       return true;
else
       return false;
}

public String toString()
{
// Fill in code
String output;
if(num<denom)
    output =" "+num+"/"+denom;
else
    {int whole=num/denom;
    output=" "+whole+" "+num%denom+"/"+denom;
    }
return output;
}

public void readin(String label)
{
while (true) // Keep trying if bad input is received
{
System.out.println(label);
String temp = scan.next();
temp = temp.trim(); // get rid of white space at the beginning and end
int index = temp.indexOf('/');
if (index >= 0)
{
String numStr = temp.substring(0, index);
String denomStr = temp.substring(index+1);
int n = Integer.parseInt(numStr);
int d = Integer.parseInt(denomStr);
setFraction(n,d);
return;
}
else
System.out.println("Input Fraction missing / ");
}//Keep trying until you get it right
}

public static void main(String[] args)
{
Fraction f1= new Fraction();
Fraction f2= new Fraction();
Fraction f3=null;
Scanner scan = new Scanner(System.in);

while(true)
{
System.out.println("Enter operation: + - * / q (q ==> quit) : ");
String input = scan.next();
if (input.charAt(0) == 'q') return; // All done

f1.readin("Enter Fraction 1: ");
f2.readin("Enter Fraction 2: ");
System.out.println("f1 = " + f1);
System.out.println("f2 = " + f2);

if (f1.equals(f2))
System.out.println("f1 and f2 are equal");
else
System.out.println("f1 and f2 are not equal");

switch (input.charAt(0))
{
case '+':
f3 = f1.add(f2);
System.out.println("f1+f2=" + f3);
break;

case '-':
f3 = f1.subtract(f2);
System.out.println("f1-f2=" + f3);
break;

case '*':
f3 = f1.multiply(f2);
System.out.println("f1*f2="+f3);
break;

case '/':
f3 = f1.divide(f2);
System.out.println("f1/f2="+f3);
break;

default:
System.out.println("Illegal command: " + input );
break;

}
}// end of while loop

} // end of main
}