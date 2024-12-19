import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class funcs implements ActionListener {
    JLabel iconlabel = new JLabel();
    JButton b = new JButton("click me");

    JFrame f = new JFrame();
    ImageIcon ic = new ImageIcon("FIRST.jpg");
    
    funcs(){
        // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        iconlabel.setIcon(ic);
        // iconlabel.setBounds(0,0,500,500);

        b.addActionListener(this);
        b.setBounds(10,10,100,50);

        f.add(iconlabel);
        f.add(b);
        f.setSize(665,850);
        f.setVisible(true);
        f.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b) {
            MealOrder f2 = new MealOrder();
        }
    }
}
