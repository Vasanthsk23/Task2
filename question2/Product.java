package question2;

public class Product {
    private int pid;
   private double price;
    private int quantity;

    public int getPid(){
        return this.pid;
    }

    public void setPid(int pid){
        this.pid = pid;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }




    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}