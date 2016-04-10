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
public class Hewan {
    private String nama;
    private Koordinat posisi;
    private boolean status;
    private String jenis;
    
    public Hewan (String nama, Koordinat posisi, int status, String jenis){
        this.nama=nama;
        posisi = new Koordinat(posisi);
        status = 0;
        this.jenis=jenis;
    }
    
    public void beriMakanHewan(){
        status = true;
        System.out.println("Hewan sudah diberi makan");
    }
}
