package com.ind.library.service;

import com.ind.library.entity.Books;
import com.ind.library.repo.BooksRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BookService {
    private final BooksRepository booksRepository;

    public BookService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Transactional
    public Books getBookFromId(BigDecimal id) {
        Books books = booksRepository.getById(id);
        return toBookDto(books);
    }

    private Books toBookDto(Books books) {
        Books kitap = new Books();
        kitap.setId(books.getId());
        kitap.setAdi(books.getAdi());
        kitap.setYazari(books.getYazari());
        kitap.setYayinEvi(books.getYayinEvi());
        kitap.setBasimTarihi(books.getBasimTarihi());
        kitap.setBaskiSayisi(books.getBaskiSayisi());
        kitap.setTuru(books.getTuru());
        return kitap;
    }

    @Transactional
    public List<Books> getBooksList() {
        return booksRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @Transactional
    public List<Books> getBooksListByName(String bookName) {
        return booksRepository.getBooksListByName(bookName);
    }

    @Transactional
    public boolean bookInsertDb(Books book) {
        booksRepository.save(book);
        return true;
    }

}
