import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frmDTHCN extends JFrame {
    private JTextField txtDai, txtRong, txtKetQua;
    private JButton btnTinh;

    public frmDTHCN() {
        setTitle("Tính diện tích hình chữ nhật");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Chiều dài:"));
        txtDai = new JTextField();
        add(txtDai);

        add(new JLabel("Chiều rộng:"));
        txtRong = new JTextField();
        add(txtRong);

        add(new JLabel("Diện tích:"));
        txtKetQua = new JTextField();
        txtKetQua.setEditable(false);
        add(txtKetQua);

        btnTinh = new JButton("Tính diện tích");
        add(btnTinh);

        // Xử lý nút bấm
        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double dai = Double.parseDouble(txtDai.getText());
                    double rong = Double.parseDouble(txtRong.getText());
                    double dientich = dai * rong;
                    txtKetQua.setText(String.valueOf(dientich));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frmDTHCN.this,
                        "Vui lòng nhập số hợp lệ!",
                        "Lỗi nhập",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new frmDTHCN().setVisible(true);
        });
    }
}
