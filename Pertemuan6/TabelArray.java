import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class TabelArray extends JFrame {
    public JTable table;

    public TabelArray() {
        String[] columns = {"Nama", "No. HP", "Alamat"};
        Object[][] data = new Object[3][3];

        // Populate the table data using a for loop
        String[][] dataArray = {{"ABDUL", "085646668991", "Kediri"}, {"KUSNO", "085646668992", "Trenggalek"}, {"PONIRAN", "085646668999", "Bojonegoro"}};
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = 0; j < dataArray[i].length; j++) {
                data[i][j] = dataArray[i][j];
            }
        }

        // Create the table model
        table = new JTable(new DefaultTableModel(data, columns));

        // Create and configure the frame
        JFrame frame = this; // Use 'this' instead of creating a new JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Add the table to the frame
        frame.add(new JScrollPane(table), BorderLayout.CENTER);

        // Set frame properties
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TabelArray());
    }
}