package com.ind.library.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement
@Entity
@Table(name = "kullanici")
public class Users {
    @Id
    private BigDecimal id;
    @Column(length = 50, name = "adi")
    private String adi;
    @Column(length = 100, name = "soyadi")
    private String soyadi;
    @Column(length = 20, name = "sifre")
    private String sifre;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}
