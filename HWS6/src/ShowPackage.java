import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;




/**
 * @author leila
 */
public class ShowPackage  {


    JButton b1 ;
    JButton b2 ;
    JButton b3;
    String[][] d = new String[100][3];
    String[][] m = new String[100][3];
    String[][] w = new String[100][3];

    public ShowPackage(String[][] d, String[][] m, String[][] w) {
        this.d = d;
        this.m = m;
        this.w = w;
    }

    {
        // frame
        JFrame f;
         b1 = new JButton("daily");
         b2 = new JButton("monthly");
         b3=new JButton("weekly");

        f = new JFrame();
        f.setLayout(null);


        b1.setBounds(10,10,95,30);
        b2.setBounds(130,10,95,30);
        b3.setBounds(250,10,95,30);

        b1.setBackground(Color.yellow);
        b2.setBackground(Color.yellow);
        b3.setBackground(Color.yellow);


        f.add(b1);
        f.add(b2);
        f.add(b3);

        b1.addActionListener(this::actionPerformed);
        b2.addActionListener(this::actionPerformed);
        b3.addActionListener(this::actionPerformed);
        // Frame Size
        f.setSize(500, 200);
        // Frame Visible = true
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == b1){

            ShowListPage  page = new ShowListPage(this.d);
        }
        else if(e.getSource() == b2){
            ShowListPage  page = new ShowListPage(this.m);
        }
        else if(e.getSource() == b3){
            ShowListPage  page = new ShowListPage(this.w);
        }
    }

}