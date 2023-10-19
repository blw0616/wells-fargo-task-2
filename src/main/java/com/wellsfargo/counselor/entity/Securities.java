package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Securities {

    @Id
    @GeneratedValue()
    private long SecuritiesId;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private Int Quantity;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Double Total;

    @Column(nullable = false)
    private Int purchaseDate;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PortfolioId")

    protected Securities() {

    }
    public Securities(String symbol, String type, Int Quantity, Int price, Int Total) {
        this.symbol = symbol;
        this.type = type;
        this.Quantity = Quantity;
        this.price = price;
        this.Total = Total;
    }


    public Long getSecuritiesId() {
        return SecuritiesId;
    }

    public String getsymbol() {
        return symbol;
    }

    public void setsymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getType() {
        return type;
    }

    public void Int setType(String type) {
        this.type = type;
    }

    public Int getTotal() {
        return Total;
    }

    public void setTotal(Int Total) {
        this.Total = Total;
    }

    public Int getPrice() {
        return price;
    }

    public void setPrice(Int price) {
        this.price = price;
    }

    public Int getQuantity() {
        return Quantity;
    }

    public void setQuantity(Int Quantity) {
        this.Quantity = Quantity;
    }
}