/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorpismenbuku;

/**
 *
 * @author lgn
 */
public class BukuNonFiksi extends Buku {
    private String subjek;
    
    BukuNonFiksi(String judul, String penulis, String subjek){
        super(judul, penulis);
        this.subjek=subjek;
    }
    void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Subjek:"+subjek);
    }
    
}
