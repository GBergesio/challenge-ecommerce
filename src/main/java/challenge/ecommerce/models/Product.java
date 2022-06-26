package challenge.ecommerce.models;

import challenge.ecommerce.enums.Category;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;

    private String name;
    private String description;
    private String img;
    private Short stock;
    private Double price;
    private Byte discount;
    private String serie;
    private Category category;
    private String subcategory;
    private boolean deleted;

    public Product(){}

    public Product(String name, String description, String img, Short stock, Double price, String serie, Category category, String subcategory) {
        this.name = name;
        this.description = description;
        this.img = img;
        this.stock = stock;
        this.price = price;
        this.discount = 15;
        this.serie = serie;
        this.category = category;
        this.subcategory = subcategory;
        this.deleted = false;
    }
}
