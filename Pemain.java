/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harvestvalley;

/**
 *
 * @author feisal
 */
public class Pemain implements Interaksi {
//Atribut
	private String nama;
	private int gold;
	private Koordinat posisi;

	//Konstruktor
	public Pemain(String nama) {
		this.nama = nama;
		gold = 100;
		posisi = new Koordinat();
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

	//Method
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
        
    public void bukaPintu(){}
    public void memotong(){}
    public void mengelus(){}
    public void memerahSusu(){}
    public void menaruh(){}
    public void melempar(){}
    public void mengambil(){}
    public void menyiram(){}
    public void tidur(){}
}    
