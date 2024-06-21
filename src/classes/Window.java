package classes;

import java.awt.event.*;
import javax.swing.*;

public class Window {
    public static void createWindow() {
        JFrame f = new JFrame();
        JLabel label1 = new JLabel("Toko Pena Pelangi");
        JButton button1 = new JButton("Kelola Stok");

        label1.setBounds(430, 10, 200, 50);
        button1.setBounds(50, 50, 150, 20);
        
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("hahahahaha");
            }
        });
        
        f.add(label1);
        f.add(button1);
        f.setLayout(null);
        f.setResizable(false);
        f.setSize(1000, 600);
        f.setLocationRelativeTo(null);
        f.setTitle("Toko pena pelangi");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
