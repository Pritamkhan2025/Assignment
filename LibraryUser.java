package library;

public interface LibraryUser {
	public void registerAccount();
	public void requestBook();

}
class KidUser implements LibraryUser{
	private int age;
	private String bookType;
	
	public int getAge() {		
		return age;
	}
	public void setAge(int age) {		
		this.age=age;
  }
	public String getBookType() {		
		return bookType;
	}
	public void setBookType(String bookType) {		
		this.bookType=bookType;
  }
	
	public void registerAccount() {
		if (getAge() < 12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	
	public void requestBook() {
		if (getBookType()=="Kids") {
			System.out.println("Book Issued successfully, please return the book within 10 day");
		} 
		else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
	
}

class AdultUser implements LibraryUser{
	private int age;
	private String bookType;
	
	public int getAge() {		
		return age;
	}
	public void setAge(int age) {		
		this.age=age;
  }
	public String getBookType() {		
		return bookType;
	}
	public void setBookType(String bookType) {		
		this.bookType=bookType;
  }
	
	public void registerAccount() {
		if (getAge() > 12) {
			System.out.println("You have successfully registered under an Adult Account");
		}
		else {
			System.out.println("Sorry, Age must be greater than 12 to register as an Adult");
		}
	}
	
	public void requestBook() {
		if (getBookType()=="Fiction") {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		} 
		else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
	
}


 




