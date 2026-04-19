public class MahasiswaBeraksi {
    public static void main(String[] args) {
        // Ganti Mahasiswa jadi MahasiswaTugas di semua baris ini
        MahasiswaTugas mahasiswa1 = new MahasiswaTugas();
        mahasiswa1.nama = "Ahmad";
        mahasiswa1.nim = "123456";
        mahasiswa1.tampilkanNama();
        mahasiswa1.tampilkanNim();
        mahasiswa1.olahraga();

        MahasiswaTugas mahasiswa2 = new MahasiswaTugas();
        mahasiswa2.nama = "Budi";
        mahasiswa2.nim = "654321";
        mahasiswa2.tampilkanNama();
        mahasiswa2.tampilkanNim();
        mahasiswa2.olahraga();

        MahasiswaTugas mahasiswa3 = new MahasiswaTugas();
        mahasiswa3.nama = "Citra";
        mahasiswa3.nim = "112233";
        mahasiswa3.tampilkanNama();
        mahasiswa3.tampilkanNim();
        mahasiswa3.olahraga();
    }
}