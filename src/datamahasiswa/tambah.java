/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import static datamahasiswa.Main.input;

/**
 *
 * @author User
 */
public class tambah extends Main {
        //METHOD TAMBAH DATA
    static void tambah () {
        
        System.out.print("\nMasukkan NIM: ");
        String nim = input.next();
        list_nim.add(nim);
        
        System.out.print("\nMasukan Nama: ");
        String nama = input.next();
        list_nama.add(nama);
        

        System.out.println("\nMasukkan Tgl Lahir (dd/mm/yyyy): ");
        String day = input.next();
        list_tglLahir.add(day);
        
        
        System.out.print("\n(0:Laki-Laki dan 1:Perempuan) ");
        System.out.print("\nMasukan Gender: ");
        int gender = input.nextInt();
        list_gender.add(gender);
        
        System.out.println("\nMasukan lagi? [y/n]");
            String again = input.next();
            
            if (again.equalsIgnoreCase("y")) {
                tambah();
            } else {
                menu();
            }
    }




}
