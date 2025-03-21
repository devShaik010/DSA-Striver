import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Input {
    public static void main(String[] args) {
         Scanner i = new Scanner(System.in);
         System.out.print("Enter the number : ");
         
         int number = i.nextInt();
         System.out.println("The number square is : "+number*number);

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Enter the name : ");
         try {
             String name = br.readLine();
             System.out.println("The name is :"+name);
         } catch (IOException e) {
             e.printStackTrace();
         }
    }
}
