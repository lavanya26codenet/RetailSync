/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RetailSync.pojo;

/**
 *
 * @author Admin
 */
public class OrderPojo {
    private String orderId;
    private String productId;
    private int quantity;
    private String userId;

    // Constructor
    public OrderPojo() {}

    public OrderPojo(String orderId, String productId, int quantity, String userId) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.userId = userId;
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "OrderPojo{" +
                "orderId='" + orderId + '\'' +
                ", productId='" + productId + '\'' +
                ", quantity=" + quantity +
                ", userId='" + userId + '\'' +
                '}';
    }
}

