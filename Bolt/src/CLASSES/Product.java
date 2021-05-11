package CLASSES;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Product {

    Connection connection;

    private Integer id;
    private String name;
    private Integer category_id;
    private String price;
    private Integer quantity;
    private String category;

    public Product() {
    }

    public Product(Integer ID, String NAME, Integer CATEGORY_ID, String PRICE, Integer QUANTITY, String categoryName) {
        this.id = ID;
        this.name = NAME;
        this.category_id = CATEGORY_ID;
        this.price = PRICE;
        this.quantity = QUANTITY;
        this.category = categoryName;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategoryName(Integer category_id) {
        return category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
