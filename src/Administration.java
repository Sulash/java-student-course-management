import jdk.nashorn.internal.ir.CatchNode;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Administration {
    Student std;
    Instructor instruct;
    UserRegistration reg;
    ArrayList<Integer> courseSelected = new ArrayList<Integer>(2);

    public Administration(){
        reg= new UserRegistration();
        displayFunction();

    }

    public void displayFunction(){
        Scanner scan= new Scanner(System.in);
        int choose;
        System.out.println("==================================================");
        System.out.println("Please choose index to perform certain task according ");
        System.out.println("==================================================");
        System.out.println("1.Add a module");
        System.out.println("2.Update a module");
        System.out.println("3.Remove a module(temporary)");
        System.out.println("4.Assign a module");
        System.out.println("5.Delete a module(permanent)");
        System.out.println("6.Assign an instructor");
        System.out.println("7.Remove an instructor");
        System.out.println("8.Back to main menu");
        System.out.println("9.Exit");
        System.out.println("==================================================");
        System.out.println("Index:");
        choose=scan.nextInt();
        switch (choose){
            case 1:
                displayLevel();
                addModule();
                System.out.println("==================================================");
                System.out.println("Module has been added");
                System.out.println("==================================================");
                displayFunction();
                break;
            case 2:
                displayLevel();
                updateModule();
                System.out.println("==================================================");
                System.out.println("Module has been updated");
                System.out.println("==================================================");
                displayFunction();
                break;
            case 3:
                displayLevel();
                removeModule();
                System.out.println("==================================================");
                System.out.println("Module has been removed");
                System.out.println("==================================================");
                displayFunction();
                break;
            case 4:
                displayLevel();
                assignModule();
                System.out.println("==================================================");
                System.out.println("Module has been assigned");
                System.out.println("==================================================");
                displayFunction();
                break;
            case 5:
                displayLevel();
                deleteModule();
                System.out.println("==================================================");
                System.out.println("Module has been deleted");
                System.out.println("==================================================");
                displayFunction();
                break;
            case 6:
                new Instructor();
                System.out.println("==================================================");
                System.out.println("New instructor profile is added");
                System.out.println("==================================================");
                break;
            case 7:
                new Instructor(7);
                System.out.println("==================================================");
                System.out.println("Instructor profile is removed");
                System.out.println("==================================================");
                break;
            case 8:
                System.out.println("going back to main menu");
                new Main();
                break;
            case 9:
                System.out.println("Exiting.......");
                System.exit(1);
                break;
            default:
                System.out.println("------------------------");
                System.out.println("Invalid index input.");
                System.out.println("Try again");
                displayFunction();
        }
    }

    public void displayLevel(){

        System.out.println("Choose level that you want to add course:");
        System.out.println("==================================================");
        System.out.println("1. Level 4");
        System.out.println("2. Level 5");
        System.out.println("3. Level 6");
        System.out.println("4. Back to Menu");
        System.out.println("5.Exit");
        System.out.println("==================================================");
        System.out.println("Enter index according to Level you want to add a module");
    }

    public void addModule(){
        int index;
        String garbage;
        String moduleName="",moduleCode;
        Scanner scan =new Scanner(System.in);
        index=scan.nextInt();
        switch(index){
            case 1:
                garbage=scan.nextLine();
                System.out.println("Enter name of module:");
                moduleName=scan.nextLine();
                System.out.println("Enter module code:");
                moduleCode=scan.nextLine();
                reg.addModuleLvlFour(moduleName,moduleCode);
                break;
            case 2:
                garbage=scan.nextLine();
                System.out.println("Enter name of module:");
                moduleName=scan.nextLine();
                System.out.println("Enter module code:");
                moduleCode=scan.nextLine();
                reg.addModuleLvlFive(moduleName,moduleCode);

                break;
            case 3:
                garbage=scan.nextLine();
                System.out.println("Enter name of module:");
                moduleName=scan.nextLine();
                System.out.println("Enter module code:");
                moduleCode=scan.nextLine();
                reg.addModuleLvlSix(moduleName,moduleCode);
                break;
            case 4:
                System.out.println("Going back to the menu");
                new Main();
                break;
            case 5:
                System.out.println("Exiting..........");
                System.exit(1);
        }
    }

    public void updateModule(){

        int index,cnt=0,updateIndex;
        String garbage;
        String moduleName="",moduleCode;
        Scanner scan =new Scanner(System.in);
        index=scan.nextInt();
        switch(index){
            case 1:
                try{
                    ResultSet resultSet=reg.getTableLevelFour();
                    while(resultSet.next()){
                        cnt++;
                        courseSelected.add(resultSet.getInt(1));
                        String model_name = resultSet.getString(2);
                        String model_code = resultSet.getString(3);
                        System.out.println(cnt+"."+model_name+" - "+model_code);
                    }
                }catch(
                        SQLException throwables){
                    throwables.printStackTrace();
                }
                System.out.println("Enter index of the course to update:");
                updateIndex=scan.nextInt();
                garbage=scan.nextLine();
                System.out.println("Enter new model_name:");
                moduleName=scan.nextLine();
                System.out.println("Enter new model_code:");
                moduleCode=scan.nextLine();
                reg.updateModuleFour(moduleName,moduleCode,courseSelected.get(updateIndex-1));
                break;
            case 2:
                try{
                    ResultSet resultSet=reg.getTableLevelFive();
                    while(resultSet.next()){
                        cnt++;
                        courseSelected.add(resultSet.getInt(1));
                        String model_name = resultSet.getString(2);
                        String model_code = resultSet.getString(3);
                        System.out.println(cnt+"."+model_name+" - "+model_code);
                    }
                }catch(
                        SQLException throwables){
                    throwables.printStackTrace();
                }
                System.out.println("Enter index of the course to update:");
                updateIndex=scan.nextInt();
                garbage=scan.nextLine();
                System.out.println("Enter new model_name:");
                moduleName=scan.nextLine();
                System.out.println("Enter new model_code:");
                moduleCode=scan.nextLine();
                reg.updateModuleFive(moduleName,moduleCode,courseSelected.get(updateIndex-1));
                break;
            case 3:
                try{
                    ResultSet resultSet=reg.getTableLevelSix();
                    while(resultSet.next()){
                        cnt++;
                        courseSelected.add(resultSet.getInt(1));
                        String model_name = resultSet.getString(2);
                        String model_code = resultSet.getString(3);
                        System.out.println(cnt+"."+model_name+" - "+model_code);
                    }
                }catch(
                        SQLException throwables){
                    throwables.printStackTrace();
                }
                System.out.println("Enter index of the course to update:");
                updateIndex=scan.nextInt();
                garbage=scan.nextLine();
                System.out.println("Enter new model_name:");
                moduleName=scan.nextLine();
                System.out.println("Enter new model_code:");
                moduleCode=scan.nextLine();
                reg.updateModuleSix(moduleName,moduleCode,courseSelected.get(updateIndex-1));
                break;
            case 4:
                System.out.println("Going back to the menu");
                new Main();
                break;
            case 5:
                System.out.println("Exiting..........");
                System.exit(1);
        }


    }

    public void removeModule(){
        int index,cnt=0,updateIndex;
        String garbage;
        String moduleName="",moduleCode;
        Scanner scan =new Scanner(System.in);
        index=scan.nextInt();
        switch(index){
            case 1:
                try{
                    ResultSet resultSet=reg.getLevelFour();
                    while(resultSet.next()){
                        cnt++;
                        courseSelected.add(resultSet.getInt(1));
                        String model_name = resultSet.getString(2);
                        String model_code = resultSet.getString(3);
                        System.out.println(cnt+"."+model_name+" - "+model_code);
                    }
                }catch(
                        SQLException throwables){
                    throwables.printStackTrace();
                }
                garbage=scan.nextLine();
                System.out.println("Enter index of the course to remove(temporary):");
                updateIndex=scan.nextInt();
                reg.removeModuleFour(courseSelected.get(updateIndex-1));
                break;
            case 2:
                try{
                    ResultSet resultSet=reg.getLevelFive();
                    while(resultSet.next()){
                        cnt++;
                        courseSelected.add(resultSet.getInt(1));
                        String model_name = resultSet.getString(2);
                        String model_code = resultSet.getString(3);
                        System.out.println(cnt+"."+model_name+" - "+model_code);
                    }
                }catch(
                        SQLException throwables){
                    throwables.printStackTrace();
                }
                garbage=scan.nextLine();
                System.out.println("Enter index of the course to remove(temporary):");
                updateIndex=scan.nextInt();
                reg.removeModuleFive(courseSelected.get(updateIndex-1));

                break;
            case 3:
                try{
                    ResultSet resultSet=reg.getLevelSix();
                    while(resultSet.next()){
                        cnt++;
                        courseSelected.add(resultSet.getInt(1));
                        String model_name = resultSet.getString(2);
                        String model_code = resultSet.getString(3);
                        System.out.println(cnt+"."+model_name+" - "+model_code);
                    }
                }catch(
                        SQLException throwables){
                    throwables.printStackTrace();
                }
                garbage=scan.nextLine();
                System.out.println("Enter index of the course to remove(temporary):");
                updateIndex=scan.nextInt();
                reg.removeModuleSix(courseSelected.get(updateIndex-1));


                break;
            case 4:
                System.out.println("Going back to the menu");
                new Main();
                break;
            case 5:
                System.out.println("Exiting..........");
                System.exit(1);
        }

    }

    public void assignModule(){
        int index,cnt=0,updateIndex;
        String garbage;
        String moduleName="",moduleCode;
        Scanner scan =new Scanner(System.in);
        index=scan.nextInt();
        switch(index){
            case 1:
                try{
                    ResultSet resultSet=reg.getTableLevelFour();
                    while(resultSet.next()){
                        cnt++;
                        courseSelected.add(resultSet.getInt(1));
                        String model_name = resultSet.getString(2);
                        String model_code = resultSet.getString(3);
                        System.out.println(cnt+"."+model_name+" - "+model_code);
                    }
                }catch(
                        SQLException throwables){
                    throwables.printStackTrace();
                }
                garbage=scan.nextLine();
                System.out.println("Enter index of the course to assign:");
                updateIndex=scan.nextInt();
                reg.assignModuleFour(courseSelected.get(updateIndex-1));
                break;
            case 2:
                try{
                    ResultSet resultSet=reg.getTableLevelFive();
                    while(resultSet.next()){
                        cnt++;
                        courseSelected.add(resultSet.getInt(1));
                        String model_name = resultSet.getString(2);
                        String model_code = resultSet.getString(3);
                        System.out.println(cnt+"."+model_name+" - "+model_code);
                    }
                }catch(
                        SQLException throwables){
                    throwables.printStackTrace();
                }
                garbage=scan.nextLine();
                System.out.println("Enter index of the course to assign:");
                updateIndex=scan.nextInt();
                reg.assignModuleFive(courseSelected.get(updateIndex-1));

                break;
            case 3:
                try{
                    ResultSet resultSet=reg.getTableLevelSix();
                    while(resultSet.next()){
                        cnt++;
                        courseSelected.add(resultSet.getInt(1));
                        String model_name = resultSet.getString(2);
                        String model_code = resultSet.getString(3);
                        System.out.println(cnt+"."+model_name+" - "+model_code);
                    }
                }catch(
                        SQLException throwables){
                    throwables.printStackTrace();
                }
                garbage=scan.nextLine();
                System.out.println("Enter index of the course to assign:");
                updateIndex=scan.nextInt();
                reg.assignModuleSix(courseSelected.get(updateIndex-1));


                break;
            case 4:
                System.out.println("Going back to the menu");
                new Main();
                break;
            case 5:
                System.out.println("Exiting..........");
                System.exit(1);
        }

    }

    public void deleteModule(){
        int index,cnt=0,updateIndex;
        String garbage;
        String moduleName="",moduleCode;
        Scanner scan =new Scanner(System.in);
        index=scan.nextInt();
        switch(index){
            case 1:
                try{
                    ResultSet resultSet=reg.getLevelFour();
                    while(resultSet.next()){
                        cnt++;
                        courseSelected.add(resultSet.getInt(1));
                        String model_name = resultSet.getString(2);
                        String model_code = resultSet.getString(3);
                        System.out.println(cnt+"."+model_name+" - "+model_code);
                    }
                }catch(
                        SQLException throwables){
                    throwables.printStackTrace();
                }
                garbage=scan.nextLine();
                System.out.println("Enter index of the course to remove(temporary):");
                updateIndex=scan.nextInt();
                reg.deleteModuleFour(courseSelected.get(updateIndex-1));
                break;
            case 2:
                try{
                    ResultSet resultSet=reg.getLevelFive();
                    while(resultSet.next()){
                        cnt++;
                        courseSelected.add(resultSet.getInt(1));
                        String model_name = resultSet.getString(2);
                        String model_code = resultSet.getString(3);
                        System.out.println(cnt+"."+model_name+" - "+model_code);
                    }
                }catch(
                        SQLException throwables){
                    throwables.printStackTrace();
                }
                garbage=scan.nextLine();
                System.out.println("Enter index of the course to remove(temporary):");
                updateIndex=scan.nextInt();
                reg.deleteModuleFive(courseSelected.get(updateIndex-1));

                break;
            case 3:
                try{
                    ResultSet resultSet=reg.getLevelSix();
                    while(resultSet.next()){
                        cnt++;
                        courseSelected.add(resultSet.getInt(1));
                        String model_name = resultSet.getString(2);
                        String model_code = resultSet.getString(3);
                        System.out.println(cnt+"."+model_name+" - "+model_code);
                    }
                }catch(
                        SQLException throwables){
                    throwables.printStackTrace();
                }
                garbage=scan.nextLine();
                System.out.println("Enter index of the course to remove(temporary):");
                updateIndex=scan.nextInt();
                reg.deleteModuleSix(courseSelected.get(updateIndex-1));


                break;
            case 4:
                System.out.println("Going back to the menu");
                new Main();
                break;
            case 5:
                System.out.println("Exiting..........");
                System.exit(1);
        }

    }


}
