package sub2;

public class Book {

	private String title;
	private String author;
	private String isbn;
	private int availableCopies; // availableCopies
	
	public Book(String title, String author, String isbn, int availableCopies) {
	
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.availableCopies = availableCopies;
	}
		
	public int getAvailableCopies() {
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}

	public boolean borrowBook() {
		
		if(availableCopies>=1)
		{
			availableCopies--;
			return true;
		}else
			return false;	
	}
	
	public void returnBook() {
		availableCopies++;
	}
	
	public void show(){
		System.out.println("책제목 : "+this.title);
		System.out.println("작가 : "+this.author);
		System.out.println("ISBN번호 : "+this.isbn);
		System.out.println("이용가능한 복사본 수: "+this.availableCopies);
	}
	// Setter&Getter 
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
