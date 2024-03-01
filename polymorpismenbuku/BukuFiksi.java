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
public class BukuFiksi extends Buku {
    private String genre;
    
    BukuFiksi(String judul, String penulis, String genre){
        super (judul,penulis);
        this.genre=genre;
        
    }
    void tampilInfo(){
        super.tampilkanInfo();
        System.out.println("Genre:"+genre);
        
    }
    
}
