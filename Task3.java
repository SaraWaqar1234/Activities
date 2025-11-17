import java.util.Scanner;
    public class Task3{
       public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String name=inp.nextLine();
        name=name.toLowerCase();
        int i=0;
      while(i<name.length()){
          char ch=name.charAt(i);
      if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.print("V ");
                } else 
                    System.out.print("C ");
            }
            i++;
        }
    }
}
          
        
        
        