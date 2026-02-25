***Percobaan 1***
1. Sebutkan dua karakteristik class atau object!
2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki 
   oleh class Mahasiswa? Sebutkan apa saja atributnya!
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method 
   tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0". 
5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,  
   kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
6. Commit dan push kode program ke Github

***Jawaban Percobaan 1***
1. Atribut = data yang dimiliki oleh object atau class (biasanya diikuti dengan kata benda).
   Method = proses, tingkah laku, atau fungsi yang bisa dilakukan oleh object (ditandai dengan kata kerja).
2. Atribut yang dimiliki oleh class mahasiswa tersebut ada 4, yaitu : nim, nama, kelas, ipk.
3. Method yang dimiliki oleh class tersebut ada 4, yaitu : 
   - tampilkanInformasi()
   - ubahKelas(KelasBaru:String)
   - updateIpk(ipkBaru:double)
   - nilaiKinerja(ipk:double)
4. Sudah di modifikasi.
5. Method nilaiKinerja() bekerja dalam mengevaluasi nilai IPK menggunakan pemilihan if-else. Lalu 
   kriteria yang digunakan untuk menentukan nilai kinerja adalah rentang IPK, terbagi dalam beberapa batas nilai, seperti : ipk >= 3.5, ipk >= 3.0, dan ipk >= 2.0.
   Method akan mengembalikan (return) nilai berupa String yang menyatakan kategori kinerja mahasiswa, yaitu "Kinerja sangat baik", "Kinerja baik", "Kinerja cukup", "Kinerja kurang".

***Percobaan 2***
1.	Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! 
   Apa nama object yang dihasilkan?
2.	Bagaimana cara mengakses atribut dan method dari suatu objek?
3.	Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?

***Jawaban Percobaan 2***
1. Baris kode yang melakukan instansiasi adalah : Mahasiswa16 mhs1 = new Mahasiswa16();
   nama objek yang dihasilkan adalah "mhs1".
2. cara mengakses atribut = namaObject.namaAtribut = nilai;
   cara mengakses method = namaObject.namaMethod();
3. Karena di antara pemanggilan tampilkanInformasi() pertama dan kedua terdapat dua method yang 
   mengubah nilai atribut object mhs1, yaitu : 
   - mhs1.ubahKelas("SI 2K"); -> mengubah kelas dari "SI 2J" ke "SI 2K"
   - mhs1.updateIPK(3.60);    -> mengubah ipk dari "3.55" ke "3.60"

***Percobaan 3***
1.	Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk 
   mendeklarasikan konstruktor berparameter!
2.	Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut? 
3.	Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program. Bagaimana 
   hasilnya? Jelaskan mengapa hasilnya demikian!
4.	Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara 
   berurutan? Jelaskan alasannya!
5.	Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor berparameter dari class 
   Mahasiswa!
6.	Commit dan push kode program ke Github

***Jawaban Percobaan 3***
1. baris kode program dibawah ini :
   public Mahasiswa16(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
2. Baris kode tersebut melakukan Instansiasi Object dengan konstrktor berparameter.
   - Mahasiswa16 mhs2 mendeklarasikan variabel referensi bernama mhs2 bertipe class Mahasiswa16.
   - new Mahasiswa16(...) membuat object baru dari class Mahasiswa di memori menggunakan 
     keyword new, sekaligus memanggil konstruktor berparameter.
     intinya baris ini membuat object mhs2 dari class Mahasiswa16 sekaligus menginisialisasi seluruh atributnya dalam satu baris, tanpa perlu mengisi atribut satu per satu.
3. Hailnya akan error. Jika konstruktor default dihapus, maka class Mahasiswa16 hanya memiliki 
   konstruktor berparameter, sehingga pemanggilan new Mahasiswa16() tidak menemukan konstruktor yang cocok dan menyebabkan compile error.
4. Tidak, method di dalam class Mahasiswa tidak harus di akses secara berurutan. Karena method dalam 
   sebuah class itu bersifat independen dan dapat dipanggil kapan saja, asalkan object sudah diinstansiasi. Namun perlu diperhatikan logika dan urutan operasi agar hasil output sesuai dengan yang diharapkan.
5. sudah.