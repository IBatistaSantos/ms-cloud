package com.israelbatista.hrpayroll.entities;

public class Worker {

    public Worker(Long id, String name, Double dailyIncome) {
        Id = id;
        this.name = name;
        this.dailyIncome = dailyIncome;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    private Long Id;
    private String name;
    private Double dailyIncome;

    public Worker() {
    }
}
