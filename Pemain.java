public class Pemain implements Moveable, Printable{
	//Atribut
	private static String nama;
	private static int gold;
	private static Koordinat posisi;
	private static Inventori[] tas;

	//Konstruktor
	public Pemain(String nama) {
		this.nama = nama;
		gold = 100;
		posisi = new Koordinat();
		tas = new Inventori[12];
	}
	public Pemain(String nama, int gold, Koordinat posisi, Inventori[] tas) {
		this.nama = nama;
		this.gold = gold;
		this.posisi = posisi;
		this.tas = tas;
	}

	//Getter
	public String getNama() {
		return nama;
	}
	public int getGold() {
		return gold;
	}
	public Koordinat getPosisi() {
		return posisi;
	}
	public Inventori[] getTas() {
		return tas;
	}

	//Setter
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public void setPosisi(Koordinat posisi) {
		this.posisi = posisi;
	}
	public void setTas(Inventori[] tas) {
		this.tas = tas;
	}

	//Method
	public void cetakPosisi() {
		prtln("Posisi pemain adalah " + posisi);
	}
		public boolean isCollide() {
		//Fungsi untuk mengecek apakah posisi player berhimpitan dengan objek lain
		return false;
	}
	
	//Nested Class
	public class Interaksi {
		//Atribut
		
		//Konstruktor
		
		//Getter
		
		//Setter
		
		//Method
		public void bukaPintu() {
			if(posisi.getArah() == Orientasi.ATAS) {
				posisi.setY(posisi.getY() - 2);
			}
			if(posisi.getArah() == Orientasi.KANAN) {
				posisi.setX(posisi.getX() + 2);
			}
			if(posisi.getArah() == Orientasi.BAWAH) {
				posisi.setY(posisi.getY() + 2);
			}
			if(posisi.getArah() == Orientasi.KIRI) {
				posisi.setX(posisi.getX() - 2);
			}
		}
		public void dropItem() {
			//Prosedur untuk menjatuhkan item. Menjatuhkan item selain ke bin akan sama efeknya dengan menghapus item tersebut.
		}
		public void isiMakanan() {
			//Prosedur untuk mengisi makanan di kotak makanan hewan
		}
		public void panen() {
			//Prosedur untuk memanen tanaman, telor ayam, susu sapi, dan bulu domba
		}
		public void tidur() {
			//Prosedur untuk melanjutkan ke hari selanjutnya
		}
		public void save() {
			//Prosedur untuk mengesave keadaan permainan. Bisa jadi pindah ke kelas lain
		}
		public void beliBarang() {
			//Prosedur untuk membeli barang dari rumah
		}
		public void cangkul() {
			//Prosedur untuk mengubah lahan menjadi lahan siap tanam
		}
		public void siram() {
			//Prosedur untuk menyiram tanaman
		}
		public void tanam() {
			//Prosedur untuk menanam tanaman
		}
	}
}

/*
	public void movePemain(char masukan) {
		if(masukan == 'w') {
			if(posisi.getArah() == Orientasi.ATAS) {
				if(posisi.getY() != 0) {	//Nanti diganti sama !isCollide() atau apa gitu buat nyari tau pemain bentrok ama objek lain atau gak
					posisi.setY(posisi.getY() - 1);
				} else {
					System.out.println("Anda tidak dapat bergerak ke atas");
				}
			} else {
				posisi.setArah(Orientasi.ATAS);
			}
		}
		if(masukan == 'd') {
			if(posisi.getArah() == Orientasi.KANAN) {
				if(posisi.getX() != 20) {	//Nanti diganti sama !isCollide() atau apa gitu buat nyari tau pemain bentrok ama objek lain atau gak
					posisi.setX(posisi.getX() + 1);
				} else {
					System.out.println("Anda tidak dapat bergerak ke kanan");
				}
			} else {
				posisi.setArah(Orientasi.KANAN);
			}
		}
		if(masukan == 's') {
			if(posisi.getArah() == Orientasi.BAWAH) {
				if(posisi.getY() != 20) {	//Nanti diganti sama !isCollide() atau apa gitu buat nyari tau pemain bentrok ama objek lain atau gak
					posisi.setY(posisi.getY() + 1);
				} else {
					System.out.println("Anda tidak dapat bergerak ke bawah");
				}
			} else {
				posisi.setArah(Orientasi.BAWAH);
			}
		}
		if(masukan == 'a') {
			if(posisi.getArah() == Orientasi.KIRI) {
				if(posisi.getX() != 0) {	//Nanti diganti sama !isCollide() atau apa gitu buat nyari tau pemain bentrok ama objek lain atau gak
					posisi.setX(posisi.getX() - 1);
				} else {
					System.out.println("Anda tidak dapat bergerak ke kiri");
				}
			} else {
				posisi.setArah(Orientasi.KIRI);
			}
		}
	}

*/