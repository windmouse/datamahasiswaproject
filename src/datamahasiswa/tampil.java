package datamahasiswa;

public class tampil extends Main {
    //METHOD TAMPIL DATA
    static void tampil() {

        for (int i = 0; i < list_nim.size(); i++) {
                System.out.println("NIM           : " + list_nim.get(i));
                System.out.println("Nama          : " + list_nama.get(i));
                System.out.println("Tanggal Lahir : " + list_tglLahir.get(i));
                System.out.println("Gender        : " + list_gender.get(i));
                System.out.println("");
        }
        System.out.println("");
        menu();
    }
}