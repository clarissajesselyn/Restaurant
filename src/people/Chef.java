package people;

import java.util.ArrayList;

public class Chef {
    private String name;
    ArrayList<String> cookHistories = new ArrayList<>();

    public Chef (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void addCookHistory(String history){
        cookHistories.add(history);
    }

    public void showCookHistory(){
        for (String string : cookHistories) {
            System.out.println("- " + string);
        }
    }
}
