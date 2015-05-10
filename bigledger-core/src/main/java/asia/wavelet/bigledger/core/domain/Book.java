package asia.wavelet.bigledger.core.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.openkoala.koala.commons.domain.KoalaAbstractEntity;

@Entity
@Table(name = "BOOKS")
public class Book extends  KoalaAbstractEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2586241620845554117L;

	@Column
	private String name;
	@Column
	@Temporal(TemporalType.DATE)
	private Calendar publishDate;
	
	@ManyToOne
	private Publisher publisher;
	
	@Override
	public String[] businessKeys() {
		return new String[]{"name"};
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Calendar publishDate) {
		this.publishDate = publishDate;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	

}
