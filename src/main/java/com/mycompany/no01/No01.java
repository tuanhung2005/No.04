package com.mycompany.no01;

import javax.swing.*;
import java.awt.*;

public class No01 {
    public static void main(String[] args) {
        // Kiểm tra xem môi trường có hỗ trợ GUI không
        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("Headless environment detected. GUI will not be launched.");
            return;
        }

        // Giao diện đồ họa chỉ hiển thị chữ "Hello"
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Hello Window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel("Hello", SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 24));

            frame.add(label);
            frame.setSize(300, 200);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
