import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmDienTichHinhTron extends JFrame {
    private JTextField txtRadius;
    private JLabel lblResult;

    public frmDienTichHinhTron() {
        setTitle("Tinh Dien Tich Hinh Tron");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 10, 10));

        // Khoi tao cac thanh phan giao dien
        JLabel lblRadius = new JLabel("Nhap ban kinh:");
        txtRadius = new JTextField();
        JButton btnCalculate = new JButton("Tinh Dien Tich");
        lblResult = new JLabel("Dien tich: ");

        // Them cac thanh phan vao giao dien
        add(lblRadius);
        add(txtRadius);
        add(btnCalculate);
        add(new JLabel(""));  // Chua khoang trong
        add(lblResult);

        // Xu ly su kien nut tinh dien tich
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double radius = Double.parseDouble(txtRadius.getText());
                    if (radius < 0) {
                        JOptionPane.showMessageDialog(null, "Ban kinh phai la so duong!");
                    } else {
                        double area = Math.PI * radius * radius;
                        lblResult.setText(String.format("Dien tich: %.2f", area));
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui long nhap mot so hop le!");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new frmDienTichHinhTron().setVisible(true);
        });
    }
}
