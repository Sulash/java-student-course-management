import com.mysql.cj.protocol.Resultset;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Instructor extends Student{
    UserRegistration reg;
    ArrayList<Integer> marker= new ArrayList<Integer>(2);


    public Instructor() {
        reg= new UserRegistration();
        setAuthentic();

    }
    public Instructor(int a){
       reg=new UserRegistration();
        removeInstructor();
    }
    public Instructor(int a, int b){
        reg= new UserRegistration();
        displayMark();
    }


    void setAuthentic(){
        Scanner scan = new Scanner(System.in);
        int flag;
        String ans;
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

            //input for userName
            int max=1210;
            int min=1100;
            int range=max-min+1;
            //System.out.println("Your new college ID is:"+(int)(Math.random()*range+min));
            String placeholder = "np" + (int) (Math.random() * range + min) + "@gmail.com";
            setUserName(placeholder);


            //input for password
            do{
                System.out.println("Enter your password(<12 char):");
                setPassword(scan.nextLine());
                String val=getPassword();
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
            System.out.println("Password Name:"+getPassword());
            System.out.println("==================================================");
            System.out.println("Do you want to proceed with this information?");
            System.out.println("Enter any key to proceed or enter \"no\" to enter your information again.");
            ans=scan.nextLine();

        }while (ans.toLowerCase().contentEquals("no"));
        reg.addInstructor(getFirstName(),getLastName(),getAddress(),getDob(),getUserName(),getPassword());
        displayInstructorInfo();
        //assignInstructor();
        new Main();

    }

    public void assignInstructor(){
        int cnt=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("In which level do you want to assign");
        System.out.println("1. Level 4");
        System.out.println("2. Level 5");
        System.out.println("3. Level 6");
        System.out.println("4. Back to Menu");
        System.out.println("5.Exit");
        System.out.println("Enter the index number:");
        int index = scan.nextInt();
        switch (index){
            case 1:

                System.out.println("Enter the id of the course to assign instructor:");

                break;
            case 2:
                displayLevelFiveModules();
                break;
            case 3:
                displayLevelSixModules();
                System.out.println("eee");
                break;
            case 4:
                new Main();
            case 5:
                System.out.println("Exiting...");
                System.exit(1);
        }
        System.out.println("Enter the id of the course to assign instructor:");
        int updateIndex=scan.nextInt();
        //reg.removeInstructor(marker.get(updateIndex-1));
    }
    public void removeInstructor(){
        int cnt=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("Removing a instructor");
        System.out.println("==================================================");
        try{
            ResultSet resultSet=null;
            resultSet=reg.displayInstructor();
            while(resultSet.next()){
                cnt++;
                marker.add(resultSet.getInt("id"));
                String fname= resultSet.getString("fname");
                String lname= resultSet.getString("lname");
                String address= resultSet.getString("address");
                String dob= resultSet.getString("dob");
                String username= resultSet.getString("username");
                String password= resultSet.getString("password");

                System.out.println("Id number:"+cnt);
                System.out.println("First Name:"+fname);
                System.out.println("Last Name:"+lname);
                System.out.println("Address:"+address);
                System.out.println("Date of birth(yyyy-mm-dd):"+dob);
                System.out.println("Username:"+username);
                System.out.println("Password:"+password);
                System.out.println("==================================================");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        System.out.println("Enter the id of instructor that you want to remove from above list:");
        int updateIndex=scan.nextInt();
        reg.removeInstructor(marker.get(updateIndex-1));

    }

    public void displayInstructorInfo(){

        System.out.println("==================================================");
        System.out.println("Instructor profile successfully created...");
        System.out.println("==================================================");
        System.out.println("First Name:"+getFirstName());
        System.out.println("Second Name:"+getLastName());
        System.out.println("Address:"+getAddress());
        System.out.println("Date of birth:"+getDob());
        System.out.println("Username:"+getUserName());
        System.out.println("Password Name:"+getPassword());
        System.out.println("Please remember your user name and password.");
        System.out.println("==================================================");

    }

    void displayMark(){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> sub1= new ArrayList<String>(2);
        ArrayList<String> sub2= new ArrayList<String>(2);
        ArrayList<String> sub3= new ArrayList<String>(2);
        ArrayList<String> sub4= new ArrayList<String>(2);
        ArrayList<String> sub5= new ArrayList<String>(2);
        ArrayList<String> sub6= new ArrayList<String>(2);
        ArrayList<String> sub7= new ArrayList<String>(2);
        ArrayList<String> sub8= new ArrayList<String>(2);
        int cnt=0;
        try{
            ResultSet resultset = reg.displayStudent();
            while (resultset.next()){
                cnt++;
                marker.add(resultset.getInt(1));
                String fname = resultset.getString(2);
                String lname = resultset.getString(3);
                sub1.add(resultset.getString(4));
                sub2.add(resultset.getString(5));
                sub3.add(resultset.getString(6));
                sub4.add(resultset.getString(7));
                sub5.add(resultset.getString(8));
                sub6.add(resultset.getString(9));
                sub7.add(resultset.getString(10));
                sub8.add(resultset.getString(11));
                System.out.println(cnt+"."+fname + " "+ lname);
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }

        System.out.println("Enter index to generate marksheet:");
        setId(scan.nextInt());
        int max=100;
        int min=0;
        float sum;
        int range=max-min+1;
        //(int)(Math.random()*range+min)
        if(getId()==marker.get(getId()-1))
        {
            int marks1=(int)(Math.random()*range+min);
            int mark2=(int)(Math.random()*range+min);
            int mark3=(int)(Math.random()*range+min);
            int mark4=(int)(Math.random()*range+min);
            int mark5=(int)(Math.random()*range+min);
            int mark6=(int)(Math.random()*range+min);
            int mark7=(int)(Math.random()*range+min);
            int mark8=(int)(Math.random()*range+min);

            System.out.println(sub1.get(getId()-1)+" - "+marks1);
            System.out.println(sub2.get(getId()-1)+" - "+mark2);
            System.out.println(sub3.get(getId()-1)+" - "+mark3);
            System.out.println(sub4.get(getId()-1)+" - "+(mark4));
            System.out.println(sub5.get(getId()-1)+" - "+(mark5));
            System.out.println(sub6.get(getId()-1)+" - "+(mark6));
            System.out.println(sub7.get(getId()-1)+" - "+(mark7));
            System.out.println(sub8.get(getId()-1)+" - "+(mark8));
            sum=(marks1+mark2+mark3+mark4+mark5+mark6+mark7+mark8)/8;
            System.out.println("Total percentage:"+ sum);
        }

        //System.out.println(sub1.get(0));





    }

}
