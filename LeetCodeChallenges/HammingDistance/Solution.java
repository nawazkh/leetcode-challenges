/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
*/
/*
Signed and Unsigned shift for java.
he operator ‘>>’ uses the sign bit (left most bit) to fill the trailing
positions after shift. If the number is negative, then 1 is used as a
filler and if the number is positive, then 0 is used as a filler.
For example, if binary representation of number is 10….100, then right
shifting it by 2 using >> will make it 11…….1.
*/

/*
Bitwise operator works on bits and performs bit-by-bit operation. Assume if a = 60 and b = 13; now in binary format they will be as follows −

a = 0011 1100

b = 0000 1101

-----------------

a&b = 0000 1100

a|b = 0011 1101

a^b = 0011 0001

~a  = 1100 0011
*/
public class Solution{
  public static void main(String args[]){
    // int a = -8;
    // System.out.println(a);
    // int b = a >> 1;
    // System.out.println(b);
    // int c = a >> 2;
    // System.out.println(c);
    // int d = a >> 3;
    // System.out.println(d);
    // int e = a >> 4; //
    // System.out.println(e);
    // int test = a&3;
    // System.out.println(test);
    StringBuilder myBuilder = new StringBuilder();
    int a = 19;
    int b = 1;
    boolean runTime = true;
    int count = 0;
    while(runTime){
      System.out.println("----");
      if(a>0 && b>0){
        System.out.println("yes here "+a+" : "+b);
        if(((a&1)==1 && (b&1) != 1 ) || ((a&1) !=1 && (b&1) == 1 )){// means if n has 1 in its bits then output will be 1
          myBuilder.append(1);
          count++;
        }
        a>>= 1;
        b>>= 1;

      }
      else if(a == 0 && b > 0){
        System.out.println("yes here1 "+a+" : "+b);
        if((b&1)==1){
          count++;
        }
        b>>=1;
        if(b == 0){
          runTime = false;
        }
      }
      else if(b == 0 && a > 0){
        System.out.println("yes here2 "+a+" : "+b);
        System.out.println("a Value"+(a&1));
        if((a&1)==1){

          count++;
        }
        a>>=1;
        if(a == 0){
          runTime = false;
        }
      }
      else if(a == 0 && b == 0){
        runTime = false;
      }
      //
      //
      // System.out.println(b);
      //
      // System.out.println(b);
      // if(b == 0){
      //   System.out.println("yes here");
      //
      //   b=1;
      //   System.out.println(b);
      }
    System.out.println(count);
  }
}
