package classes;

import javax.swing.*;
import java.awt.*;

public class StockManagementUI extends JFrame {
    private JComboBox<String> itemDropdown;
    private JTextField stockInput;
    private JLabel manageLabel, stockLabel;
    private JSeparator separator;

    public StockManagementUI() {
        // Set up the frame
        setTitle("Toko Pena Pelangi");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));

        // Title
        JLabel titleLabel = new JLabel("Toko Pena Pelangi");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel);

        // Stock list
        String[] stockItems = {"Pensil HB", "Penghapus", "Penggaris 30cm", "Buku Tulis", "Spidol", "Stabilo", "Tinta Printer", "Kertas A4", "Map", "Lem UHU"};
        Integer[] stockQuantities = {120, 80, 50, 200, 60, 90, 30, 150, 70, 110};
        stockLabel = new JLabel("Stok Barang:");
        add(stockLabel);
        JList<String> stockList = new JList<>(stockItems);
        JScrollPane scrollPane = new JScrollPane(stockList);
        scrollPane.setPreferredSize(new Dimension(150, 100));
        add(scrollPane);

        // Separator
        separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setPreferredSize(new Dimension(350, 1));
        add(separator);

        // Manage label
        manageLabel = new JLabel("Kelola Barang:");
        add(manageLabel);

        // Dropdown for item selection
        itemDropdown = new JComboBox<>(stockItems);
        add(itemDropdown);

        // Input box for stock quantity
        stockInput = new JTextField(5);
        JLabel stockInputLabel = new JLabel("Jumlah Stok:");
        add(stockInputLabel);
        add(stockInput);

        // Set the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StockManagementUI();
            }
        });
    }
}
