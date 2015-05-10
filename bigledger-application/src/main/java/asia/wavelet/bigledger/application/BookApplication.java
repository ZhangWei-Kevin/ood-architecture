package asia.wavelet.bigledger.application;


import java.util.List;
import java.util.Set;
import  asia.wavelet.bigledger.core.domain.Book;

public interface BookApplication {

	public Book getBook(Long id);
	
	public void creatBook(Book book);
	
	public void updateBook(Book book);
	
	public void removeBook(Book book);
	
	public void removeBooks(Set<Book> books);
	
	public List<Book> findAllBook();
	
}

