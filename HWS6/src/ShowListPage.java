import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ShowListPage {

    // frame
    JFrame f;
    JButton btn;

    String[][] s = new String[100][3];


    public ShowListPage(String[][] s) {
        this.s = s;

        f = new JFrame();

        // Frame Title
        f.setTitle("JTable Example");
        btn = new JButton("OK");

        btn.setBounds(450, 200, 100, 30);
        btn.setBackground(Color.yellow);
        f.add(btn);

        // Column Names
        String[] columnNames = {"Name", "price", "amount", "buy"};

        DefaultTableModel model = new DefaultTableModel(this.s, columnNames);
        JTable table = new JTable(model) {

            private static final long serialVersionUID = 1L;

            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return String.class;
                    case 1:
                        return String.class;
                    case 2:
                        return String.class;

                    default:
                        return Boolean.class;
                }
            }
        };
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        btn.addActionListener(this::actionPerformed);


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

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn) {

            JOptionPane.showMessageDialog(f," The Selected internet package purchased...");
            f.setVisible(false);
        }
    }
}
