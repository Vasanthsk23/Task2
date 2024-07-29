package question2;

import java.util.Arrays;
import java.util.Scanner;

public class XYZ {

    public static void main(String[] args) {
        //Accept 5 product info and store in array
        Product[] arr = new Product[5];
        for (int i=1; i<=5; i++){
            System.out.println("enter product id for product " +i);
            Scanner scanner = new Scanner(System.in);
            int pid = scanner.nextInt();

            System.out.println("enter price for product " +i);
            double price = scanner.nextDouble();

            System.out.println("enter quantity for product " +i);
            int quantity = scanner.nextInt();

            Product obj = new Product(pid,price,quantity);
            arr[i-1] = obj;
        }
        //Find highest price from array
        double highestPrice = 0;
        for (int i=0; i< arr.length; i++){
            highestPrice = Math.max(highestPrice,arr[i].getPrice());
        }
        for(int i=0; i< arr.length; i++){
            if(arr[i].getPrice() == highestPrice){
                System.out.println("Highest price is: "+ highestPrice + " and product id is: " + arr[i].getPid());
            }
        }
        System.out.println("Final amount is " + getFinalAmount(arr));
    }
    //Find final amount from array
    public static double getFinalAmount(Product[] arr) {
        double finalAmount = 0;

        for (int i = 0; i < arr.length; i++) {
            finalAmount = finalAmount + (arr[i].getPrice() * arr[i].getQuantity());
        }
        return finalAmount;
    }

}
