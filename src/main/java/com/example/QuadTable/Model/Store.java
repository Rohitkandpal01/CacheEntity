package com.example.QuadTable.Model;

import com.sun.xml.bind.v2.model.core.ID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer store_id;
    private String store_name;
    private String store_department;
    private Boolean store_active;

    public Store() {
    }

    public Integer getStore_id() {
        return store_id;
    }

    public void setStore_id(Integer store_id) {
        this.store_id = store_id;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getStore_department() {
        return store_department;
    }

    public void setStore_department(String store_department) {
        this.store_department = store_department;
    }

    public Boolean getStore_active() {
        return store_active;
    }

    public void setStore_active(Boolean store_active) {
        this.store_active = store_active;
    }
}
