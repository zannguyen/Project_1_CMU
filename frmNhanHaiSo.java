import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frmNhanHaiSo extends JFrame {
    private JTextField txtChieuDai, txtChieuRong, txtDienTich;
    private JButton btnTinh;

    public frmNhanHaiSo() {
        setTitle("Tính diện tích hình chữ nhật");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Giao diện nhập
        add(new JLabel("Chiều dài:"));
        txtChieuDai = new JTextField();
        add(txtChieuDai);

        add(new JLabel("Chiều rộng:"));
        txtChieuRong = new JTextField();
        add(txtChieuRong);

        add(new JLabel("Diện tích:"));
        txtDienTich = new JTextField();
        txtDienTich.setEditable(false);
        add(txtDienTich);

        // Nút tính
        btnTinh = new JButton("Tính diện tích");
        add(btnTinh);

        // Xử lý sự kiện
        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double dai = Double.parseDouble(txtChieuDai.getText());
                    double rong = Double.parseDouble(txtChieuRong.getText());
                    double dientich = dai * rong;
                    txtDienTich.setText(String.valueOf(dientich));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frmNhanHaiSo.this,
                        "Vui lòng nhập đúng số!",
                        "Lỗi nhập liệu",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new frmNhanHaiSo().setVisible(true);
        });
    }
}
