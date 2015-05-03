package asia.wavelet.bigledger.application.impl;

import java.util.List;
import java.util.Set;
import javax.inject.Named;
import org.springframework.transaction.annotation.Transactional;
import asia.wavelet.bigledger.application.BookApplication;
import asia.wavelet.bigledger.core.domain.Book;

@Named
@Transactional
public class BookApplicationImpl implements BookApplication {

	public Book getBook(Long id) {
		return Book.get(Book.class, id);
	}
	
	public void creatBook(Book book) {
		book.save();
	}
	
	public void updateBook(Book book) {
		book .save();
	}
	
	public void removeBook(Book book) {
		if(book != null){
			book.remove();
		}
	}
	
	public void removeBooks(Set<Book> books) {
		for (Book book : books) {
			book.remove();
		}
	}
	
	public List<Book> findAllBook() {
		return Book.findAll(Book.class);
	}
	
}
