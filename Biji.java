public class Biji extends Tools{
	private int jumlah;
	private String jenis;
	
	public Biji(String s, String jenis){
		super(s);
		this.jenis = jenis;
		this.jumlah = 5;
	}
	
	public void pakai(){
		jumlah--;
	}
	
	public int getJumlah(){
		return this.jumlah;
	}
}
