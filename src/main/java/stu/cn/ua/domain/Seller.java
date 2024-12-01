package stu.cn.ua.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "Seller")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "seller_id")
    private Long id;


    @Column(name = "seller_name")
    @Size(min = 2, max = 24)
    private String name;


    @Column(name = "seller_email")
    private String email;


    @OneToMany(mappedBy = "seller", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Set<Product> products;

    public Seller() {}

    public Seller(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getSeller() {
        return true;
    }


    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}

