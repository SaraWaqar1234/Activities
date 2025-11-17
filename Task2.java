import java.util.Scanner;
     public class Task2{
          public static void main(String[] args){
           Scanner inp=new Scanner(System.in);
           System.out.println("Enter a string: ");
           String name=inp.nextLine();
           name=name.replaceAll("\\s+","").toLowerCase();
           String reversed=new StringBuilder(name).reverse().toString();
          if(name.equals(reversed)){
             System.out.println("Palindrome");
           }else
             System.out.println("Not Palindrome"); 
        }
  }
      