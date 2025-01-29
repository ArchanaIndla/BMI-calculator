import java.util.Scanner;

public class BMIcalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height:");
        double height=sc.nextDouble();
        System.out.println("Enter weight:");
        double weight=sc.nextDouble();
        double BMI=weight/(height*height);
        System.out.println("BMI");
        if(BMI<18.5){
            System.out.println("Under weight");
        }
        else if(BMI>25){
            System.out.println("over weight");
        }
        else{
            System.out.println("normal weight");
        }
        sc.close();
    }
}
