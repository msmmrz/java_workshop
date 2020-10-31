import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ShowBoughtPackage {


        // frame
        JFrame f;

        String[][] s = new String[100][3];


        public ShowBoughtPackage(String[][] s) {
            this.s = s;

            f = new JFrame();

            // Frame Title
            f.setTitle("JTable Example");


            // Column Names
            String[] columnNames = {"Name", "price", "amount"};
            JTable table = new JTable(this.s, columnNames);


            // Initializing the JTable
            table.setBounds(1000, 7000, 200, 300);

            // adding it to JScrollPane
            JScrollPane sp = new JScrollPane(table);
            f.add(sp);
            // Frame Size
            f.setSize(800, 300);
            // Frame Visible = true
            f.setVisible(true);
        }
    }
