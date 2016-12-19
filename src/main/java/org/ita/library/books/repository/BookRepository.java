/**
 * 
 */
package org.ita.library.books.repository;

import org.ita.library.books.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author ayyappamuthusami
 * @version 1.0
 */
@Repository
public interface BookRepository extends CrudRepository<Book,Long>{
	
	public Book findByBookId(String bookId);
	
	public Book findByBookIdComplete(String bookIdComplete);
	
	public Book findByName(String name);

}
