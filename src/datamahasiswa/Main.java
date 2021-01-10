package datamahasiswa;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //KUMPULAN ARRAYLIST
    static ArrayList<String> list_nim = new ArrayList<String>();
    static ArrayList<String> list_nama = new ArrayList<String>();
    static ArrayList<String> list_tglLahir = new ArrayList<String>();
    static ArrayList<Integer> list_gender = new ArrayList<Integer>();
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)  {
        
        menu();
    }
    //METHOD MENU :
    static void menu() {
        System.out.println("Menu Utama");
        System.out.println("1. Tambah Data");
        System.out.println("2. Lihat Data");
        System.out.println("3. Cari Data");
        System.out.println("4. Hapus Data");
        System.out.println("5. Keluar");
        System.out.println("Pilih nomor: ");
        int index = input.nextInt();
        

        
        switch (index) {
            case 1:
                tambah.tambah();
                break;
            case 2:
                tampil.tampil();
                break;
            case 3:
                cari.cari();
                break;
            case 4:
                hapus.hapus();
            case 5:
                keluar();
                break;
            default:
                menu();
        }
    }
    
    
    
    static void keluar(){
        System.exit(0);
    }

}