import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MealOrder extends Order implements ActionListener {
    
    JLabel meal1label = new JLabel("0");
    JLabel meal2label = new JLabel("0");
    JLabel meal3label = new JLabel("0");
    JLabel meal4label = new JLabel("0");
    JLabel meal5label = new JLabel("0");
    JLabel meal6label = new JLabel("0");

    JButton add1button = new JButton("+");
    JButton add2button = new JButton("+");
    JButton add3button = new JButton("+");
    JButton add4button = new JButton("+");
    JButton add5button = new JButton("+");
    JButton add6button = new JButton("+");

    JButton minus1button = new JButton("-");
    JButton minus2button = new JButton("-");
    JButton minus3button = new JButton("-");
    JButton minus4button = new JButton("-");
    JButton minus5button = new JButton("-");
    JButton minus6button = new JButton("-");

    


     int num1=0,num2=0,num3=0,num4=0,num5=0,num6=0;


    MealOrder(){
        add1button.addActionListener(this);
        add2button.addActionListener(this);
        add3button.addActionListener(this);
        add4button.addActionListener(this);
        add5button.addActionListener(this);
        add6button.addActionListener(this);

        minus1button.addActionListener(this);
        minus2button.addActionListener(this);
        minus3button.addActionListener(this);
        minus4button.addActionListener(this);
        minus5button.addActionListener(this);
        minus6button.addActionListener(this);

        f.add(add1button);
        f.add(add2button);
        f.add(add3button);
        f.add(add4button);
        f.add(add5button);
        f.add(add6button);

        f.add(minus1button);
        f.add(minus2button);
        f.add(minus3button);
        f.add(minus4button);
        f.add(minus5button);
        f.add(minus6button);

        f.add(meal1label);
        f.add(meal2label);
        f.add(meal3label);
        f.add(meal4label);
        f.add(meal5label);
        f.add(meal6label);

        mealsitem.setEnabled(false);


    }
    MealOrder(Integer[] order){
        this.order=order;
        add1button.addActionListener(this);
        add2button.addActionListener(this);
        add3button.addActionListener(this);
        add4button.addActionListener(this);
        add5button.addActionListener(this);
        add6button.addActionListener(this);

        minus1button.addActionListener(this);
        minus2button.addActionListener(this);
        minus3button.addActionListener(this);
        minus4button.addActionListener(this);
        minus5button.addActionListener(this);
        minus6button.addActionListener(this);

        f.add(add1button);
        f.add(add2button);
        f.add(add3button);
        f.add(add4button);
        f.add(add5button);
        f.add(add6button);

        f.add(minus1button);
        f.add(minus2button);
        f.add(minus3button);
        f.add(minus4button);
        f.add(minus5button);
        f.add(minus6button);

        f.add(meal1label);
        f.add(meal2label);
        f.add(meal3label);
        f.add(meal4label);
        f.add(meal5label);
        f.add(meal6label);

        mealsitem.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == meal1label){
            // num++; num1++;
            // order[1]++;
            // price += m1.getPrice();
            // mealnumlabel.setText(String.valueOf(num));
            // meal1label.setText(String.valueOf(num1));
            // pricenumlabel.setText(String.valueOf(price));
            MealFrame mf = new MealFrame(1);
        }
        if(e.getSource() == minus1button && num1 > 0){
            num--; num1--;
            order[1]--;
            price-= m1.getPrice();
            pricenumlabel.setText(String.valueOf(price));
            mealnumlabel.setText(String.valueOf(num));
            meal1label.setText(String.valueOf(num1));

        }
        if(e.getSource() == add2button){
            num++; num2++;
            order[2]++;
            price += m2.getPrice();
            mealnumlabel.setText(String.valueOf(num));
            meal2label.setText(String.valueOf(num2));
            pricenumlabel.setText(String.valueOf(price));
        }
        if(e.getSource() == minus2button && num2 > 0){
            num--; num2--;
            order[2]--;
            price-=m2.getPrice();
            mealnumlabel.setText(String.valueOf(num));
            pricenumlabel.setText(String.valueOf(price));
            meal2label.setText(String.valueOf(num2));
        }
        if(e.getSource() == add3button){
            num++; num3++;
            order[3]++;
            price += m3.getPrice();
            mealnumlabel.setText(String.valueOf(num));
            meal3label.setText(String.valueOf(num3));
            pricenumlabel.setText(String.valueOf(price));

        }
        if(e.getSource() == minus3button && num3 > 0){
            num--; num3--;
            order[3]--;
            price-= m3.getPrice();
            pricenumlabel.setText(String.valueOf(price));
            mealnumlabel.setText(String.valueOf(num));
            meal3label.setText(String.valueOf(num3));

        }
        if(e.getSource() == add4button){
            num++; num4++;
            order[4]++;
            price += m4.getPrice();
            mealnumlabel.setText(String.valueOf(num));
            meal4label.setText(String.valueOf(num4));
            pricenumlabel.setText(String.valueOf(price));
        }
        if(e.getSource() == minus4button && num4 > 0){
            num--; num4--;
            order[4]--;
            price-= m4.getPrice();
            pricenumlabel.setText(String.valueOf(price));
            mealnumlabel.setText(String.valueOf(num));
            meal4label.setText(String.valueOf(num4));

        }
        if(e.getSource() == add5button){
            num++; num5++;
            order[5]++;
            price += m5.getPrice();
            mealnumlabel.setText(String.valueOf(num));
            meal5label.setText(String.valueOf(num5));
            pricenumlabel.setText(String.valueOf(price));

        }
        if(e.getSource() == minus5button && num5 > 0){
            num--; num5--;
            order[5]--;
            price -= m5.getPrice();
            pricenumlabel.setText(String.valueOf(price));
            mealnumlabel.setText(String.valueOf(num));
            meal5label.setText(String.valueOf(num5));

        }
        if(e.getSource() == add6button){
            num++; num6++;
            order[6]++;
            price += m6.getPrice();
            mealnumlabel.setText(String.valueOf(num));
            meal6label.setText(String.valueOf(num6));
            pricenumlabel.setText(String.valueOf(price));

        }
        if(e.getSource() == minus6button && num6 > 0){
            num--; num6--;
            order[6]--;
            price -= m6.getPrice();
            pricenumlabel.setText(String.valueOf(price));
            mealnumlabel.setText(String.valueOf(num));
            meal6label.setText(String.valueOf(num6));
        }

        if(e.getSource() == mealsitem ){
//            Mealorder m = new Mealorder();
            JOptionPane.showMessageDialog(null,"You are already on meal's order page.",
                    "Title",JOptionPane.WARNING_MESSAGE);
        }
        if(e.getSource() == saladsitem){
            SaladOrder s = new SaladOrder(order);
        }
        if(e.getSource() == dessertsitem){
            DessertOrder d = new DessertOrder(order);
        }

        if(e.getSource() == viewcartbutton){
            if(num == 0){
                JOptionPane.showMessageDialog(null,"You have to select meals to buy."
                        ,"Title",JOptionPane.ERROR_MESSAGE);
            }
            else {
                
                Cart cart = new Cart(order);}
        }


    }
}
