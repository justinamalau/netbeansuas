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
public class BukuReferensi extends Buku {
    private String kategori;
    
    BukuReferensi(String judul, String penulis, String kategori){
        super(judul, penulis);
        this.kategori = kategori;
        
    }
    void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Kategori:"+kategori);
    }
    
}
