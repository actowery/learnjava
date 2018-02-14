/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cihan
 */
public class Product {
    private String name;
    private double cost;
    private int quantity;
    public Product(String n, double c, int q) {
        this.name = n;
        this.quantity = q;
        this.cost = c;
    }
    public void printProduct(){
        System.out.println(this.name);
        System.out.println(this.cost);
        System.out.println(this.quantity);
    }
}
