package pckg_exc1;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        double num;
//        System.out.println("Please enter one number - double expected:");
//        num = sc.nextDouble();
//        System.out.println("You have entered: " + num);
//        String filePath = "C:\\Users\\aerro\\IdeaProjects\\OOP_23_24\\CODE_OPP\\src\\pckg_exc1\\primjer.txt";
//        try {
//            ReadContentCls.readFromFile(filePath);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

        userAge();
    }

    private static void userAge(){
        Scanner scanner = new Scanner(System.in);
        int userDefineAge;
        boolean proceedInput = true;
        while (proceedInput){
            try{
                System.out.println("Plese enter your age...");
                userDefineAge = scanner.nextInt();
                if (userDefineAge < 0){
                    throw new Exception("Negative value for age is not allowed");
                }
                System.out.println("User defined age: " + userDefineAge);

            } catch (InputMismatchException ime){
                scanner.next();
                System.out.println("Wrong input");
            } catch (Exception nve) {
                System.out.println(nve.getMessage());
            } finally {
                System.out.println("Enter any number for proceed - other for exit!");
                if(scanner.hasNextInt()){
                    int cont = scanner.nextInt();
                    System.out.println("You choose to continue...");
                } else {
                    proceedInput = false;
                    System.out.println("Finished with input!");
                    scanner.close();
                }
            }
        }




    }
}
