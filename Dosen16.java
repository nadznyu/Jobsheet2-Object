public class Dosen16 {
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

    public Dosen16() {

    }

    public Dosen16(String nm, String idDosen, boolean status, int thn, String bidang) {
        nama = nm;
        this.idDosen = idDosen;
        statusAktif = status;
        tahunBergabung = thn;
        bidangKeahlian = bidang;
    }
}
