import javax.swing.*;
import java.awt.*;

public class Biblioteka extends JFrame {
    private JPanel panel;
    public Biblioteka(){
        super("Biblioteka v.0.1");
        setSize(1000,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        panel = new JPanel();
        panel.setLayout(null);
        add(panel);
        JLabel tekst = new JLabel("Biblioteka");
        tekst.setBounds(450,0,200,25);
        panel.add(tekst);
        JButton AddBook = new JButton("Dodaj książkę");
        AddBook.setBounds(800,20,150,25);
        panel.add(AddBook);
        JButton EditBook = new JButton("Edytuj książkę");
        EditBook.setBounds(800,50,150,25);
        panel.add(EditBook);
        JButton ShowBook = new JButton("Pokaż książki");
        ShowBook.setBounds(800,80,150,25);
        panel.add(ShowBook);
        JButton AddAuthor = new JButton("Dodaj autora");
        AddAuthor.setBounds(800,110,150,25);
        panel.add(AddAuthor);
        JButton EditAuthor = new JButton("Edytuj autora");
        EditAuthor.setBounds(800,140,150,25);
        panel.add(EditAuthor);
        JButton ShowAuthor = new JButton("Pokaż autorów");
        ShowAuthor.setBounds(800,170,150,25);
        panel.add(ShowAuthor);

        String[] columnNames = {
                "ID",
                "Tytuł",
                "Tom",
                "Rok wydania",
                "Rodzaj",
                "ISBN"};
        Object[][] data = {
                {"0001","Pan Tadeusz", "1", "1834", "Epos", "9788365458872"},
                {"0002","Coś", "2", "1944", "Horror", "9488365173872"},
        };
        JTable table = new JTable(data,columnNames);
        JScrollPane opakowanietabeli = new JScrollPane(table);
        opakowanietabeli.setBounds(20,20,760,630);
        panel.add(opakowanietabeli);

    }
}
