package com.ind.library.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.util.Date;

@XmlRootElement
@IdClass(UserBooksEntity.class)
@Entity(name = "UserBooks")
@Table(name = "kullanici_kitaplari")
public class UserBooks {
    @Id
    private BigDecimal kullaniciId;
    @Id
    private BigDecimal kitapId;
    @Column(name = "teslim_alma_tarihi")
    private Date teslimAlmaTarihi;
    @Column(name = "teslim_etme_tarihi")
    private Date teslimEtmeTarihi;

    public BigDecimal getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(BigDecimal kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public BigDecimal getKitapId() {
        return kitapId;
    }

    public void setKitapId(BigDecimal kitapId) {
        this.kitapId = kitapId;
    }

    public Date getTeslimAlmaTarihi() {
        return teslimAlmaTarihi;
    }

    public void setTeslimAlmaTarihi(Date teslimAlmaTarihi) {
        this.teslimAlmaTarihi = teslimAlmaTarihi;
    }

    public Date getTeslimEtmeTarihi() {
        return teslimEtmeTarihi;
    }

    public void setTeslimEtmeTarihi(Date teslimEtmeTarihi) {
        this.teslimEtmeTarihi = teslimEtmeTarihi;
    }
}