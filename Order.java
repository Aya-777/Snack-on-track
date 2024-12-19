import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Order implements ActionListener {

    static Integer [] order = new Integer[23];
    static Meal[] meallist = new Meal[23]; 
    static int num=0,price=0;
    JFrame f = new JFrame();
    JLabel mealnumlabel = new JLabel(String.valueOf(num));
    JLabel pricelabel = new JLabel("Price : ");
    JLabel pricenumlabel = new JLabel(String.valueOf(price));
    JButton viewcartbutton = new JButton("View cart");
    JLabel mealslabel = new JLabel("Meals :");
    
    JMenuBar mealsbar = new JMenuBar();
    JMenuItem mealsitem = new JMenuItem("Meals");
    JMenuItem saladsitem = new JMenuItem("Salads");
    JMenuItem dessertsitem = new JMenuItem("Desserts");
    JMenuItem drinksitem = new JMenuItem("Drinks");


        // Meals
    static Meal m1 = new Meal(1,100,"Teryaki Chicken",
            "Chicken cooked in soy sauce," +
                    "honey and apple juice, mixed with capsicum, carrot," +
                    " served with rice and broccoli." ,520);
    static Meal m2 = new Meal(2,200,"Healthy Chicken Meal",
            "grilled chicken, grilled broccoli" +
                    ", grilled carrots,grilled beans,grilled fresh mushrooms, grilled potatoes," +
                    "served with special sauce and rice cooked with an aromatic bouquet.",500);
    static Meal m3 = new Meal(3,200,"Curry Chicken",
            "Chicken cooked with skimmed coconut milk, mixed with capsicum," +
                    "ginger, chicken broth, garlic, curry powder.",535);
    static Meal m4 = new Meal(4,200,"Healthy Steak Meal",
            "Grilled fillet, broccoli, fries, served with special sauce and rice," +
                    " cooked with an aromatic bouquet.",590);
    static Meal m5 = new Meal(5,200,"Chicken Avocado",
            "Grilled chicken, roasted red pepper, roaster mushrooms, cashew cream, avocado," +
                    " ciabatta bread seven seeds.",410);
    static Meal m6 = new Meal(6,200,"Tuna", "Seven grain brown loofah bread served with olive tabinade, rocca, tomato,"+
    "lemon fillet, capers and diet tuna.",340);
    static Meal m7 = new Meal(7,200,"Turkey", "Tortilla bread served with turkey, rocca, pickels and special yogurt sauce."
            ,225);
    
        // Salads
    static Meal s1 = new Meal(8,23,"Greek Salad",
        "Tomato, cucumber, mixed pepper, olive, lemon, olive oil.",275);  
    static Meal s2 = new Meal(9,23,"Broccoli Salad",
        "Broccoli, cherry tomato, la russo lettuce, rocca, lemon, olive oil.",160);
    static Meal s3 = new Meal(10,23,"Quinoa Salad",
        "Quinoa, avocado, cherry tomato. walnut, red pepper, carrot," +
                "cucumber, mixed greens, red beans, lemon and olive oil.",490);
    static Meal s4 = new Meal(11,23,"Asian Salad",
        "Mixed peppers, mixed greens, artichoke, noodles, red beans, edmamme, grilled chicken served with"
        +" light soy sauce and orange.",490);

        //Desserts    
    static Meal d1 = new Meal(11,1000,"Chocolate Shia Pudding",
        "Shia seeds, cocoa powder, banana, milk, chocolate shavings.",250);
    static Meal d2 = new Meal(12,1300,"Granola Bars",
        "Shia seeds, oatmeal, raisins, almond, sunflower seeds, pumpkin seeds, coconut flakes, honey.",300);
    static Meal d3 = new Meal(13,1000,"Muhalabia(arabian milk pudding)",
        "Milk, sugar, roses.",100);
    static Meal d4 = new Meal(14,1500,"Vegan Mango Shia Pudding",
        "Shia seeds, mango slices, mango juice, sugar.",280);
    static Meal d5 = new Meal(15,800,"Flan","Milk, sugar, caramel",300);


    Order(){
        f.setLayout(null);

        mealsbar.add(mealsitem);
        mealsbar.add(saladsitem);
        mealsbar.add(dessertsitem);
        mealsbar.add(drinksitem);

        viewcartbutton.setBounds(50,200 , 130, 30);
        mealslabel.setBounds(200, 212, 100, 20);
        mealslabel.setFont(new Font("Consolas", Font.PLAIN ,20));
        mealnumlabel.setBounds(295 , 212 , 50, 20);
        mealnumlabel.setFont(new Font("Consolas", Font.PLAIN ,20));
        pricelabel.setBounds(360, 212, 100, 20);
        pricelabel.setFont(new Font("Consolas",Font.PLAIN,20));
        pricenumlabel.setBounds(460, 212, 50, 20);
        pricenumlabel.setFont(new Font("Consolas",Font.PLAIN,20));
        mealsbar.setBounds(0, 250, 665, 50);
        mealsbar.setFont(new Font("Consolas",Font.PLAIN,200));

        f.add(viewcartbutton);
        f.add(mealnumlabel);
        f.add(mealslabel);
        f.add(pricelabel);
        f.add(pricenumlabel);
        f.add(mealsbar);

        viewcartbutton.addActionListener(this);
        mealsitem.addActionListener(this);
        saladsitem.addActionListener(this);
        dessertsitem.addActionListener(this);
        drinksitem.addActionListener(this);

      
        meallist[0]=null;
        meallist[1]=m1;
        meallist[2]=m2;
        meallist[3]=m3;
        meallist[4]=m4;
        meallist[5]=m5;
        meallist[6]=m6;
        meallist[7]=m7;
        meallist[8]=s1;
        meallist[9]=s2;
        meallist[10]=s3;
        meallist[11]=s4;
        meallist[12]=d1;
        meallist[13]=d2;
        meallist[14]=d3;
        meallist[15]=d4;
        meallist[16]=null;
        meallist[17]=null;

        f.setSize(665,850);
        f.setVisible(true);
        f.setLocationRelativeTo(null);

        
    }
    public static Meal getMeal(int mealnum){
        return meallist[mealnum];
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
