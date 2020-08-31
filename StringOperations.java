//Parthiv Adimulam
//AP Computer Science A
//August 28, 2020
public class StringOps {
    public static void main(String args[]) {
   
   //challenge 1
   String one = "Scissors";
   String two = "Picture";
   String three = "Computer";

   String smallOne = one.substring(0,4);
   String bigOne = one.substring(4,8);
   String smallTwo = two.substring(0,3);
   String bigTwo = two.substring(3,7);
   String smallThree = three.substring(0,4);
   String bigThree = three.substring(4,8);

   String a = bigOne + smallOne;
   String b = bigTwo + smallTwo;
   String c = bigThree + smallThree;

   System.out.println(a.toLowerCase());
   System.out.println(" ");
   System.out.println(b.toLowerCase());
   System.out.println(" ");
   System.out.println(c.toLowerCase());
   
   //challenge 2
   System.out.println("     __ ");
   System.out.println("(___()'`;");
   System.out.println("/,    /` ");
   System.out.println("\\\\\"--\\\\ ");
  
   }
}
