import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmMain extends JFrame implements ActionListener {
    private JButton btnChia, btnCong, btnDienTichHT, btnDTHCN, btnNhan, btnNhap, btnTienNuoc, btnTru;

    public frmMain() {
        setTitle("Main Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        btnChia = new JButton("Chia Hai Số");
        btnCong = new JButton("Cộng Hai Số");
        btnDienTichHT = new JButton("Diện Tích Hình Tròn");
        btnDTHCN = new JButton("Diện Tích HCN");
        btnNhan = new JButton("Nhân Hai Số");
        btnNhap = new JButton("Nhập Hai Số");
        btnTienNuoc = new JButton("Tiền Nước");
        btnTru = new JButton("Trừ Hai Số");

        panel.add(btnChia);
        panel.add(btnCong);
        panel.add(btnDienTichHT);
        panel.add(btnDTHCN);
        panel.add(btnNhan);
        panel.add(btnNhap);
        panel.add(btnTienNuoc);
        panel.add(btnTru);

        btnChia.addActionListener(this);
        btnCong.addActionListener(this);
        btnDienTichHT.addActionListener(this);
        btnDTHCN.addActionListener(this);
        btnNhan.addActionListener(this);
        btnNhap.addActionListener(this);
        btnTienNuoc.addActionListener(this);
        btnTru.addActionListener(this);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnChia) {
            new frmChiaHaiSo().setVisible(true);
        } else if (e.getSource() == btnCong) {
            new frmCongHaiSo().setVisible(true);
        } else if (e.getSource() == btnDienTichHT) {
            new frmDienTichHinhTron().setVisible(true);
        } else if (e.getSource() == btnDTHCN) {
            new frmDTHCN().setVisible(true);
        } else if (e.getSource() == btnNhan) {
            new frmNhanHaiSo().setVisible(true);
        } else if (e.getSource() == btnNhap) {
            new frmNhapHaiSo().setVisible(true);
        } else if (e.getSource() == btnTienNuoc) {
            new frmTienNuoc().setVisible(true);
        } else if (e.getSource() == btnTru) {
            new frmTruHaiSo().setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new frmMain().setVisible(true);
        });
    }
}