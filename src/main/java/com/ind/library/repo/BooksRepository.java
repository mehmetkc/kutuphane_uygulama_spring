package com.ind.library.repo;

import com.ind.library.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
@Repository
public interface BooksRepository extends JpaRepository<Books, BigDecimal> {
    @Query(value = "select k from Books k where k.adi like %?1%")
    List<Books> getBooksListByName(String adi);
}
