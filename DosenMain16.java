public class DosenMain16 {
    public static void main(String[] args) {
        Dosen16 dosen1 = new Dosen16();
        dosen1.nama = "Jessica";
        dosen1.idDosen = "26142390";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2007;
        dosen1.bidangKeahlian = "Bahasa Inggris";
        dosen1.tampilkanInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");

        Dosen16 dosen2 = new Dosen16("William", "3514298", true, 2004, "Pancasila");
        dosen2.setStatusAktif(false);
        dosen2.tampilkanInformasi();
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2023) + " tahun");
    }

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("Nama Dosen: " + nama);
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Status: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        this.statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
    }

}
