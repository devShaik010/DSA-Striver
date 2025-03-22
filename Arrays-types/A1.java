public class A1 {
   public static void main(String[] args) {

    // There is one way of using array ... after declaring ..
     int[] number;
     number = new int[10];
     number[0] = 10;
     number[1] = 20;            
     System.out.println(number[0]);

     // Another way of using array ... declaring and initializing at the same time
     int[] number2 = {10,20,30};
     System.out.println(number2[0]);

     int number3[] = {10,20,30};    
     System.out.println(number3[0]);

    
   }    
}
