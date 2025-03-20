package restaurant;

import java.util.ArrayList;
import main.*;

public class Menu {
    private String name;
    private ArrayList<Food> foods = new ArrayList<>();

    public Menu(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void add(Food food){
        foods.add(food);
    }

    public ArrayList<Food> getFoods(){
        return foods;
    }
}
