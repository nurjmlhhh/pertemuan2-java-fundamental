package com.project.application;

//regular class
public class Buku {

    private String judul;
    int tahunTerbit;

    Buku(String judul, int tahunTerbit){
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        System.out.println("Buku yang berjudul " + judul + " diterbitkan tahun " + tahunTerbit);
    }

    Buku (String penulis ){
        System.out.println("Penulis buku ini adalah " + penulis);
    }

    //Constructor tanpa parameter
    Buku(){
        System.out.println("Ini adalah constructor");
    }
    public static void main(String[] args) {
        
        // Main a = new Main();
        // Buku a= new Buku();
        // Buku b = new Buku("Tisatun");
        Buku c = new Buku("Hujan", 2013);
        // System.out.println(c.judul);

        InnerBuku d = c.new InnerBuku();
        d.tampil();
    }

   
    class InnerBuku{
        void tampil(){
            Buku myBook = new Buku("Pulang", 2014);
            System.out.println(myBook.judul);
        }
    }
    
}






