package com.ind.library;

import com.ind.library.entity.Books;
import com.ind.library.entity.UserBooks;
import com.ind.library.service.BookService;
import com.ind.library.service.LibraryService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/library")
@CrossOrigin
public class LibraryController {
    private final BookService bookService;
    private final LibraryService libraryService;

    public LibraryController(BookService bookService, LibraryService libraryService) {
        this.bookService = bookService;
        this.libraryService = libraryService;
    }

    @GetMapping("/book")
    public Books getBookById(@RequestBody Books book) {
        return bookService.getBookFromId(book.getId());
    }

    @PostMapping("/book")
    public boolean insertBook(@RequestBody Books book) {
        return bookService.bookInsertDb(book);
    }


    @GetMapping("/allBooks")
    public List<Books> getBooks() { return bookService.getBooksList(); }

    @GetMapping("/books")
    public List<Books> getBooksByName(@RequestBody Books book) {
        return bookService.getBooksListByName(book.getAdi());
    }

    @GetMapping("/userBooks")
    public List<UserBooks> getUserLibraryInfo(@RequestParam BigDecimal kullaniciId) {
        return libraryService.getUserLibraryInfo(kullaniciId);
    }

    @PostMapping("/userBooks")
    public boolean insertUserBook(@RequestBody UserBooks userBooks) {
        return libraryService.userBookInsertDb(userBooks);
    }

    @PutMapping("/userBooks")
    public boolean updateUserBook(@RequestBody UserBooks userBooks) {
        return libraryService.userBookUpdateDb(userBooks);
    }
}
