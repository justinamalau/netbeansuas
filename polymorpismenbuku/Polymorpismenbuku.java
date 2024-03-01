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
public class Polymorpismenbuku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buku buku1 = new BukuFiksi("Harry Potter", "J.K.Rowling","Fantasy");
        Buku buku2 = new BukuNonFiksi("Sapiens", "Yuval Noah Harari","History");
        Buku buku3 = new BukuReferensi("Java Programming", "John Doe","Programming");
        
        buku1.tampilkanInfo();
        System.out.println("============");
        buku2.tampilkanInfo();
        System.out.println("============");
        buku3.tampilkanInfo();
    
    }
    
}
