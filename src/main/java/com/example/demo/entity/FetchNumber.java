package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FetchNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String CategoryCode;
    private Long value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryCode() {
        return CategoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        CategoryCode = categoryCode;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public FetchNumber(Long id, String categoryCode, Long value) {
        this.id = id;
        CategoryCode = categoryCode;
        this.value = value;
    }

    public FetchNumber() {
    }

    @Override
    public String toString() {
        return "FetchNumber{" +
                "id=" + id +
                ", CategoryCode='" + CategoryCode + '\'' +
                ", value=" + value +
                '}';
    }
}
