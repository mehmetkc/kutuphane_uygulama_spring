package com.ind.library.repo;

import com.ind.library.entity.Books;
import com.ind.library.entity.UserBooks;
import com.ind.library.entity.UserBooksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface LibraryRepository extends JpaRepository<UserBooks, BigDecimal> {
    @Query(value = "select ub from UserBooks ub where ub.kullaniciId = ?1")
    List<UserBooks> getUserLibraryInfo(BigDecimal kullaniciId);

    @Query(value = "select ub from UserBooks ub where ub.kullaniciId = ?1 and ub.kitapId = ?2")
    UserBooks findUserBookInfo(BigDecimal kullaniciId, BigDecimal kitapId);

}
