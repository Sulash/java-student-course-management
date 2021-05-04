import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student  {
    UserRegistration reg;
    public int id;
    public String firstName;
    public String lastName;
    public String address;
    public String dob;
    public String gender;
    public String guardianName;
    public String userName;
    public String password;
    public int level;
    ArrayList<Integer> courseSelected = new ArrayList<Integer>(2);
    ArrayList<String> moduleName = new ArrayList<String>(2);

    public Student(){
        reg= new UserRegistration();
    }
    public Student(int a){
        reg= new UserRegistration();
        userType();
    }

    //getter method for firstName
    public String getFirstName() {
        return firstName;
    }

    //setter method for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //getter method for lastName
    public String getLastName() {
        return lastName;
    }

    //setter method for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //getter method for address
    public String getAddress() {
        return address;
    }

    //setter method for address
    public void setAddress(String address) {
        this.address = address;
    }

    //getter for date of birth
    public String getDob() {
        return dob;
    }

    //setter for dob
    public void setDob(String dob) {
        this.dob = dob;
    }

    //getter for gender
    public String getGender() {
        return gender;
    }

    //setter for gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    //getter for guardianName
    public String getGuardianName() {
        return guardianName;
    }

    //setter for guardianName
    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    //getter for userName
    public String getUserName() {
        return userName;
    }

    //setter for userName
    public void setUserName(String userName) {
        this.userName = userName;
    }

    //getter for password
    public String getPassword() {
        return password;
    }

    //setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    //getter for level
    public int getLevel(){
        return level;
    }
    
    //setter for level
    public void setLevel(int level){
        this.level=level;
    }

    //getter for Id
    public int getId() {
        return id;
    }

    //setter for Id
    public void setId(int id) {
        this.id = id;
    }

    public void userType(){
        Scanner scan = new Scanner(System.in);
        int userTypeIndex=0;
        System.out.println("Are you going to log in as:");
        System.out.println("1.New Registration");
        System.out.println("2.View Routine");
        System.out.println("Please enter an index to continue:");
        userTypeIndex=scan.nextInt();
        switch (userTypeIndex){
            case 1:
                System.out.println("New Registration");
                levelChoose();
                break;
            case 2:
                System.out.println("showing routine");
                displayRoutine();
                break;
            default:
                System.out.println("Please enter a valid index.");
                userType();
                break;

        }
    }

    public void displayRoutine(){
        try{
            ResultSet resultSet = reg.displayRoutine();
            while (resultSet.next()){
                String fname = resultSet.getString(2);
                String lname = resultSet.getString(3);
                String course = resultSet.getString(4);

                System.out.println(fname+" "+lname+" - "+course);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

     public void displayLevelFourModules(){
        int cnt=0;
         System.out.println("==================================================");
         System.out.println("The courses are in level 4: ");
         System.out.println("==================================================");
          try{
              ResultSet resultSet=reg.getLevelFour();
              while(resultSet.next()){
                  cnt++;
                  courseSelected.add(resultSet.getInt(1));
                  moduleName.add( resultSet.getString(2));
                  String model_code = resultSet.getString(3);
                  System.out.println(cnt+"."+moduleName.get(cnt-1)+" - "+model_code);
              }
          }catch(SQLException throwables){
              throwables.printStackTrace();
          }
          reg.insertStdProfile(getFirstName(),getLastName(),moduleName.get(0),moduleName.get(1),moduleName.get(2),moduleName.get(3),moduleName.get(4),moduleName.get(5),moduleName.get(6),moduleName.get(7));
         System.out.println("==================================================");
     }

     public  void displayLevelFiveModules(){
        int cnt=0;
         System.out.println("==================================================");
         System.out.println("The courses are in level 5: ");
         System.out.println("==================================================");
         try{
              ResultSet resultSet=reg.getLevelFive();
              while(resultSet.next()){
                  cnt++;
                  moduleName.add( resultSet.getString(2));;
                  String model_code = resultSet.getString(3);
                  System.out.println(cnt+"."+moduleName.get(cnt-1)+" - "+model_code);
              }
          }catch(SQLException throwables){
              throwables.printStackTrace();
        }
         reg.insertStdProfile(getFirstName(),getLastName(),moduleName.get(0),moduleName.get(1),moduleName.get(2),moduleName.get(3),moduleName.get(4),moduleName.get(5),moduleName.get(6),moduleName.get(7));
         System.out.println("==================================================");
     }

     public void displayLevelSixOptionalModule(){
         Scanner scan = new Scanner(System.in);
         String model_name,model_code;
         ArrayList<String> temp= new ArrayList<String>(2);
        try{

            int cnt=0,choose;
             ResultSet resultSet=reg.getLevelSixOptional();
             while(resultSet.next()){
                 cnt++;
                 courseSelected.add(resultSet.getInt(1));
                 temp.add(resultSet.getString(2));
                 model_code = resultSet.getString(3);

                 System.out.println(cnt+"\t"+temp.get(cnt-1)+" - "+model_code);
             }
            System.out.println("Please choose first index number from above course:");
            choose=scan.nextInt();
            //System.out.println(courseSelected.get(choose-1));
            moduleName.add(temp.get(cnt-1));
            System.out.println("Course has been added.");
            System.out.println("==================================================");
            System.out.println("Please choose second index number from above course:");
            choose=scan.nextInt();
            moduleName.add(temp.get(cnt-1));
            System.out.println("Course has been added.");
            //System.out.println(courseSelected.get(choose-1));
            reg.insertStdProfile(getFirstName(),getLastName(),moduleName.get(0),moduleName.get(1),moduleName.get(2),moduleName.get(3),moduleName.get(4),moduleName.get(5),moduleName.get(6),moduleName.get(7));
        }catch(SQLException throwables){
             throwables.printStackTrace();
         }
     }

     public void displayLevelSixModules(){
        int cnt=0;
         System.out.println("==================================================");
         System.out.println("The courses are in level 6: ");
         System.out.println("==================================================");
          try{
              ResultSet resultSet=reg.getLevelSix();
              while(resultSet.next()){
                  cnt++;
                  moduleName.add( resultSet.getString(2));
                  String model_code = resultSet.getString(3);
                  System.out.println(cnt+"."+moduleName.get(cnt-1)+" - "+model_code);
              }
          }catch(SQLException throwables){
              throwables.printStackTrace();
          }
         System.out.println("==================================================");
         System.out.println("These are the compulsory subject you must enroll with.");
         System.out.println("But you can choose one optional subject for each semester from below list");
         System.out.println("==================================================");
         displayLevelSixOptionalModule();
     }

    public void levelChoose(){
        int levelChoose=1;
        System.out.println("Available level for registration:");
        System.out.println("==================================================");
        System.out.println("1. Level 4");
        System.out.println("2. Level 5");
        System.out.println("3. Level 6");
        System.out.println("4. Back to Menu");
        System.out.println("5.Exit");
        System.out.println("Enter index according to Level you wanna enroll with:");
        Scanner scan = new Scanner(System.in);
        levelChoose=scan.nextInt();
        switch (levelChoose){
            case 1:
                System.out.println("You are going to enroll Level 4");
                setLevel(4);
                setStdAuthentic();
                displayLevelFourModules();
                new Main();
                break;
            case 2:
                System.out.println("You are going to enroll Level 5");
                setLevel(5);
                setStdAuthentic();
                displayLevelFiveModules();
                new Main();
                break;
            case 3:
                System.out.println("You are going to enroll Level 6");
                setLevel(6);
                setStdAuthentic();
                displayLevelSixModules();
                new Main();
                break;
            case 4:
                System.out.println("going back to main menu");
                new Main();
                break;
            case 5:
                System.out.println("Exiting.......");
                System.exit(1);
                break;

            default:
                System.out.println("Error while entering index of level.");
                System.out.println("Please choose 1, 2 or 3.");
                levelChoose();
                break;
        }
    }

    public void checkGender(){
        Scanner scan = new Scanner(System.in);
        int chooseGender;
        System.out.println("Choose your gender:");
        System.out.println("1.Male\n2.Female\n3.Other");
        chooseGender=scan.nextInt();
        switch (chooseGender){
            case 1:
                setGender("Male");
                break;
            case 2:
                setGender("Female");
                break;
            case 3:
                setGender("Other");
                break;
            default:
                System.out.println("Please enter correct index.");
                checkGender();
                break;
        }
    }

    public void setStdAuthentic(){
        String ans;
        String val;
        int flag;
        String placeholder="";

        System.out.println("Please enter your detail information before enrolling with any courses");
        System.out.println("==================================================");
        Scanner scan = new Scanner(System.in);
        do{
            //input for firstName
            System.out.println("First name:");
            setFirstName(scan.nextLine());

            //input for lastName
            System.out.println("Last name:");
            setLastName(scan.nextLine());

            //input for address
            System.out.println("Enter your address:");
            setAddress(scan.nextLine());

            //input for dob
            System.out.println("Enter your data of birth:");
            System.out.println("Format:(year-month-day),\"-\" is also required.");
            setDob(scan.nextLine());

            //input for gender
            checkGender();

            //input for guardian name
            System.out.println("Enter your guardian's name:");
            setGuardianName(scan.nextLine());

            //input for userName
             int max=1210;
             int min=1100;
             int range=max-min+1;
             //System.out.println("Your new college ID is:"+(int)(Math.random()*range+min));
             placeholder="np"+(int)(Math.random()*range+min)+"@gmail.com";
             setUserName(placeholder);


            //input for password
            do{
                System.out.println("Enter your password(<12 char):");
                setPassword(scan.nextLine());
                val=getPassword();
                if(val.length()>=12){
                    System.out.println("Invalid Password. Please set password less than 12 characters.");
                    flag=1;
                }else{
                    flag=0;
                }
            }while(flag!=0);

            System.out.println("Your given information:");
            System.out.println("==================================================");
            System.out.println("First Name:"+getFirstName());
            System.out.println("Second Name:"+getLastName());
            System.out.println("Address:"+getAddress());
            System.out.println("Date of birth:"+getDob());
            System.out.println("Gender:"+getGender());
            System.out.println("Guardian's Name:"+getGuardianName());
            System.out.println("Password Name:"+getPassword());
            System.out.println("==================================================");
            System.out.println("Do you want to proceed with this information?");
            System.out.println("Enter any key to proceed or enter \"no\" to enter your information again.");
            ans=scan.nextLine();

        }while (ans.toLowerCase().contentEquals("no"));

         reg.insert(getFirstName(),getLastName(),getAddress(),getDob(),getGender(),getGuardianName(),getUserName(),getPassword(),getLevel());
         displayInfo();

    }
    
    public void displayInfo(){

        System.out.println("==================================================");
        System.out.println("Student profile successfully created...");
        System.out.println("First Name:"+getFirstName());
        System.out.println("Second Name:"+getLastName());
        System.out.println("Address:"+getAddress());
        System.out.println("Date of birth:"+getDob());
        System.out.println("Gender:"+getGender());
        System.out.println("Guardian's Name:"+getGuardianName());
        System.out.println("Username:"+getUserName());
        System.out.println("Password Name:"+getPassword());
        System.out.println("Your current level:"+getLevel());
        System.out.println("Please remember your user name and password.");
        System.out.println("==================================================");

    }
}