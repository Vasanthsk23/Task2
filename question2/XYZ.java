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
            int price = scanner.nextInt();

            System.out.println("enter quantity for product " +i);
            int quantity = scanner.nextInt();

            Product obj = new Product(pid,price,quantity);
            arr[i-1] = obj;
        }
        //Find highest price from array
        int highestPrice = 0;
        for (int i=0; i< arr.length; i++){
            highestPrice = Math.max(highestPrice,arr[i].price);
        }
        for(int i=0; i< arr.length; i++){
            if(arr[i].price == highestPrice){
                System.out.println("Highest price is: "+ highestPrice + " and product id is: " + arr[i].pid);
            }
        }
        System.out.println("Final amount is" + getFinalAmount(arr));
    }
    //Find final amount from array
    public static int getFinalAmount(Product[] arr) {
        int finalAmount = 0;

        for (int i = 0; i < arr.length; i++) {
            finalAmount = finalAmount + (arr[i].price * arr[i].quantity);
        }
        return finalAmount;
    }

}
