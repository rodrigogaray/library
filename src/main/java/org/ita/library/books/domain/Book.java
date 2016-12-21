/**
 * 
 */
package org.ita.library.books.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Book model object
 * @author ayyappamuthusami
 * @version 1.0
 */
@Entity
public class Book {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	private String bookId;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getBookId() {
		return bookId;
	}

	@Column(name="book_id", nullable=false, unique=true)
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}


	public String getBookIdComplete() {
		return bookIdComplete;
	}

	@Column(name="book_id_complete", nullable=false, unique=true)
	public void setBookIdComplete(String bookIdComplete) {
		this.bookIdComplete = bookIdComplete;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameInTamil() {
		return nameInTamil;
	}

	public void setNameInTamil(String nameInTamil) {
		this.nameInTamil = nameInTamil;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String bookIdComplete;
	
	@Column(name="name")
	private String name;
	
	@Column(name="name_in_tamil")
	private String nameInTamil;
	
	@Column(name="type")
	private String type;
	
}
