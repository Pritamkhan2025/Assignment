package library;

public class LibraryInterfaceDemo {
	
	KidUser k=new KidUser();
	AdultUser a=new AdultUser();
	
	
	public void main(String args[]) {
		Testcase1();
		Testcase2();
		
	}
	 

	void Testcase1() {
		
		
		k.setAge(10);
		k.registerAccount();
		k.setAge(18);
		k.registerAccount();
		k.setBookType("Kids");
		k.requestBook();
		k.setBookType("Fiction");
		k.requestBook();

		
	}
	
	void Testcase2(){
		
		a.setAge(5);
		a.registerAccount();
		a.setAge(23);
		a.registerAccount();
		a.setBookType("Kids");
		a.requestBook();
		a.setBookType("Fiction");
		a.requestBook();

	}
	

}
