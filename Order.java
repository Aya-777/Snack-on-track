import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Order implements ActionListener {

    Integer [] order = new Integer[18];
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

      
        order[0]=0;
        order[1]=0;
        order[2]=0;
        order[3]=0;
        order[4]=0;
        order[5]=0;
        order[6]=0;
        order[7]=0;
        order[8]=0;
        order[9]=0;
        order[10]=0;
        order[11]=0;
        order[12]=0;
        order[13]=0;
        order[14]=0;
        order[15]=0;
        order[16]=0;
        order[17]=0;

        f.setSize(500,500);
        f.setVisible(true);
        f.setLocationRelativeTo(null);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
