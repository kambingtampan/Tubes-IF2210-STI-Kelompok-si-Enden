//Masih belum, dibuat cuma untuk membantu instansiasi inventori pemain
public class Inventori<T> {
	private boolean status;
	private T bag[];
   
	public Inventori (T bag[], T isi){
	   int i;
	   
	   T bag[i]=isi;
	   i++;
	}  
	
   abstract void aksi();
}
