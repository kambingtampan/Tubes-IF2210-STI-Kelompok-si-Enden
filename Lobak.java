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
public class Lobak extends Tanaman{
    private String nama;
    private int waktuGantiFase;
    private int waktuTanam;
    private Fase fase;
    
    public Lobak(String nama, String jenis, Koordinat posisi ){
        super(nama, "Lobak", posisi);
    }
    
    public Fase gantiFase(){
        waktuTanam = this.tanamanDiSiram();
        if (waktuTanam == 3){
           this.fase = Fase.KECAMBAH;
        }
        if (waktuTanam == 3){
           this.fase = Fase.TANAMANMUDA;
        }
        if (waktuTanam == 3){
           this.fase = Fase.TANAMANTUA;
        }
        return fase;
    } 
}
