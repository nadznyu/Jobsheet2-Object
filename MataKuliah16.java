public class MataKuliah16 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Kode Mata Kuliah: " + kodeMk);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah jam Mata Kuliah: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan tidak dapat dilakukan");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam Mata Kuliah " + nama + "berhasil dikurangi" + jam + "jam. Jumlah jam baru: "
                    + jumlahJam + "jam");
        }
    }
}
