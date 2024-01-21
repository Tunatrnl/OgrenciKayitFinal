import javax.swing.*;
import java.awt.*;

public class anasayfa extends JFrame {
    private JLabel ogrencikayit;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton ogrenciKayitButton;
    private JButton dersKayitButton;

    public anasayfa() {
        JButton dersKayitButton = new JButton("Ders Kayıt Formu");
        dersKayitButton.addActionListener(e -> {
            DersKayitForm dersKayitForm = new DersKayitForm();
            dersKayitForm.setVisible(true);
        });

        JButton ogrenciKayitButton = new JButton("Öğrenci Kayıt Formu");
        ogrenciKayitButton.addActionListener(e -> {
            OgrenciKayitForm ogrenciKayitForm = new OgrenciKayitForm();
            ogrenciKayitForm.setVisible(true);
        });


        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(dersKayitButton);
        panel.add(ogrenciKayitButton);

        add(panel);
        setSize(300, 200);
        setTitle("Proje Menü Formu");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            anasayfa anasayfa = new anasayfa();
        });
    }
}