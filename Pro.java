
import java.util.Scanner;
import static java.lang.Math.pow;
class Pro{
    public static void main(String [] agrs)
    {
      //  Movie obj = new  Movie();
        Scanner in= new Scanner(System.in);
        String choose;
        System.out.print("choose the what you want \n =");
        System.out.println("Addition");
        System.out.println("Swapping");
        System.out.println("SimpleIntrest");
        System.out.println("palindrome");
        System.out.println("Armstrong");
        choose=in.nextLine();

        switch (choose){
            case "Addition" :
            {
                Movie.sum();
                break;
            }
            case "Swapping" :
            {
                Movie.swaping();
                break;
            }
            case "SimpleIntrest" :
            {
                Movie.simpleIntrest();
                break;
            }
            case "palindrome" :
            {
                Movie.palindrome();
                break;
            }
            case "Armstrong" :
            {
                Movie.armstrong();
                break;
            }
        }

    }

}

class Movie{

    static void sum(){
        int a,b,c=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of A");
        a= sc.nextInt();
        System.out.println("Enter the value of B");
        b= sc.nextInt();
        c=a+b;
        System.out.println("Answer"+c);
    }
    static void swaping()
    {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of A");
        a= sc.nextInt();
        System.out.println(" Enter the value of B");
        b= sc.nextInt();
        System.out.println("Before Swapping A ="+a+" \nB ="+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After Swapping A ="+a+" \nB ="+b);

    }

    static void simpleIntrest(){
        int Principal_Amont,rate,time,simpleIntrest;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        Principal_Amont=sc.nextInt();
        System.out.println("Enter Rate");
        rate=sc.nextInt();
        System.out.println("Enter time");
        time=sc.nextInt();

        simpleIntrest=(Principal_Amont*rate*time)/100;
        System.out.println("Simple Intrest is ="+simpleIntrest);

    }
    static void palindrome(){
        Scanner imp = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a palindrome:");
        int number = imp.nextInt();

        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int reminder = number % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            number /= 10;
        }

        if (originalNumber == reversedNumber)
            System.out.println(originalNumber + " is a palindrome number.");
        else
            System.out.println(originalNumber + " is not a palindrome number.");
    }



    static void armstrong(){
       Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number to check if it's an Armstrong number:");
        int number = inp.nextInt();

        int originalNumber = number;
        int sum = 0;
        int reminder;

        while (number != 0) {
            reminder = number % 10;
            sum += Math.pow(reminder, 3);
            number /= 10;
        }

        if (sum == originalNumber)
            System.out.println(originalNumber + " is an Armstrong number.");
        else
            System.out.println(originalNumber + " is not an Armstrong number.");
    }


}
