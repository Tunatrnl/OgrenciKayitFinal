import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.StringTokenizer;

public class DersKayitForm extends JFrame {
    private final String dosyaAdi = "ders.csv";
    private JLabel derskayit;
    private JTextField dersAd;
    private JTextField dersKredi;
    private JTextField dersDonem;
    private JButton dersBtn;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton dersiKaydetButton;

    public DersKayitForm() {
        JLabel dersAdLabel = new JLabel("Ders Adı :");
        JTextField dersAdField = new JTextField(12);

        JLabel dersKrediLabel = new JLabel("Ders Kredisi :");
        JTextField dersKrediField = new JTextField(12);

        JLabel dersDonemLabel = new JLabel("Ders Dönemi :");
        JTextField dersDonemField = new JTextField(12);

        JButton kaydetButton = new JButton("Kaydet");
        kaydetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dersAd = dersAdField.getText();
                String dersKredi = dersKrediField.getText();
                String dersDonem = dersDonemField.getText();

                writeDersToTextFile(dosyaAdi, dersAd, dersKredi, dersDonem);
                JOptionPane.showMessageDialog(null, "Ders kaydedildi: " + dersAd, "Başarılı", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder((BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        panel.add(dersAdLabel);
        panel.add(dersAdField);
        panel.add(dersKrediLabel);
        panel.add(dersKrediField);
        panel.add(dersDonemLabel);
        panel.add(dersDonemField);
        panel.add(new JLabel());
        panel.add(kaydetButton);

        this.add(panel);
        this.setSize(300, 200);
        this.setTitle("Ders Kayıt Formu");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    private void writeDersToTextFile(String dosyaAdi, String dersAd, String dersKredi, String dersDonem) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosyaAdi, true))) {
            bw.write(dersAd + "," + dersKredi + "," + dersDonem);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DersKayitForm());
    }
}