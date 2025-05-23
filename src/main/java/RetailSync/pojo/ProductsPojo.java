/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RetailSync.pojo;

/**
 *
 * @author Admin
 */
public class ProductsPojo {

    public ProductsPojo()
    {
    
    }
    
    public ProductsPojo(String productId, String productName, String productCompany, double productPrice, double ourPrice, int tax, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.productCompany = productCompany;
        this.productPrice = productPrice;
        this.ourPrice = ourPrice;
        this.tax = tax;
        this.quantity = quantity;
        this.total = total;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getOurPrice() {
        return ourPrice;
    }

    public void setOurPrice(double ourPrice) {
        this.ourPrice = ourPrice;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
     public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    private String productId;
    private String productName;
    private String productCompany;
    private double productPrice;
    private double ourPrice;
    private int tax;
    private int quantity;
    private double total;
}
