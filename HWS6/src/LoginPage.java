import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame implements ActionListener{

    String[][] daily_list = new String[100][3];
    String[][] monthly_list = new String[100][3];
    String[][] weekly_list =new String[100][3];
    String[][] brought_list= new String[100][3];

    JPanel panel;
        JLabel user_label, password_label, message;
        JTextField userName_text;
        JPasswordField password_text;
        JButton submit, cancel;
        String username;
        String pass;



        public LoginPage(String[][] daily_list ,
                         String[][] monthly_list ,
                         String[][] weekly_list ,
                         String[][] brought_list )
        {

            this.daily_list =daily_list;
            this.monthly_list=monthly_list;
            this.weekly_list=weekly_list;
            this.brought_list=brought_list;


            // User Label
            user_label = new JLabel();
            user_label.setText("       User Name :");
            userName_text = new JTextField();

            // Password

            password_label = new JLabel();
            password_label.setText("        Password :");
            password_text = new JPasswordField();

            // Submit

            submit = new JButton("SUBMIT");

            panel = new JPanel(new GridLayout(3, 1));

            panel.add(user_label);
            panel.add(userName_text);
            panel.add(password_label);
            panel.add(password_text);

            message = new JLabel();
            panel.add(message);
            panel.add(submit);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Adding the listeners to components..
            submit.addActionListener(this);
            add(panel, BorderLayout.CENTER);
            setTitle("Please Login Here !");
            setSize(700, 200);
            setVisible(true);



        }




    @Override
    public void actionPerformed(ActionEvent ae) {
        username = userName_text.getText();
        pass = password_text.getText();

       if( MainProgram.Authentication(username , pass)){

           JOptionPane.showMessageDialog(this,"please wait ....");
           MainPage mainPage = new MainPage( this.daily_list ,
           this.monthly_list ,
           this.weekly_list ,
           this.brought_list );
       }
       else {
           JOptionPane.showMessageDialog(this,"User not found \n try again ;)" );
       }




    }
    }

