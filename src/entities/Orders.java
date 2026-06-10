package entities;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Orders {
    public LocalDate orderDate;
    public LocalDate deliveryDate;
    Random random = new Random();
    private Long id;
    private String status;
    private List<Products> products;
    private Customers customer;

    public Orders(List<Products> products, Customers customer) {
        this.id = random.nextLong();
        this.status = "esecuzione";
        this.orderDate = LocalDate.now();
        this.deliveryDate = LocalDate.now().plusDays(3);
        this.products = products;
        this.customer = customer;
    }

    public void addProduct(Products product) {
        this.products.add((Products) products);
    }

    public Customers getCustomer() {
        return customer;
    }

    public Long getOrderId() {
        return id;
    }

    public List<Products> getProducts() {
        return products;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                ", id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", products=" + products +
                ", customer=" + customer +
                '}';
    }
}
