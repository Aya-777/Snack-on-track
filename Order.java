import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
    private ArrayList<Meal> order = new ArrayList<Meal>();


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
    
        // Salads
    static Meal s1 = new Meal(8,23,"Greek Salad",
        "Tomato, cucumber, mixed pepper, olive, lemon, olive oil.",275,0);  
    static Meal s2 = new Meal(9,23,"Broccoli Salad",
        "Broccoli, cherry tomato, la russo lettuce, rocca, lemon, olive oil.",160,0);
    static Meal s3 = new Meal(10,23,"Quinoa Salad",
        "Quinoa, avocado, cherry tomato. walnut, red pepper, carrot," +
                "cucumber, mixed greens, red beans, lemon and olive oil.",490,0);
    static Meal s4 = new Meal(11,23,"Asian Salad",
        "Mixed peppers, mixed greens, artichoke, noodles, red beans, edmamme, grilled chicken served with"
        +" light soy sauce and orange.",490,0);

        //Desserts    
    static Meal d1 = new Meal(11,1000,"Chocolate Shia Pudding",
        "Shia seeds, cocoa powder, banana, milk, chocolate shavings.",250,0);
    static Meal d2 = new Meal(12,1300,"Granola Bars",
        "Shia seeds, oatmeal, raisins, almond, sunflower seeds, pumpkin seeds, coconut flakes, honey.",300,0);
    static Meal d3 = new Meal(13,1000,"Muhalabia(arabian milk pudding)",
        "Milk, sugar, roses.",100,0);
    static Meal d4 = new Meal(14,1500,"Vegan Mango Shia Pudding",
        "Shia seeds, mango slices, mango juice, sugar.",280,0);
    static Meal d5 = new Meal(15,800,"Flan","Milk, sugar, caramel",300,0);


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

        order.add(m1);
        order.add(m2);
        order.add(m3);
        order.add(m4);
        order.add(m5);
        order.add(m6);
        order.add(m7);
        order.add(s1);
        order.add(s2);
        order.add(s3);
        order.add(s4);
        order.add(d1);
        order.add(d2);
        order.add(d3);
        order.add(d4);
        order.add(d5);
    }

    public static ArrayList<Meal> getOrder() {
        return order;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
