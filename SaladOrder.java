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
            Order.num++; num1++;
            s1.setNum(num1);
            Order.price += s1.getPrice();
            mealnumlabel.setText(String.valueOf(Order.num));
            salad1label.setText(String.valueOf(num1));
            pricenumlabel.setText(String.valueOf(Order.price));
            s1.setNum(s1.getNum()+1);

        }
        if(e.getSource() == minus1button && num1 > 0){
            Order.num--; num1--;
            s1.setNum(num1);
            Order.price-= s1.getPrice();
            pricenumlabel.setText(String.valueOf(Order.price));
            mealnumlabel.setText(String.valueOf(Order.num));
            salad1label.setText(String.valueOf(num1));
            s1.setNum(s1.getNum()-1);
        }
        if(e.getSource() == add2button){
            Order.num++; num2++;
            s2.setNum(num2);
            Order.price += s2.getPrice();
            mealnumlabel.setText(String.valueOf(Order.num));
            salad2label.setText(String.valueOf(num2));
            pricenumlabel.setText(String.valueOf(Order.price));
            s2.setNum(s2.getNum()+1);
        }
        if(e.getSource() == minus2button && num2 > 0){
            Order.num--; num2--;
            s2.setNum(num2);
            Order.price-=s2.getPrice();
            mealnumlabel.setText(String.valueOf(Order.num));
            pricenumlabel.setText(String.valueOf(Order.price));
            salad2label.setText(String.valueOf(num2));
            s2.setNum(s2.getNum()-1);
        }
        if(e.getSource() == add3button){
            Order.num++; num3++;
            s3.setNum(num3);
            Order.price += s3.getPrice();
            mealnumlabel.setText(String.valueOf(Order.num));
            salad3label.setText(String.valueOf(num3));
            pricenumlabel.setText(String.valueOf(Order.price));
            s3.setNum(s3.getNum()+1);
        }
        if(e.getSource() == minus3button && num3 > 0){
            Order.num--; num3--;
            s3.setNum(num3);
            Order.price-=s3.getPrice();
            mealnumlabel.setText(String.valueOf(Order.num));
            pricenumlabel.setText(String.valueOf(Order.price));
            salad3label.setText(String.valueOf(num3));
            s3.setNum(s3.getNum()-1);
        }

        if(e.getSource() == add4button){
            Order.num++; num4++;
            s4.setNum(num4);
            Order.price += s4.getPrice();
            mealnumlabel.setText(String.valueOf(Order.num));
            salad4label.setText(String.valueOf(num4));
            pricenumlabel.setText(String.valueOf(Order.price));
            s4.setNum(s4.getNum()+1);

        }
        if(e.getSource() == minus4button && num4 > 0){
            Order.num--; num4--;
            s4.setNum(num4);
            Order.price-= s4.getPrice();
            pricenumlabel.setText(String.valueOf(Order.price));
            mealnumlabel.setText(String.valueOf(Order.num));
            salad4label.setText(String.valueOf(num4));
            s4.setNum(s4.getNum()-1);
        }

        if(e.getSource() == mealbutton){
            MealOrder m = new MealOrder();

        }
        if(e.getSource() == saladbutton){
            JOptionPane.showMessageDialog(null,"You are already on salad's order page.",
                    "Title",JOptionPane.WARNING_MESSAGE);
        }
         if(e.getSource() == dessertbutton){
            DessertOrder d = new DessertOrder();
        }

        if(e.getSource() == viewcartbutton){
            if(Order.num == 0){
                JOptionPane.showMessageDialog(null,"You have to select meals to buy."
                        ,"Title",JOptionPane.ERROR_MESSAGE);
            }
            else {
                Cart cart = new Cart();}
        }

    }



}
