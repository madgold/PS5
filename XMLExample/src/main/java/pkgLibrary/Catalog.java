package pkgLibrary;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Catalog {

	@XmlAttribute
	int id;	
	
	@XmlElement(name="book")
	ArrayList<Book> books;
	
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	
	public Book GetBook(String BookID) {
		Book b = null;
		//write the code to take given catalog and loop 
		return b;
	}
	
	public void AddBook(Book b) throws Exception{
		for (Book bk : this.books) {
			if (bk.getId() == b.getId()) {
				throw new Exception("book exists");
			}
		}
		
		this.books.add(b);
		
	}
	

	
	


	
	
	
	
}
