package com.ind.library.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class UserBooksEntity implements Serializable {

    private BigDecimal kullaniciId;
    private BigDecimal kitapId;

    public UserBooksEntity(){
    }
    public UserBooksEntity(BigDecimal kullaniciId, BigDecimal kitapId) {
        this.kullaniciId = kullaniciId;
        this.kitapId = kitapId;
    }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserBooksEntity)) return false;
        UserBooksEntity that = (UserBooksEntity) o;
        return Objects.equals(getKullaniciId(), that.getKullaniciId()) &&
                Objects.equals(getKitapId(), that.getKitapId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKullaniciId(), getKitapId());
    }
}
