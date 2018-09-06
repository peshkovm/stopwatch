import javax.swing.*;
import java.awt.*;

public class Stopwatch {
    void start() {
        GUI gui = new GUI();
    }

    class GUI extends JFrame {
        Colon colon1, colon2;

        GUI() {
            colon1 = new Colon();
            colon2 = new Colon();
            setLayout(new FlowLayout());
            add(colon1);
            add(colon2);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(250, 200);
            setVisible(true);
        }

        class Colon extends JPanel {
            private JTextField colon;

            Colon() {
                Font font1 = new Font("SansSerif", Font.BOLD, 50);
                colon = new JTextField(":");
                colon.setFont(font1);
                colon.setEditable(false);
                add(colon);
            }
        }
    }
}