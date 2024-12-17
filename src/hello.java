import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("hello in the calculator");
        System.out.println("1-Basic \n2-advanced \n3-financial");
        System.out.println("please enter your choose: ");
        int choose = input.nextInt();
        switch (choose) {
            case 1 : basicCalculator();break;
            case 2 : advancedCalculator();break;
            case 3 : financialCalculator();break;
            default:
                System.out.println("please enter valid num");
        }
    }
    static void basicCalculator (){
        Scanner input = new Scanner(System.in);
        System.out.println("hello in basic calculator");
        System.out.println(" 1-Mult \n 2-Sub \n 3-sum \n 4-div ");
        System.out.println("your choise");
        int basicChoise = input.nextInt();
        System.out.println("please enter first num ");
        double firstNum = input.nextDouble();
        System.out.println("please enter secound num ");
        double secoundNum = input.nextDouble();
        double result =0.0;
        switch (basicChoise){
            case 1 :result= multiply(firstNum ,secoundNum) ;break;
            case 2 :result= sub(firstNum ,secoundNum) ; break;
            case 3 :result= sum(firstNum ,secoundNum) ; break;
            case 4 :result= div(firstNum ,secoundNum) ; break;

        }
        System.out.println("the result is: " + result);
    }
    static double multiply (double num1 , double num2 ){
        return num1*num2;
    }
    static double sub (double num1 , double num2 ){
        return num1-num2;
    }
    static double sum (double num1 , double num2 ){
        return num1+num2;
    }
    static double div (double num1 , double num2 ){
        return num1/num2;
    }
    static void advancedCalculator (){
        Scanner input = new Scanner(System.in);
        System.out.println("hello in Adavanced calculator");
        System.out.println("1-meter to cm \n2-km to meter  ");
        System.out.println("your choise");
        int basicChoose = input.nextInt();
        System.out.println("please enter your valu");
        int valu = input.nextInt();

        switch (basicChoose){
            case 1 :
                System.out.println("the result is :"+MeterToCm(valu));break;
            case 2 :
                System.out.println("the result is :"+KmToMeter(valu));break;
        }

    }
    static int MeterToCm (int meter ){
        return meter*100;
    }
    static int KmToMeter (int km  ){
        return km/1000;
    }
    static void financialCalculator (){
        Scanner input = new Scanner(System.in);
        System.out.println("1-us to egy \n2-egy to us\n3-sra to egy");
        System.out.println("please enter your choise");
        int basicChoose = input.nextInt();
        System.out.println("please enter count");
        double count = input.nextDouble();
        switch (basicChoose){
            case 1 :
                System.out.println("the count is " + UsToEgy(count) ); break;
            case 2 :
                System.out.println("the count is " + EgyToUs(count) ); break;
            case 3 :
                System.out.println("the count is " + SraToEgy(count) ); break;

        }
    }
    static double UsToEgy (double count ){
        return count/50;
    }
    static double EgyToUs (double count ){
        return count*50;
    }
    static double SraToEgy (double count ){
        return count/13;
    }


}
