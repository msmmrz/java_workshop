package com.ds.usc;

import java.sql.*;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.Global.exit;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        try (
                Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "amirds",
                        "ds123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement = connection.prepareStatement("create table class_info( id number , student_number number ,fullname varchar(30), score1 float, score2 float, score3 float)");
            preparedStatement.executeUpdate();
           preparedStatement = connection.prepareStatement("insert into class_info (id,student_number,fullname,score1,score2,score3) values (?,?,?,?,?,?)");
            preparedStatement.setInt(1,1);
            preparedStatement.setInt(2,981113019);
            preparedStatement.setString(3,"amirrezaDs");
            preparedStatement.setFloat(4,20);
            preparedStatement.setFloat(5,20);
            preparedStatement.setFloat(6,20);
            preparedStatement.executeUpdate();
            preparedStatement.setInt(1,2);
            preparedStatement.setInt(2,981114019);
            preparedStatement.setString(3,"aliDs");
            preparedStatement.setFloat(4,19);
            preparedStatement.setFloat(5,12);
            preparedStatement.setFloat(6,20);
            preparedStatement.executeUpdate();
            preparedStatement.setInt(1,3);
            preparedStatement.setInt(2,981113010);
            preparedStatement.setString(3,"reza");
            preparedStatement.setFloat(4,20);
            preparedStatement.setFloat(5,2);
            preparedStatement.setFloat(6,13);
            preparedStatement.executeUpdate();
            preparedStatement.setInt(1,4);
            preparedStatement.setInt(2,981113011);
            preparedStatement.setString(3,"majid");
            preparedStatement.setFloat(4,12);
            preparedStatement.setFloat(5,15);
            preparedStatement.setFloat(6,20);
            preparedStatement.executeUpdate();
            preparedStatement.setInt(1,5);
            preparedStatement.setInt(2,981113012);
            preparedStatement.setString(3,"seyed mahdi");
            preparedStatement.setFloat(4,13);
            preparedStatement.setFloat(5,20);
            preparedStatement.setFloat(6,18);
            preparedStatement.executeUpdate();
            preparedStatement.setInt(1,6);
            preparedStatement.setInt(2,981113013);
            preparedStatement.setString(3,"sey hadi");
            preparedStatement.setFloat(4,2);
            preparedStatement.setFloat(5,7);
            preparedStatement.setFloat(6,8);
            preparedStatement.executeUpdate();
            preparedStatement.setInt(1,7);
            preparedStatement.setInt(2,971613010);
            preparedStatement.setString(3,"soqra");
            preparedStatement.setFloat(4,12);
            preparedStatement.setFloat(5,20);
            preparedStatement.setFloat(6,13);
            preparedStatement.executeUpdate();
            preparedStatement.setInt(1,8);
            preparedStatement.setInt(2,971113011);
            preparedStatement.setString(3,"aliasqar");
            preparedStatement.setFloat(4,14);
            preparedStatement.setFloat(5,12);
            preparedStatement.setFloat(6,12);
            preparedStatement.executeUpdate();
            preparedStatement.setInt(1,9);
            preparedStatement.setInt(2,981113060);
            preparedStatement.setString(3,"dorsa majidi");
            preparedStatement.setFloat(4,20);
            preparedStatement.setFloat(5,6);
            preparedStatement.setFloat(6,11);
            preparedStatement.executeUpdate();
            preparedStatement.setInt(1,10);
            preparedStatement.setInt(2,981113213);
            preparedStatement.setString(3,"alireza masodi");
            preparedStatement.setFloat(4,12);
            preparedStatement.setFloat(5,9);
            preparedStatement.setFloat(6,11);
            preparedStatement.executeUpdate();
            preparedStatement.setInt(1,11);
            preparedStatement.setInt(2,981111019);
            preparedStatement.setString(3,"ebi");
            preparedStatement.setFloat(4,20);
            preparedStatement.setFloat(5,20);
            preparedStatement.setFloat(6,20);
            preparedStatement.executeUpdate();
            preparedStatement.setInt(1,12);
            preparedStatement.setInt(2,981114019);
            preparedStatement.setString(3,"aliDs");
            preparedStatement.setFloat(4,19);
            preparedStatement.setFloat(5,12);
            preparedStatement.setFloat(6,20);
            preparedStatement.executeUpdate();
            preparedStatement.setInt(1,13);
            preparedStatement.setInt(2,981114010);
            preparedStatement.setString(3,"omidreza");
            preparedStatement.setFloat(4,20);
            preparedStatement.setFloat(5,12);
            preparedStatement.setFloat(6,11);
            preparedStatement.executeUpdate();
            preparedStatement.setInt(1,14);
            preparedStatement.setInt(2,981112011);
            preparedStatement.setString(3,"amirhadi");
            preparedStatement.setFloat(4,14);
            preparedStatement.setFloat(5,15);
            preparedStatement.setFloat(6,20);
            preparedStatement.executeUpdate();
            preparedStatement.setInt(1,15);
            preparedStatement.setInt(2,981113112);
            preparedStatement.setString(3,"alireza");
            preparedStatement.setFloat(4,13);
            preparedStatement.setFloat(5,13);
            preparedStatement.setFloat(6,15);
            preparedStatement.executeUpdate();
            System.out.println("1-new user data\n2-Update user info \n3-Delete\n4-show user\n5-average");
            choice = input.nextInt();
            int id =0;
            switch (choice) {
                case 1:
                    preparedStatement = connection.prepareStatement("insert into class_info (id,student_number,fullname,score1,score2,score3) values (?,?,?,?,?,?)");
                    System.out.print("Enter id number = ");
                    preparedStatement.setInt(1, input.nextInt());
                    System.out.print("Enter student number = ");
                    preparedStatement.setLong(2,input.nextLong());
                    System.out.print("Enter your name = ");
                    preparedStatement.setString(3, input.next());
                    System.out.print("Enter your math score  = ");
                    preparedStatement.setFloat(4,input.nextInt());
                    System.out.print("Enter your history score = ");
                    preparedStatement.setFloat(5,input.nextFloat());
                    System.out.print("Enter your science score = ");
                    preparedStatement.setFloat(6,input.nextFloat());
                    preparedStatement.executeUpdate();
                    break;
                case 2:
                    System.out.println("1-ID\n2-Student_number\n3-Name\n4-math score\n5-history sore\n6-science score");
                    int choose = input.nextInt();
                    switch (choose) {
                        case 1:
                            preparedStatement = connection.prepareStatement("update class_info set id=? where id=?");
                            System.out.println("whats your main ID that you want to update");
                            id = input.nextInt();
                            System.out.println("enter your new ID number");
                            int temp = input.nextInt();
                            preparedStatement.setLong(1, temp);
                            preparedStatement.setLong(2, id);
                            preparedStatement.executeUpdate();
                            System.out.println("Done");
                            break;
                        case 2:
                            preparedStatement = connection.prepareStatement("update class_info set Student_number=? where id=?");
                            System.out.println("whats your main ID that you want to update");
                            id = input.nextInt();
                            System.out.println("enter your new student number ");
                            long temp1 = input.nextLong();
                            preparedStatement.setLong(1, temp1);
                            preparedStatement.setLong(2, id);
                            preparedStatement.executeUpdate();
                            System.out.println("Done");
                            break;
                        case 3:
                            preparedStatement = connection.prepareStatement("update class_info set fullname=? where id=?");
                            System.out.println("whats your main ID that you want to update");
                            id = input.nextInt();
                            System.out.println("enter your new name ");
                            String temp2 = input.next();
                            preparedStatement.setString(1, temp2);
                            preparedStatement.setLong(2, id);
                            preparedStatement.executeUpdate();
                            System.out.println("Done");
                            break;
                        case 4:
                            preparedStatement = connection.prepareStatement("update class_info set score1=? where id=?");
                            System.out.println("whats your main ID that you want to update");
                            id = input.nextInt();
                            System.out.println("enter your new math score ");
                            long temp3 = input.nextLong();
                            preparedStatement.setLong(1, temp3);
                            preparedStatement.setLong(2, id);
                            preparedStatement.executeUpdate();
                            System.out.println("Done");
                            break;
                        case 5:
                            preparedStatement = connection.prepareStatement("update class_info set score2=? where id=?");
                            System.out.println("whats your main ID that you want to update");
                            id = input.nextInt();
                            System.out.println("enter your new history score  ");
                            float temp4 = input.nextLong();
                            preparedStatement.setFloat(1, temp4);
                            preparedStatement.setLong(2, id);
                            preparedStatement.executeUpdate();
                            System.out.println("Done");
                            break;
                        case 6:
                            preparedStatement = connection.prepareStatement("update class_info set score3=? where id=?");
                            System.out.println("whats your main ID that you want to update");
                            id = input.nextInt();
                            System.out.println("enter your new science score  ");
                            float temp5 = input.nextLong();
                            preparedStatement.setFloat(1, temp5);
                            preparedStatement.setLong(2, id);
                            preparedStatement.executeUpdate();
                            System.out.println("Done");
                            break;
                        default:
                            System.out.println("invalid value");

                    }
                    break;
                case 3:
                    preparedStatement = connection.prepareStatement("delete from class_info where id=?");
                    System.out.println("Enter your id number of user that you want to delete");
                    int temp =input.nextInt();
                    preparedStatement.setInt(1,temp);
                    preparedStatement.executeUpdate();
                    System.out.println("Done");
                    break;
                case 4:
                    preparedStatement = connection.prepareStatement("select * from class_info where id=?");
                    System.out.println("Enter your id number of user that you want to show");
                    int temp1 =input.nextInt();
                    preparedStatement.setInt(1,temp1);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    while (resultSet.next())
                        System.out.printf(resultSet.getInt("id") +"\n"+ resultSet.getInt("student_number") +"\n"+ resultSet.getString("fullname") +"\n"+ "math = " +resultSet.getFloat("score1") + "\n" + "history = " + resultSet.getFloat("score2") +"\n"+ "science = " +resultSet.getFloat("score3"));
                    exit(preparedStatement, connection);
                    break;
                case 5:
                    float sum = 0 , avg;
                    preparedStatement = connection.prepareStatement("select * from class_info where id=?");
                    System.out.println("Enter your id number of user that you want to see average ");
                    int temp2 =input.nextInt();
                    preparedStatement.setInt(1,temp2);
                    ResultSet resultSet1 = preparedStatement.executeQuery();
                    while (resultSet1.next())
                    sum = resultSet1.getFloat("score1")+resultSet1.getFloat("score2")+resultSet1.getFloat("score3");
                    avg = sum/3;
                    System.out.println(" average is " + avg);
                    exit(preparedStatement, connection);
                    break;
                default:
                    System.out.println("invalid value");
            }

        } catch (
                    SQLException e) {
                System.out.println("DB ERROR " + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("DB Driver Not Exist!!");
            }
    }
}
