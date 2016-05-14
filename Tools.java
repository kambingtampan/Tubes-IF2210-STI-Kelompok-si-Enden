public class Tools{
	private String nama;
	private String status;
	
	public Tools(String s){
		this.nama = s;
		this.status = "Not Equiped";
		}

	public void setNama(String s){
		this.nama = s;
		}
	
	public String getNama(){
		return this.nama;
		}
		
	public String getStatus(){
		return this.status;
		}
	}
