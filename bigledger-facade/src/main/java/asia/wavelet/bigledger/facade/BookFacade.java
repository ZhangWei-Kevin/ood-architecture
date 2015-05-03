package asia.wavelet.bigledger.facade;

import java.util.List;
import org.dayatang.utils.Page;
import org.openkoala.koala.commons.InvokeResult;
import asia.wavelet.bigledger.facade.dto.*;

public interface BookFacade {

	public InvokeResult getBook(Long id);
	
	public InvokeResult creatBook(BookDTO book);
	
	public InvokeResult updateBook(BookDTO book);
	
	public InvokeResult removeBook(Long id);
	
	public InvokeResult removeBooks(Long[] ids);
	
	public List<BookDTO> findAllBook();
	
	public Page<BookDTO> pageQueryBook(BookDTO book, int currentPage, int pageSize);
	
	public PublisherDTO findPublisherByBook(Long id);


	
}

