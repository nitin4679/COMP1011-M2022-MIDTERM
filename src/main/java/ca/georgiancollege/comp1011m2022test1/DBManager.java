package ca.georgiancollege.comp1011m2022test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class  DBManager {
    /********************** SINGLETON SECTION **************************/
    //step 1- private static instance member variable
    private static DBManager m_instance = null;
    //step2 - make the default constructor private
    private DBManager(){}
    //step3 - create a public static entry point / instance method
    public static DBManager Instance()
    {
        //step4 - check if the private instance member variable is null
        if(m_instance == null)
        {
            //step5 - Instantiate a new DBManager instance
            m_instance = new DBManager();
        }
        return m_instance;
    }
    /********************************************************************* */


    private static String user = "student";
    private static String password = "123456";
    private static String connectionURL = "jdbc:mysql://localhost:3306/comp1011m2022";
    public  static ArrayList<Student> getStudentFromDb(){
        ArrayList<Student> studentList = new ArrayList<Student>();
        String sql = "select studentnum as student,firstName, lastName, telephone,homeAddress as address, province, avgGrade, major  from students;";

        try (Connection connection = DriverManager.getConnection(connectionURL, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql);)
        {
            while (resultSet.next()){
                Integer student = resultSet.getInt("student");
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                String telephone = resultSet.getString("telephone");
                String address = resultSet.getString("address");
                String province = resultSet.getString("province");
                Integer avgGrade = resultSet.getInt("avgGrade");
                String major = resultSet.getString("major");

                Student newStudentData = new Student(student,firstName,lastName,telephone,address, province, avgGrade, major);
                studentList.add(newStudentData);
            }


        } catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return studentList;
    }}

