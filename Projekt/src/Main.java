import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        /*JFrame frame = new JFrame();
        frame.setSize(new Dimension(400,400));
        JPanel jPanel=new JPanel();
        frame.add(jPanel);
        JLabel label = new JLabel("Biblioteka v.0.1");
        JButton button = new JButton("button1");
        JMenuBar menu = new JMenuBar();
        JTextArea pole= new JTextArea();
        pole.setBounds(10,45,150,20);
        jPanel.add(label);
        jPanel.add(pole);
        jPanel.add(button);
        jPanel.add(menu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        */
        Biblioteka okienko = new Biblioteka();
        okienko.setVisible(true);

    }
}
