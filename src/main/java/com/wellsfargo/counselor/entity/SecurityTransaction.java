package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class SecurityTransaction {

    @Id
    @GeneratedValue
    private long transactionId;

    @ManyToOne
    @JoinColumn(name = "security_id", nullable = false)
    private Security security;

    @Column(nullable = false)
    private LocalDate transactionDate;

    @Column(nullable = false)
    private double quantity;

    @Column(nullable = false)
    private double price;

    protected SecurityTransaction() {}

    public SecurityTransaction(Security security, LocalDate transactionDate, double quantity, double price) {
        this.security = security;
        this.transactionDate = transactionDate;
        this.quantity = quantity;
        this.price = price;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
