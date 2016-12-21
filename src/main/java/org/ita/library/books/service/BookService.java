/**
 * 
 */
package org.ita.library.books.service;

import org.ita.library.books.domain.Book;
import org.ita.library.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author ayyappamuthusami
 * @version 1.0
 */
@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Object findAll() {
		return bookRepository.findAll();
	}
	
	public Book findById(Long id) {
		return bookRepository.findOne(id);
	}
	
	public Book save(Book book) {
		return bookRepository.save(book);
	}
	
	public Book findByBookId(String bookId) {
		return bookRepository.findByBookId(bookId);
	}
	
	public Book findByName(String name) {
		return bookRepository.findByName(name);
	}
	
	public Book findByBookIdComplete(String bookId) {
		return bookRepository.findByBookIdComplete(bookId);
	}
}
