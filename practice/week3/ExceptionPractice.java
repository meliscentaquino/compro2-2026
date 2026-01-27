import java.util.*;
public class ExceptionPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int enterNum = input.nextInt();

         try{
            int q = enterNum / 0;
        }catch(Exception e){
            System.out.println("HAHAHAHAHA");
        }
        
        System.out.print("Enter another number: ");
        int num = inputNumber();

        System.out.println("End. BYE BYE!!");      
    }

    public static int inputNumber(){
        int number = 0;
        Scanner input = new Scanner(System.in);
        try{
            number = input.nextInt();
        }catch(Exception e){
            System.out.println("HAHAHAHAHA MALI PARIN");
        }
        return number;
    }
}
