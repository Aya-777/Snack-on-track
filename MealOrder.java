import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MealOrder extends Order implements ActionListener {

    // Meals
    static Meal m1 = new Meal(1,100,"Teryaki Chicken",
            "Chicken cooked in soy sauce," +
                    "honey and apple juice, mixed with capsicum, carrot," +
                    " served with rice and broccoli." ,520,0);
    static Meal m2 = new Meal(2,200,"Healthy Chicken Meal",
            "grilled chicken, grilled broccoli" +
                    ", grilled carrots,grilled beans,grilled fresh mushrooms, grilled potatoes," +
                    "served with special sauce and rice cooked with an aromatic bouquet.",500,0);
    static Meal m3 = new Meal(3,200,"Curry Chicken",
            "Chicken cooked with skimmed coconut milk, mixed with capsicum," +
                    "ginger, chicken broth, garlic, curry powder.",535,0);
    static Meal m4 = new Meal(4,200,"Healthy Steak Meal",
            "Grilled fillet, broccoli, fries, served with special sauce and rice," +
                    " cooked with an aromatic bouquet.",590,0);
    static Meal m5 = new Meal(5,200,"Chicken Avocado",
            "Grilled chicken, roasted red pepper, roaster mushrooms, cashew cream, avocado," +
                    " ciabatta bread seven seeds.",410,0);
    static Meal m6 = new Meal(6,200,"Tuna", "Seven grain brown loofah bread served with olive tabinade, rocca, tomato,"+
    "lemon fillet, capers and diet tuna.",340,0);
    static Meal m7 = new Meal(7,200,"Turkey", "Tortilla bread served with turkey, rocca, pickels and special yogurt sauce."
            ,225,0);
    

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

    


    static int num1=0,num2=0,num3=0,num4=0,num5=0,num6=0;



    MealOrder(){
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        mealslabel.setBounds(0,50,100,20);
//        mealnumlabel.setBounds(70,50,100,20);
//        pricelabel.setBounds(200, 300,70,20);
//        pricenumlabel.setBounds(280, 300,50,20);
//        viewcartbutton.setBounds(200 , 250 ,100 , 20);
//
//        meal1label.setBounds(250,20,50,20);
//        add1button.setBounds(300,20,50,20);
//        minus1button.setBounds(350,20,50,20);
//
//        meal2label.setBounds(250,60,50,20);
//        add2button.setBounds(300,60,50,20);
//        minus2button.setBounds(350,60,50,20);
//
//        meal3label.setBounds(250,60,50,20);
//        add3button.setBounds(300,60,50,20);
//        minus3button.setBounds(350,60,50,20);
//
//        meal4label.setBounds(250,60,50,20);
//        add4button.setBounds(300,60,50,20);
//        minus4button.setBounds(350,60,50,20);
//
//        meal5label.setBounds(250,60,50,20);
//        add5button.setBounds(300,60,50,20);
//        minus5button.setBounds(350,60,50,20);
//
//        meal6label.setBounds(250,60,50,20);
//        add6button.setBounds(300,60,50,20);
//        minus6button.setBounds(350,60,50,20);

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

        mealbutton.setEnabled(false);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add1button){
            Order.num++; num1++;
            Order.price += m1.getPrice();
            mealnumlabel.setText(String.valueOf(Order.num));
            meal1label.setText(String.valueOf(num1));
            pricenumlabel.setText(String.valueOf(Order.price));
            m1.setNum(m1.getNum()+1);

        }
        if(e.getSource() == minus1button && num1 > 0){
            Order.num--; num1--;
            Order.price-= m1.getPrice();
            pricenumlabel.setText(String.valueOf(Order.price));
            mealnumlabel.setText(String.valueOf(Order.num));
            meal1label.setText(String.valueOf(num1));
            m1.setNum(m1.getNum()-1);

        }
        if(e.getSource() == add2button){
            Order.num++; num2++;
            Order.price += m2.getPrice();
            mealnumlabel.setText(String.valueOf(Order.num));
            meal2label.setText(String.valueOf(num2));
            pricenumlabel.setText(String.valueOf(Order.price));
            m2.setNum(m2.getNum()+1);
        }
        if(e.getSource() == minus2button && num2 > 0){
            Order.num--; num2--;
            Order.price-=m2.getPrice();
            mealnumlabel.setText(String.valueOf(Order.num));
            pricenumlabel.setText(String.valueOf(Order.price));
            meal2label.setText(String.valueOf(num2));
            m2.setNum(m2.getNum()-1);
        }
        if(e.getSource() == add3button){
            Order.num++; num3++;
            Order.price += m3.getPrice();
            mealnumlabel.setText(String.valueOf(Order.num));
            meal3label.setText(String.valueOf(num3));
            pricenumlabel.setText(String.valueOf(Order.price));
            m3.setNum(m3.getNum()+1);

        }
        if(e.getSource() == minus3button && num3 > 0){
            Order.num--; num3--;
            Order.price-= m3.getPrice();
            pricenumlabel.setText(String.valueOf(Order.price));
            mealnumlabel.setText(String.valueOf(Order.num));
            meal3label.setText(String.valueOf(num3));
            m3.setNum(m3.getNum()-1);

        }
        if(e.getSource() == add4button){
            Order.num++; num4++;
            Order.price += m4.getPrice();
            mealnumlabel.setText(String.valueOf(Order.num));
            meal4label.setText(String.valueOf(num4));
            pricenumlabel.setText(String.valueOf(Order.price));
            m4.setNum(m4.getNum()+1);

        }
        if(e.getSource() == minus4button && num4 > 0){
            Order.num--; num4--;
            Order.price-= m4.getPrice();
            pricenumlabel.setText(String.valueOf(Order.price));
            mealnumlabel.setText(String.valueOf(Order.num));
            meal4label.setText(String.valueOf(num4));
            m4.setNum(m4.getNum()-1);

        }
        if(e.getSource() == add5button){
            Order.num++; num5++;
            Order.price += m5.getPrice();
            mealnumlabel.setText(String.valueOf(Order.num));
            meal1label.setText(String.valueOf(num5));
            pricenumlabel.setText(String.valueOf(Order.price));
            m5.setNum(m5.getNum()+1);

        }
        if(e.getSource() == minus5button && num5 > 0){
            Order.num--; num5--;
            Order.price -= m5.getPrice();
            pricenumlabel.setText(String.valueOf(Order.price));
            mealnumlabel.setText(String.valueOf(Order.num));
            meal5label.setText(String.valueOf(num5));
            m5.setNum(m5.getNum()-1);

        }
        if(e.getSource() == add6button){
            Order.num++; num6++;
            Order.price += m6.getPrice();
            mealnumlabel.setText(String.valueOf(Order.num));
            meal6label.setText(String.valueOf(num6));
            pricenumlabel.setText(String.valueOf(Order.price));
            m6.setNum(m6.getNum()+1);

        }
        if(e.getSource() == minus6button && num6 > 0){
            Order.num--; num6--;
            Order.price -= m6.getPrice();
            pricenumlabel.setText(String.valueOf(Order.price));
            mealnumlabel.setText(String.valueOf(Order.num));
            meal6label.setText(String.valueOf(num6));
            m6.setNum(m6.getNum()-1);

        }

        if(e.getSource() == mealbutton){
//            Mealorder m = new Mealorder();
            JOptionPane.showMessageDialog(null,"You are already on meal's order page.",
                    "Title",JOptionPane.WARNING_MESSAGE);
        }
        if(e.getSource() == saladbutton){
            SaladOrder s = new SaladOrder();
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
