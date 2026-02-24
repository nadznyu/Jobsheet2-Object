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