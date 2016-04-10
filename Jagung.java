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
public class Jagung extends Tanaman {
    
    private String nama;
    private int waktuGantiFase;
    private Fase fase;
    
    public Jagung(String nama, String jenis, Koordinat posisi ){
        super(nama,jenis, posisi);
        waktuGantiFase = 2;
    }
}
