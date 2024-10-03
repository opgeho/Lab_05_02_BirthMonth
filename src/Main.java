import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int month = 0;
        String trash = "";

        System.out.println("Enter your birth month: ");
        if(in.hasNextInt())
        {
            month = in.nextInt();
            in.nextLine();
            if(month >= 1 && month <= 12){
                System.out.println("Your birth month is: " + month);
            }
            else {
                System.out.println("your input " + month + " is not valid! please restart the program and try again!");
            }

        }
        else
        {
            trash = in.nextLine();
            System.out.println("your input " + trash + " is not valid! please restart the program and try again!");
        }
    }
}