package net.theironyard.bean;

import java.math.BigDecimal;

public class Product {

    private Integer productId;
    private String name;
    private String imageUrl;
    private String description;
    private String detail;
    private BigDecimal price;

    public Product(Integer productId, String name, String imageUrl, String description, String detail, BigDecimal price) {
        this.productId = productId;
        this.name = name;
        this.imageUrl = imageUrl;
        this.description = description;
        this.detail = detail;
        this.price = price;
    }

    public Product() {
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
