
package frontend;

import backend.*;
public class TestBuku {
    public static void main(String[] args) {
        Kategori novel = new Kategori().getById(27);
        Kategori referensi = new Kategori().getById(28);
        
        Buku buku1 = new Buku(novel, "Timun Mas", "Elex", "Bang Supit");
        Buku buku2 = new Buku(referensi, "Metode linier", "Springer", "Alex");
        Buku buku3 = new Buku(novel, "Kukang", "Spear", "Roger");
        
        buku1.save();
        buku2.save();
        buku3.save();
        
        buku2.setJudul("Aljabar Linier");
        buku2.save();
        
        buku3.delete();
        
        for(Buku b : new Buku().getAll()){
            System.out.println("Nama : " + b.getKategori().getNama() + ", ket: " +b.getJudul());
        }
        System.out.println("");
        for(Buku b : new Buku().search("Mas")){
            System.out.println("Nama : " + b.getKategori().getNama() + ", ket: " +b.getJudul());
        }
    }
}
