public class MataKuliahMain16 {
    public static void main(String[] args) {
        MataKuliah16 Matkul1 = new MataKuliah16();
        Matkul1.nama = "Algoritma dan Struktur Data";
        Matkul1.kodeMk = "SIB252004";
        Matkul1.sks = 2;
        Matkul1.jumlahJam = 3;

        Matkul1.tampilkanInformasi();
        Matkul1.ubahSKS(3);
        Matkul1.tambahJam(4);
        Matkul1.kurangiJam(2);

        MataKuliah16 Matkul2 = new MataKuliah16("Basis Data", "SIB252006", 2, 6);
        Matkul2.ubahSKS(3);
        Matkul2.tampilkanInformasi();

    }

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
            System.out.println("Jumlah jam Mata Kuliah " + nama + " berhasil dikurangi " + jam + " jam. Jumlah jam baru: "
                    + jumlahJam + " jam");
        }
    }
}
