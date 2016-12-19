/**
 * 
 */
package org.ita.library.books;

import java.util.List;

import org.ita.library.books.domain.Book;
import org.ita.library.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for books module which exposes rest api
 * 
 * @author ayyappamuthusami
 * @version 1.0
 */
@RestController
public class BooksController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Book> listBooks() {
		return (List<Book>)bookService.findAll();
	}

	@RequestMapping(value="/create", method=RequestMethod.POST)
	public Book createBook(@RequestBody Book book) {
		System.out.println("book id is "+ book.getBookId());
		return bookService.save(book);
	}
	
	@RequestMapping(value="/findBook", method=RequestMethod.POST)
	public Book findBook(@RequestBody String key) {
		Book book = bookService.findByBookId(key);
		System.out.println("findBook by Id returned "+ book);
		if (book == null) {
			book = bookService.findByName(key);
			System.out.println("find by name returned "+book);
			if (book == null) {
				book = bookService.findByBookIdComplete(key);
				System.out.println("find by book id complete "+book);
			}
		}
		return book;
	}
}