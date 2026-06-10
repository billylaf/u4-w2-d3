package entities;

public class Products {
    private Long id;
    private String name;
    private String category;
    private Double price;

    public Products(Long id, String name, String category, Double price) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;
    }


    public Long getProductId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProductName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
