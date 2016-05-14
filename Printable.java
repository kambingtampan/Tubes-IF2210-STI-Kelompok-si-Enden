public interface Printable {
	//Atribut
	
	//Konstruktor
	
	//Getter
	
	//Setter
	
	//Method
	default void prt(String s) {
		System.out.print(s);
	}
	default void prtln(String s) {
		System.out.println(s);
	}
}