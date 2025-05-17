import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmTienNuoc extends JFrame implements ActionListener {
    private JTextField txtSoDau, txtSoCuoi;
    private JLabel lblResult;
    private JButton btnTinhTien;

    public frmTienNuoc() {
        setTitle("Tinh Tien Nuoc");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("So dau:"));
        txtSoDau = new JTextField();
        add(txtSoDau);

        add(new JLabel("So cuoi:"));
        txtSoCuoi = new JTextField();
        add(txtSoCuoi);

        btnTinhTien = new JButton("Tinh Tien");
        btnTinhTien.addActionListener(this);
        add(btnTinhTien);

        lblResult = new JLabel("Tien nuoc: ");
        add(lblResult);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int soDau = Integer.parseInt(txtSoDau.getText());
            int soCuoi = Integer.parseInt(txtSoCuoi.getText());

            if (soCuoi >= soDau) {
                int tienNuoc = (soCuoi - soDau) * 10000;
                lblResult.setText("Tien nuoc: " + tienNuoc + " VND");
            } else {
                lblResult.setText("Loi: So cuoi phai lon hon hoac bang so dau!");
            }
        } catch (NumberFormatException ex) {
            lblResult.setText("Loi: Vui long nhap so hop le!");
        }
    }

    public static void main(String[] args) {
        new frmTienNuoc();
    }
}