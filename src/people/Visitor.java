package people;

public class Visitor {
    private String name;
    private int totalSpent;

    public Visitor(String name){
        this.name = name;
    }   

    public String getName(){
        return name;
    }

    public void order(double price, int quantity){
        totalSpent += (int) price*quantity;
    }

    public void showTotalPrice(){
        System.out.println("Total price: " + totalSpent);
    }
}
