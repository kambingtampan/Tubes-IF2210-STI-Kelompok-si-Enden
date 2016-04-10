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
public class Koordinat {
	//Atribut
	private int x;
	private int y;
	private Orientasi arah;

	//Konstruktor
	public Koordinat() {
		x = 0;
		y = 0;
		this.arah = Orientasi.BAWAH;
	}
	public Koordinat(int x, int y, Orientasi arah) {
		this.x = x;
		this.y = y;
		this.arah = arah;
	}
	public Koordinat(Koordinat k) {
		x = k.x;
		y = k.y;
		arah = k.arah;
	}
	
	//Getter
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Orientasi getArah() {
		return arah;
	}
	
	//Setter
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setArah(Orientasi arah) {
		this.arah = arah;
	}
}
