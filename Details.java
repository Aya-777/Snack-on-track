import java.awt.FlowLayout;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Details {
    ArrayList<Meal> meals;
    JProgressBar detailsprogregressbar = new JProgressBar();
    JFrame f = new JFrame();

    Details(ArrayList<Meal> meals){
        this.meals=meals;

        for(Meal i : meals){
            if(i.getNum()>0){
                
            }
        }

        f.setLayout(new FlowLayout());
        // detailsprogregressbar.setBounds(0, 0, 0, 0);
        detailsprogregressbar.setValue(0);
        detailsprogregressbar.setStringPainted(true);

        // mealdetails();

        f.add(detailsprogregressbar);
        f.setSize(500,500);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }

    public void mealdetails(){
        int counter = 0 ;
        while (counter < 101) {
            detailsprogregressbar.setValue(counter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter+=20;
        }
    }

}
