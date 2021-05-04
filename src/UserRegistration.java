import Helpers.DBUtils;
import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRegistration {
    private Connection con;

    public UserRegistration() {
        try {
            con= DBUtils.getDbConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    void insert(String firstName,String lastName,String address,String dob,String gender,String guardianName,
                String userName,String password,int level){

        try {
            String insert= "Insert into student (fname,lname,address,dob,gender,guardian_name,username,password,level) " +
                    "values (?,?,?,?,?,?,?,?,?);";
            PreparedStatement statement=con.prepareStatement(insert);
            statement.setString(1,firstName);
            statement.setString(2,lastName);
            statement.setString(3,address);
            statement.setString(4,dob);
            statement.setString(5,gender);
            statement.setString(6,guardianName);
            statement.setString(7,userName);
            statement.setString(8,password);
            statement.setInt(9,level);

            statement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


    ResultSet checkAuthenticVal(String username,String password){

        try {
            String check= "select * from student where username='?' and password='?'";
            PreparedStatement statement= con.prepareStatement(check);
            statement.setString(1,username);
            statement.setString(2,password);
            return statement.executeQuery(check);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    //selected data only
    ResultSet getLevelFour(){

        try {
            String state ="Select * from level_four where running ='1';";
            PreparedStatement statement =con.prepareStatement(state);
            return  statement.executeQuery(state);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    //return all dataset
    ResultSet getTableLevelFour(){

        try {
            String state ="Select * from level_four;";
            PreparedStatement statement =con.prepareStatement(state);
            return  statement.executeQuery(state);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    //selected data only
    ResultSet getLevelFive(){

        try {
            String state ="Select * from level_five where running ='1';";
            PreparedStatement statement =con.prepareStatement(state);
            return  statement.executeQuery(state);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    //return all dataset
    ResultSet getTableLevelFive(){

        try {
            String state ="Select * from level_five;";
            PreparedStatement statement =con.prepareStatement(state);
            return  statement.executeQuery(state);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    //selected data only
    ResultSet getLevelSix(){

        try {
            String state ="Select * from level_six where running ='1';";
            PreparedStatement statement =con.prepareStatement(state);
            return  statement.executeQuery(state);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    //return all dataset
    ResultSet getTableLevelSix(){

        try {
            String state ="Select * from level_six;";
            PreparedStatement statement =con.prepareStatement(state);
            return  statement.executeQuery(state);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    //selected data only
    ResultSet getLevelSixOptional(){
        try {
            String state ="Select * from level_six where running ='0';";
            PreparedStatement statement =con.prepareStatement(state);
            return  statement.executeQuery(state);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    void addModuleLvlFour(String moduleName,String moduleCode){
        try {
            String insert = "Insert into level_four(model_name,model_code,running) values(?,?,0);";
            PreparedStatement statement =con.prepareStatement(insert);
            statement.setString(1,moduleName);
            statement.setString(2,moduleCode);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    void addModuleLvlFive(String moduleName,String moduleCode){
        try {
            String insert = "Insert into level_five(model_name,model_code,running) values(?,?,0);";
            PreparedStatement statement =con.prepareStatement(insert);
            statement.setString(1,moduleName);
            statement.setString(2,moduleCode);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    void addModuleLvlSix(String moduleName,String moduleCode){
        try {
            String insert = "Insert into level_six(model_name,model_code,running) values(?,?,0);";
            PreparedStatement statement =con.prepareStatement(insert);
            statement.setString(1,moduleName);
            statement.setString(2,moduleCode);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    void updateModuleFour(String modelName,String modelCode ,int id){
        try {
            String update="Update level_four set model_name=?, model_code=?, running=0 where id=?;";
            PreparedStatement statement = con.prepareStatement(update);
            statement.setString(1,modelName);
            statement.setString(2,modelCode);
            statement.setInt(3,id);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    void updateModuleFive(String modelName,String modelCode ,int id){
        try {
            String update="Update level_five set model_name=?, model_code=?, running=0 where id=?;";
            PreparedStatement statement = con.prepareStatement(update);
            statement.setString(1,modelName);
            statement.setString(2,modelCode);
            statement.setInt(3,id);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    void updateModuleSix(String modelName,String modelCode ,int id){
        try {
            String update="Update level_six set model_name=?, model_code=?, running=0 where id=?;";
            PreparedStatement statement = con.prepareStatement(update);
            statement.setString(1,modelName);
            statement.setString(2,modelCode);
            statement.setInt(3,id);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    void removeModuleFour(int id){
        try {
            String update="Update level_four set running=0 where id=?;";
            PreparedStatement statement = con.prepareStatement(update);
            statement.setInt(1,id);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    void removeModuleFive(int id){
        try {
            String update="Update level_five set running=0 where id=?;";
            PreparedStatement statement = con.prepareStatement(update);
            statement.setInt(1,id);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    void removeModuleSix(int id){
        try {
            String update="Update level_six set running=0 where id=?;";
            PreparedStatement statement = con.prepareStatement(update);
            statement.setInt(1,id);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    void assignModuleFour(int id){
        try {
            String update="Update level_four set running=1 where id=?;";
            PreparedStatement statement = con.prepareStatement(update);
            statement.setInt(1,id);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    void assignModuleFive(int id){
        try {
            String update="Update level_five set running=1 where id=?;";
            PreparedStatement statement = con.prepareStatement(update);
            statement.setInt(1,id);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    void assignModuleSix(int id){
        try {
            String update="Update level_six set running=1 where id=?;";
            PreparedStatement statement = con.prepareStatement(update);
            statement.setInt(1,id);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    void deleteModuleFour(int id){
        try {
            String delete="Delete FROM level_four WHERE id=?;";
            PreparedStatement statement = con.prepareStatement(delete);
            statement.setInt(1,id);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    void deleteModuleFive(int id){
        try {
            String delete="Delete FROM level_five WHERE id=?;";
            PreparedStatement statement = con.prepareStatement(delete);
            statement.setInt(1,id);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    void deleteModuleSix(int id){
        try {
            String delete="Delete FROM level_six WHERE id=?;";
            PreparedStatement statement = con.prepareStatement(delete);
            statement.setInt(1,id);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    void addInstructor(String firstName,String lastName,String address,String dob,String userName,String password){
        try {
            String insert= "Insert into instructor (fname,lname,address,dob,username,password) " +
                    "values (?,?,?,?,?,?);";
            PreparedStatement statement=con.prepareStatement(insert);
            statement.setString(1,firstName);
            statement.setString(2,lastName);
            statement.setString(3,address);
            statement.setString(4,dob);
            statement.setString(5,userName);
            statement.setString(6,password);

            statement.executeUpdate();
            statement.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    ResultSet displayInstructor(){
        try {
            String select ="Select * from instructor;";
            PreparedStatement statement =con.prepareStatement(select);
            return  statement.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    void removeInstructor(int id){
        try {
            String delete="Delete FROM instructor WHERE id=?;";
            PreparedStatement statement = con.prepareStatement(delete);
            statement.setInt(1,id);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    void insertStdProfile(String firstName,String lastName,String sub1,String sub2, String sub3, String sub4,String sub5,String sub6,String sub7,String sub8){

        try {
            String select= "insert into student_profile(std_fname,std_lname,sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8) " +
                    "values(?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement statement=con.prepareStatement(select);
            statement.setString(1,firstName);
            statement.setString(2,lastName);
            statement.setString(3,sub1);
            statement.setString(4,sub2);
            statement.setString(5,sub3);
            statement.setString(6,sub4);
            statement.setString(7,sub5);
            statement.setString(8,sub6);
            statement.setString(9,sub7);
            statement.setString(10,sub8);

            statement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    ResultSet displayRoutine(){

        try{
            String select ="Select * from routine";
            PreparedStatement statement = con.prepareStatement(select);
            return statement.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

    ResultSet displayStudent(){
        try{
            String select ="Select * from student_profile";
            PreparedStatement statement = con.prepareStatement(select);
            return statement.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
