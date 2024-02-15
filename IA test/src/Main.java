import javax.swing.*;
import java.awt.*;

class Menu extends JFrame {
    String name;
    int layout;


    Menu(String name, int layout) {
            super(name);
            this.setSize(400, 400);
            this.setVisible(true);
            this.add(new JLabel("tset"));
            setLayout((new FlowLayout()));
            JButton b = new JButton("<html><b><u>T</u>wo</b><br>lines</html>");
            this.add(b);
            this.add(new JCheckBox());
    }


}

public class Main {
    public static void main(String[] args) {
        new Menu("test",1);
    }
}

