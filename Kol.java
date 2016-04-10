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
public class Kol extends Tanaman{
    private String nama;
    private int waktuGantiFase;
    private int waktuTanam;
    private Fase fase;
    
    public Kol(String nama, String jenis, Koordinat posisi ){
        super(nama, "Kol", posisi);
    }
    
    public Fase gantiFase(){
        waktuTanam = this.tanamanDiSiram();
        if (waktuTanam == 1){
           this.fase = Fase.KECAMBAH;
        }
        if (waktuTanam == 1){
           this.fase = Fase.TANAMANMUDA;
        }
        if (waktuTanam == 1){
           this.fase = Fase.TANAMANTUA;
        }
        return fase;
    } 
}
