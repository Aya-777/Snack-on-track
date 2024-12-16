import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Order implements ActionListener {
    static int num=0,price=0;
    JFrame f = new JFrame();
    JLabel mealnumlabel = new JLabel(String.valueOf(num));
    static JLabel pricelabel = new JLabel("Price : ");
    JLabel pricenumlabel = new JLabel(String.valueOf(price));
    JButton viewcartbutton = new JButton("View cart");
    JLabel mealslabel = new JLabel("meals");

    JButton dessertbutton = new JButton("Desserts");
    JButton saladbutton = new JButton("Salads");
    JButton mealbutton = new JButton("Meals");


    Order(){
        f.setLayout(new FlowLayout());

        f.add(viewcartbutton);
        f.add(mealnumlabel);
        f.add(mealslabel);
        f.add(pricelabel);
        f.add(pricenumlabel);

        f.add(mealbutton);
        f.add(saladbutton);
        f.add(dessertbutton);


        viewcartbutton.addActionListener(this);
        mealbutton.addActionListener(this);
        saladbutton.addActionListener(this);
        dessertbutton.addActionListener(this);



        f.setSize(500,500);
        f.setVisible(true);
        f.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
