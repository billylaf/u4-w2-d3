package entities;

import java.util.Random;

public class Customers {
    Random random = new Random();
    private Long id;
    private String name;
    private Integer tier;

    public Customers(String name) {
        this.id = (long) random.nextInt();
        this.name = name;
        this.tier = random.nextInt(0, 3);
    }

    public Long getCustomerId() {
        return id;
    }

    public Integer getTier() {
        return tier;
    }

    public String getCustomerName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "random=" + random +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}
