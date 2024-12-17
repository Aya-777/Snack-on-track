import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Meal implements Serializable{

    private int price;
    private int serialnum ;
    private String desc;
    private String name;
    private int cals;
    private int num;

    Meal(int serialnum , int price,String name ,String desc ,int cals , int num){
        this.serialnum=serialnum;
        this.price=price;
        this.desc=desc;
        this.name=name;
        this.cals=cals;
        this.num=num;
    }

    public void setNum(int num) {
        this.serialnum = num;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setCals(int cals) {
        this.cals = cals;
    }
    public void setSerialnum(int serialnum) {
        this.serialnum = serialnum;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public int getNum() {
        return serialnum;
    }
    public String getDesc() {
        return desc;
    }
    public int getCals() {
        return cals;
    }
    public int getSerialnum() {
        return serialnum;
    }
    public String getName() {
        return name;
    }

}
