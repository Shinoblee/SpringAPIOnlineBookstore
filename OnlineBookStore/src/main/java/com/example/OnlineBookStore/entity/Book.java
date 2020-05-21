package com.example.OnlineBookStore.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name="tbl_book")
@ToString
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String sku;

    private String name;

    private String description;

    @Column(name="unit_price")
    private BigDecimal unitPrice;

    @Column(name="image_url")
    private String imageUrl;

    private boolean active;

    @Column(name="units_in_stock")
    private int unitsInStock;

    @Column(name="date_created")
    private Date createdOn;

    @Column(name="last_updated")
    private Date updateOn;

    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    private Category category;


}
