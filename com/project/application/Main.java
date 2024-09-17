//STRUKTUR JAVA
//pembuatan package/folder (com/namaLembaga/namaproject)
package com.project.application; //package yang disesuaikan dengan domain project yang dibuat, misal youtube.com, maka pembuatan package/foldernya dibalik menjadi com.youtube

import java.util.Scanner; //library yang diambil disesuaikan dengan fungsi/kode yang digunakan.
//Misalkan library java.util, util (utility) adalah library yang digunakan untuk memproses/memanipulasi data
//Masih banyak library yang digunakan di java, tergantung fungsi yang ingin kita gunakan

public class Main {  //Karena java menggunakan OOP, yang maksudnya adalh semua kode harus dibungkus dengan class/object. Maka disini pembungkusnya adalah class Main

    //contoh pembuatan method
    static void greeting() {
        System.out.println("Good Night");
    }

    void greet2() {
        System.out.println("Hello guys");
    }

     String luasPersegi(int sisi) {
        return "Luas Persegi adalah " + sisi * sisi;
    }

    public static void main(String[] args) {//method main adalah method yang pertama kali dijalankan
        // System.out.println("Hello World!");

        //cara memanggil method
        greeting();

        //instansiasi (digunakan ketika tidak menggunakan static di menthod)
        Main a = new Main();
        //cara memanggil method dengan instansiasi
        a.greet2();

        Scanner input = new Scanner(System.in);
        Main j = new Main();
        System.out.print("Masukkan sisi : ");
        int angka = input.nextInt();
        System.out.println(j.luasPersegi(angka));

        System.out.println(j.luasPersegi(5));

        for (int i = 1; i < 10; i++) {
            System.out.print(i + ",");
        }

        //perulangan foreach
        int[] number = { 12, 27, 90, 1 };
        for (int i : number) {
            System.out.print(i + ",");
        }

        String nama, password;
        System.out.println("\n1. Login\n" + "2. Menghitung luas persegi");
        System.out.print("Input pilihan : ");
        int pilih = input.nextInt();
        input.nextLine();
        boolean c = true;
        if (pilih == 1) {
            while (c) {

                System.out.print("Input nama : ");
                nama = input.nextLine();
                System.out.print("Input password : ");
                password = input.nextLine();

                if (nama.equalsIgnoreCase("nur") && password.equalsIgnoreCase("123")) {
                    greeting();
                    c = false;
                } else {
                    System.out.println("nama/passwod salah, silahkan input lagi");
                }
            }
        } else if (pilih == 2) {
            System.out.print("Input sisi : ");
            System.out.println(j.luasPersegi(input.nextInt()));
        }

        System.out.println("\n1. Login\n" + "2. Menghitung luas persegi");
        System.out.print("Input pilihan : ");
        int pilih2 = input.nextInt();
        input.nextLine();
        boolean i = true;
        switch (pilih2) {
            case 1:
                while (i) {

                    System.out.print("Input nama : ");
                    nama = input.nextLine();
                    System.out.print("Input password : ");
                    password = input.nextLine();
                    String napas = nama + ":" + password;
                    switch (napas) {
                        case "nur:123":
                            greeting();
                            i = false;
                            break;

                        default:
                            System.out.println("nama/passwod salah, silahkan input lagi");
                            break;
                    }
                }
                break;
            case 2:
                System.out.print("Input sisi : ");
                System.out.println(j.luasPersegi(input.nextInt()));
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        //digunakan untuk menutup inpuutan (Scanner)
        input.close();
        penutup();

    }

    static void penutup(){
        System.out.println("Ini adalah materi pertemuan 2 java, terimakasih sudah hadir");
    }

}