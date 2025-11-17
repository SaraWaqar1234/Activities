import java.util.Scanner;
   public class What{
     public static void main(String[] args){
       Scanner inp=new Scanner(System.in);
        int count=0;
        int num=0;
        int i=1;
        int negative=0;
        int positive=0;
        int total=0;
        while(i<=10){
        System.out.println("Enter a number: ");
        num=inp.nextInt();
        if(num<0){
         negative++;
         total=total+num;
         count++;
        }else if(num>0){
         positive++;
         total=total+num;
         count++;
         }
      i++;
   }
     double average=0;
  if(count!=0){
     average=(double)total/count;
}
 System.out.println("Positive numbers: "+positive);
  System.out.println("Negative numbers: "+negative);
  System.out.println("total excluding zeroes: "+total);
  System.out.println("average: "+average);
}}
             