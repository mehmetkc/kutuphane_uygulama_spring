package com.ind.library.service;

import com.ind.library.entity.Books;
import com.ind.library.entity.UserBooks;
import com.ind.library.entity.UserBooksEntity;
import com.ind.library.repo.LibraryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {
    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @Transactional
    public List<UserBooks> getUserLibraryInfo(BigDecimal userId) {
        return libraryRepository.getUserLibraryInfo(userId);
    }

    @Transactional
    public boolean userBookInsertDb(UserBooks userBooks) {
        libraryRepository.save(userBooks);
        return true;
    }

    @Transactional
    public boolean userBookUpdateDb(UserBooks userBooks) {
        UserBooks dbInfo = libraryRepository.findUserBookInfo(userBooks.getKullaniciId(), userBooks.getKitapId());
        if(dbInfo.getKullaniciId() != null) {
            dbInfo.setTeslimAlmaTarihi(userBooks.getTeslimAlmaTarihi());
            dbInfo.setTeslimEtmeTarihi(userBooks.getTeslimEtmeTarihi());
            libraryRepository.save(dbInfo);
        }
        return true;
    }
}
