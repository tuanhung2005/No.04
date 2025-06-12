import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class No01 {
    public static void main(String[] args) {
        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("Running in headless mode. GUI is not supported.");
            return;
        }

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Product Table");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            String[] columns = {"ID", "Name", "Price"};
            Object[][] data = {
                {"1", "Apple", 10},
                {"2", "Banana", 5},
                {"3", "Orange", 7},
                {"4", "Grapes", 12}
            };

            JTable table = new JTable(new DefaultTableModel(data, columns));
            JScrollPane scrollPane = new JScrollPane(table);
            frame.add(scrollPane);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
