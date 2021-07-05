//By Halil Keles 5/7/21
package Assignments;
import java.util.Scanner;


public class A7Q14 {
    public static void main(String[] args) {
        double premium = 0;
        System.out.println("Welcome to Countyfarm insurance");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("Do you have a US drivers license?");
        String license = input.next();
        if (license.equals("y") || license.equals("yes"))
        {
            System.out.println("Enter your zip code");
            int zipCode = input.nextInt();
            if (zipCode == 20910 || zipCode == 20740)
            {
                premium = premium + 60;
            }
            else if (zipCode == 22102 || zipCode == 22103)
            {
                premium = premium + 30;
            }
            else
            {
                premium = premium + 50;
            }
            System.out.println("Is ths vehicle owned,financed or leased");
            String vehicleStat = input.next();
            switch (vehicleStat) {
                case "owned" -> premium = premium + 10;
                case "financed" -> premium = premium + 20;
                case "leased" -> premium = premium + 20;
                default -> {
                    System.err.println("INVALID DATA...");
                    System.err.print("TERMINATING PROGRAM...");
                    System.exit(0);
                }
            }
            System.out.println("Is this vehicle used for business,pleasure or commute?");
            String usage = input.next();
            switch (usage) {
                case "business" -> premium = premium + 50;
                case "pleasure" -> premium = premium + 10;
                case "commute" -> premium = premium + 20;
                default -> {
                    System.err.println("INVALID DATA...");
                    System.err.print("TERMINATING PROGRAM...");
                    System.exit(0);
                }
            }
            System.out.println("Enter how many days you drive the car every week");
            int days = input.nextInt();
             int premiumdys = days * 5;
             premium = premiumdys + premium;

            System.out.println("How many miles do you drive to your destination");
            int miles = input.nextInt();
            premium = premium + miles;
            System.out.println("Enter your age ");
            int age = input.nextInt();
            if (age >= 16 && age < 18)
            {
                premium = premium * 20;
            }
            else if (age > 18 && age <= 21)
            {
                premium = premium * 6;
            }
            else if (age > 21 && age < 25)
            {
                premium = premium * 2;
            }
            else if ( age < 16)
            {
                System.err.println("INVALID DATA");
                System.exit(0);
            }
            else
            {
                premium = premium + 1;// Ben bunu yaptim,yaslilar gennelikle james bond gibi araba surmuyorlar:).
            }
            System.out.println("Enter the years of driving experience");
            int years = input.nextInt();
            int yrs = age - years;
            if ( yrs < 16)
            {
                System.err.println("INVALID DATA");
                System.exit(0);
            }
            else
            {
                premium = premium -(years * 5);
            }
            System.out.println("Did you hav any car accidents in the last 5 years?");
            String accidents = input.next();
            if (accidents.equals("y") || accidents.equals("yes"))
            {
                System.out.println("how many accidents did you have?");
                int accident = input.nextInt();
                premium = premium + (accident * (premium / 5));
            }
            System.out.println("Have you had continous insuance for the past 12 months?");
            String ins = input.next();
            if (ins.equals("n") || ins.equals("no"))
            {
                premium = premium * 2;
            }
            System.out.println("Enter you level of education ");
            String lvlEdu = input.next();
            if (lvlEdu.equals("PHD") || lvlEdu.equals("bachelors") || lvlEdu.equals("masters"))
            {
                premium = premium - (premium * 0.02);
            }
            if (lvlEdu.equals("doctors"))
            {
            premium = premium - (premium * 0.1);
            }
            if (lvlEdu.equals("highschool"))
            {
                premium = premium + (premium * 0.1);
            }
             String num = name.charAt(0)+ name.charAt(1) + age+ name.lastIndexOf( - 1) + name.lastIndexOf(name ) + zipCode + lvlEdu.toUpperCase();
            System.out.println(name+" here's your quote,Start your policy today for $ "+premium+ " reference num = " +num  );
        }
        else
        {
            System.err.print("INVALID DATA");
            System.err.print("TERMINATING PROGRAM...");
            System.exit(0);
        }


    }
}
