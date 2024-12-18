import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaladOrder extends Order implements ActionListener {

    JLabel salad1label = new JLabel("0");
    JLabel salad2label = new JLabel("0");
    JLabel salad3label = new JLabel("0");
    JLabel salad4label = new JLabel("0");

    JButton add1button = new JButton("+");
    JButton add2button = new JButton("+");
    JButton add3button = new JButton("+");
    JButton add4button = new JButton("+");

    JButton minus1button = new JButton("-");
    JButton minus2button = new JButton("-");
    JButton minus3button = new JButton("-");
    JButton minus4button = new JButton("-");

    static int num1=0,num2=0,num3=0,num4=0;

    SaladOrder(){
        add1button.addActionListener(this);
        add2button.addActionListener(this);
        add3button.addActionListener(this);
        add4button.addActionListener(this);
        minus1button.addActionListener(this);
        minus2button.addActionListener(this);
        minus3button.addActionListener(this);
        minus4button.addActionListener(this);

        f.add(add1button);
        f.add(add2button);
        f.add(add3button);
        f.add(add4button);

        f.add(minus1button);
        f.add(minus2button);
        f.add(minus3button);
        f.add(minus4button);

        f.add(salad1label);
        f.add(salad2label);
        f.add(salad3label);
        f.add(salad4label);

        saladbutton.setEnabled(false);
    }
    SaladOrder(Integer[] order){
        this.order=order;
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add1button.addActionListener(this);
        add2button.addActionListener(this);
        add3button.addActionListener(this);
        add4button.addActionListener(this);
        minus1button.addActionListener(this);
        minus2button.addActionListener(this);
        minus3button.addActionListener(this);
        minus4button.addActionListener(this);

        f.add(add1button);
        f.add(add2button);
        f.add(add3button);
        f.add(add4button);

        f.add(minus1button);
        f.add(minus2button);
        f.add(minus3button);
        f.add(minus4button);

        f.add(salad1label);
        f.add(salad2label);
        f.add(salad3label);
        f.add(salad4label);

        saladbutton.setEnabled(false);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == add1button){
            num++; num1++;
            order[7]++;
            price += s1.getPrice();
            mealnumlabel.setText(String.valueOf(num));
            salad1label.setText(String.valueOf(num1));
            pricenumlabel.setText(String.valueOf(price));
        }
        if(e.getSource() == minus1button && num1 > 0){
            num--; num1--;
            order[7]--;
            price-= s1.getPrice();
            pricenumlabel.setText(String.valueOf(price));
            mealnumlabel.setText(String.valueOf(num));
            salad1label.setText(String.valueOf(num1));
        }
        if(e.getSource() == add2button){
            num++; num2++;
            order[8]++;
            price += s2.getPrice();
            mealnumlabel.setText(String.valueOf(num));
            salad2label.setText(String.valueOf(num2));
            pricenumlabel.setText(String.valueOf(price));
        }
        if(e.getSource() == minus2button && num2 > 0){
            num--; num2--;
            order[8]--;
            price-=s2.getPrice();
            mealnumlabel.setText(String.valueOf(num));
            pricenumlabel.setText(String.valueOf(price));
            salad2label.setText(String.valueOf(num2));
        }
        if(e.getSource() == add3button){
            num++; num3++;
            order[9]++;
            price += s3.getPrice();
            mealnumlabel.setText(String.valueOf(num));
            salad3label.setText(String.valueOf(num3));
            pricenumlabel.setText(String.valueOf(price));
        }
        if(e.getSource() == minus3button && num3 > 0){
            num--; num3--;
            order[9]--;
            price-=s3.getPrice();
            mealnumlabel.setText(String.valueOf(num));
            pricenumlabel.setText(String.valueOf(price));
            salad3label.setText(String.valueOf(num3));
        }
        if(e.getSource() == add4button){
            num++; num4++;
            order[10]++;
            price += s4.getPrice();
            mealnumlabel.setText(String.valueOf(num));
            salad4label.setText(String.valueOf(num4));
            pricenumlabel.setText(String.valueOf(price));
        }
        if(e.getSource() == minus4button && num4 > 0){
            num--; num4--;
            order[10]--;
            price-= s4.getPrice();
            pricenumlabel.setText(String.valueOf(price));
            mealnumlabel.setText(String.valueOf(num));
            salad4label.setText(String.valueOf(num4));
        }

        if(e.getSource() == mealbutton){
            MealOrder m = new MealOrder(order);

        }
        if(e.getSource() == saladbutton){
            JOptionPane.showMessageDialog(null,"You are already on salad's order page.",
                    "Title",JOptionPane.WARNING_MESSAGE);
        }
         if(e.getSource() == dessertbutton){
            DessertOrder d = new DessertOrder(order);
        }

        if(e.getSource() == viewcartbutton){
            if(Order.num == 0){
                JOptionPane.showMessageDialog(null,"You have to select meals to buy."
                        ,"Title",JOptionPane.ERROR_MESSAGE);
            }
            else {
                Cart cart = new Cart(order);}
        }

    }
}
