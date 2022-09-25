package com.ind.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.util.Date;

@XmlRootElement
@Entity
@Table(name = "kitap")
public class Books {
    @Id
    private BigDecimal id;
    @Column(length = 100, name = "adi")
    private String adi;
    @Column(length = 100, name = "yazari")
    private String yazari;
    @Column(length = 20, name = "yayin_evi")
    private String yayinEvi;
    @Column(name = "basim_tarihi")
    private Date basimTarihi;
    @Column(name = "baski_sayisi")
    private BigDecimal baskiSayisi;
    @Column(length = 30, name = "turu")
    private String turu;

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

    public String getYazari() {
        return yazari;
    }

    public void setYazari(String yazari) {
        this.yazari = yazari;
    }

    public String getYayinEvi() {
        return yayinEvi;
    }

    public void setYayinEvi(String yayinEvi) {
        this.yayinEvi = yayinEvi;
    }

    public Date getBasimTarihi() {
        return basimTarihi;
    }

    public void setBasimTarihi(Date basimTarihi) {
        this.basimTarihi = basimTarihi;
    }

    public BigDecimal getBaskiSayisi() {
        return baskiSayisi;
    }

    public void setBaskiSayisi(BigDecimal baskiSayisi) {
        this.baskiSayisi = baskiSayisi;
    }

    public String getTuru() {
        return turu;
    }

    public void setTuru(String turu) {
        this.turu = turu;
    }
}
