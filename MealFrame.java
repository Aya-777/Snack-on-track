import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class MealFrame implements ActionListener{
    int mealnum;
    Meal m;
    JLabel mealnumlabel = new JLabel("0");
    JButton addbutton = new JButton("+");
    JButton minusbutton = new JButton("-");
    JLabel pricelabel = new JLabel("Price : ");
    JLabel pricenumlabel = new JLabel(String.valueOf(Order.price));
    static int num1 =0;
    MealFrame(Integer mealnnum){
        this.mealnum=mealnum;
        m = Order.getMeal(mealnum);
        addbutton.addActionListener(this);
        minusbutton.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addbutton){
            Order.num++; num1++;
            Order.order[mealnum]++;
            Order.price += m.getPrice();
            mealnumlabel.setText(String.valueOf(Order.num));
            mealnumlabel.setText(String.valueOf(num1));
            pricenumlabel.setText(String.valueOf(Order.price));
        }
        if(e.getSource() == minusbutton && num1 > 0){
            Order.num--; num1--;
            Order.order[mealnum]--;
            Order.price-= m.getPrice();
            pricenumlabel.setText(String.valueOf(Order.price));
            mealnumlabel.setText(String.valueOf(Order.num));
            mealnumlabel.setText(String.valueOf(num1));
        }

    }


}
