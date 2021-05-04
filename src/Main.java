import java.io.IOException;
import java.util.Scanner;

public class Main {
    UserRegistration reg;
    Student std;

    public Main(){
        reg= new UserRegistration();
        userDefine();
    }

    //it asks user if the user is a student,an administrator or an instructor
    public void userDefine(){
        int userChoice;
        System.out.println("You are going to logged in as:");
        System.out.println("==================================================");
        System.out.println("1. Student");
        System.out.println("2. Administrator");
        System.out.println("3. Instructor");
        System.out.println("4.Exit");
        System.out.println("==================================================");
        System.out.println("Enter index number from above list:");
        Scanner scan = new Scanner(System.in);
        userChoice = scan.nextInt();
        switch (userChoice){
            case 1:
                System.out.println("You are logging in as a Student...");
                System.out.println("");
                new Student(3);
                break;
            case 2:
                System.out.println("You are logging in as an Administrator...");
                new Administration();
                break;
            case 3:
                System.out.println("You are logging in as an Instructor...");
                new Instructor(1,2);
                break;
            case 4:
                System.out.println("Exiting.........");
                System.exit(1);
                break;
            default:
                System.out.println("Please enter correct index from the list.");
                System.out.println("Index available are :1, 2 and 3");
                userDefine();
                break;
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
