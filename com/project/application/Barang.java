package com.project.application;
import com.project.models.Laptop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Barang {
    
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Scanner input = new Scanner(System.in);

        // System.out.print("Input merk : ");
        // laptop.setMerk(input.nextLine());

        // // System.out.println(laptop.getMerk());

        // System.out.print("Input harga : ");
        // laptop.setHarga(input.nextInt());
        // System.out.println(laptop.getHarga());

        // System.out.println("Merk laptop " + laptop.getMerk() + " dengan harga Rp " + 
        //                     laptop.getHarga());

        // ArrayList <String> listLaptop = new ArrayList<>();
        // System.out.print("Input Laptop : ");
        // listLaptop.add(input.nextLine());
        // // listLaptop.set(0, "Asus");
        // // listLaptop.remove(0);
        // System.out.println(listLaptop.get(0));
        // listLaptop.add("ACER");
        // listLaptop.add("ADVAN");

        // System.out.println("Berikut list laptop yang tersedia : " + listLaptop);

        HashMap <Integer, String> hash = new HashMap<>();
        hash.put(1,"Hilwa");
        hash.put(2,"Tisatun");
        hash.put(3,"Arya");
        // hash.put(4,"Siti");
        hash.replace(1, "Fadly");

        HashMap <String, String> hash3 = new HashMap<>();
        hash3.put("nim", "Pitry");
        hash3.remove("nim");

        // hash.remove(1);
        // hash.clear();

        @SuppressWarnings("unchecked")
        HashMap <Integer, String> hash2 = (HashMap <Integer, String>) hash.clone();
        System.out.print("Input key : ");
        Integer key = input.nextInt();
        input.nextLine();
        System.out.print("Input value : ");
        String value = input.nextLine();
        hash2.put(key, value);
        System.out.println("Hasil clone HashMap : " + hash2);
        hash2.put(5,"Hanif");
        System.out.println("Hasil hash terbaru : " + hash2);
        System.out.println("Hasil ukuran hash : " + hash2.size());
        



        

        
    }
}
