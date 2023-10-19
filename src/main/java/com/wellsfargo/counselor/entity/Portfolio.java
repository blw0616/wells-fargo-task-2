package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long PortfolioId;

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private Int riskFactor;

    @Column(nullable = false)
    private Double Total;

    @Column(nullable = false)
    private Int purchaseDate;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="clientId")

    protected Portfolio() {

    }
    public Portfolio(String portfolioName, Int riskFactor, Int Total) {
        this.portfolioName = portfolioName;
        this.riskFactor = riskFactor;
        this.Total = Total;
    }


    public Long getPortfolioId() {
        return PortfolioId;
    }

    public String getportfolioName() {
        return portfolioName;
    }

    public void setportfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public Int getriskFactor() {
        return riskFactor;
    }

    public void Int setriskFactor(Int riskFactor) {
        this.riskFactor = riskFactor;
    }

    public Int getTotal() {
        return Total;
    }

    public void setTotal(Int Total) {
        this.Total = Total;
    }
}