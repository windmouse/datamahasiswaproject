/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;





public class cari extends Main {
    //METHOD CARI DATA
    static void cari()  {

        
            System.out.println("\nOpsi Pencarian :");
            System.out.println("1. NIM");
            System.out.println("2. Gender");
            System.out.println("\nCari Berdasarkan :");
            int pilih = input.nextInt();
            
            if (pilih == 1) {
                nim();
            } else if (pilih == 2) {
                gender();
            }
    }
    
        static void nim(){
        int index = 0;
        boolean found = false;
        System.out.print("\nMasukan NIM: ");
        String nim = input.next();
        
            for (int i = 0; i < list_nim.size(); i++) {
                if (list_nim.get(i).toString().equalsIgnoreCase(nim)) {
                    index = i;
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("NIM           : " + list_nim.get(index));
                System.out.println("Nama Karyawan : " + list_nama.get(index));
                System.out.println("Tanggal Lahir : " + list_tglLahir.get(index));
                System.out.println("Gender        : " + list_gender.get(index));
                System.out.println("");

            } else {
                System.out.println("\nData tidak ditemukan\n");
            }
            menu();
    }    
        
        static void gender () {
        int index = 0;
        boolean found = false;
        
        System.out.print("(0 : Laki-laki, 1 : Perempuan)");
        System.out.print("\nMasukan gender: ");
        int gender = input.nextInt();
        
            for (int i = 0; i < list_gender.size(); i++) {
                if (list_gender.get(i) == gender) {
                    index = i;
                    found = true;
                    break;
                } else {
                }
            }
            if (found) {
                System.out.println("NIM           : " + list_nim.get(index));
                System.out.println("Nama Karyawan : " + list_nama.get(index));
                System.out.println("Tanggal Lahir : " + list_tglLahir.get(index));
                System.out.println("Gender        : " + list_gender.get(index));

            } else {
                System.out.println("\nData tidak ditemukan\n");
            }
            menu();
    }  


}
