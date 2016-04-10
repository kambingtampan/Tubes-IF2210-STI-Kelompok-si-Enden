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
public class Tanaman {
    private String nama;
    private String jenis;
    private boolean status;
    private Koordinat posisi;
    private Fase fase;
    private int siramTanaman;
    
    public Tanaman(String nama,String jenis, Koordinat posisi){
        this.nama = nama;
        this.jenis = jenis;
        posisi = new Koordinat (posisi);
        this.fase = Fase.BIBIT;
        status = false;
    }
}