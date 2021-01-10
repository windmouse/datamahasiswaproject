package datamahasiswa;

public class hapus extends Main {
    //METHOD HAPUS DATA
    static void hapus() {
        
        System.out.println("Masukan nim yang akan dihapus");
        String y = input.next();
        int i = list_nim.indexOf(y); //METHOD UNTUK MENCARI INDEX DARI DATA
        
        list_nim.remove(i); list_nama.remove(i); list_tglLahir.remove(i); list_gender.remove(i);
        
        System.out.println("\nMasukan lagi? [y/n]");
        String again = input.next();
            
            if (again.equalsIgnoreCase("y")) {
                hapus();
            } else {
                menu();
            }
    }
}