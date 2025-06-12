package com.mycompany.no01;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class No01 {
    public static void main(String[] args) {
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
