package com.example.data;




import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "ORDER_TBL")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @CreationTimestamp
    @Column(name = "ORDER_DATE",updatable=false)
    private LocalDate createdTime;
    
    @UpdateTimestamp
    @Column(name="ORDER_UPDATE_DATE")
    private LocalDate updatedTime;

    @Column(name = "ORDER_QTY",nullable = false)
    private Long orderQuantity;
//    
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "CUSTOMER_ID",nullable = false)
//    private Customer customer;
//    
//    
//    @ManyToOne
//    @JoinColumn(name = "PRODUCT_ID")
//    private Product product;
//
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
    
    

    public LocalDate getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDate updatedTime) {
        this.updatedTime = updatedTime;
    }
    
    
    

    public LocalDate getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDate createdTime) {
        this.createdTime = createdTime;
    }

   

    public Long getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Long orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
}
