import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Oct 31 12:47:30 IRST 2020
 */




public class MainPage  {


        JButton b1;
        JButton b2;
    String[][] d = new String[100][3];
    String[][] m = new String[100][3];
    String[][] w = new String[100][3];
    String[][] bought = new String[100][3];


    public MainPage(String[][] d, String[][] m, String[][] w ,String[][] bought) {
        this.d = d;
        this.m = m;
        this.w = w;
        this.bought = bought;
    }

    {
            // frame
            JFrame f;
            b1 = new JButton("show packages");
            b2 = new JButton("show bought packages");

        b1.setBackground(Color.yellow);
        b2.setBackground(Color.yellow);



        f = new JFrame();
            f.setLayout(null);


            b1.setBounds(10,10,200,30);
            b2.setBounds(250,10,200,30);



            f.add(b1);
            f.add(b2);
            b1.addActionListener(this::actionPerformed);
            b2.addActionListener(this::actionPerformed);


            // Frame Size
            f.setSize(500, 200);
            // Frame Visible = true
            f.setVisible(true);
        }
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == b1){
                ShowPackage form = new ShowPackage(this.d , this.m , this.w);

            }
            else if(e.getSource() == b2){
            ShowBoughtPackage page = new ShowBoughtPackage(this.bought);
            }
        }


    }

