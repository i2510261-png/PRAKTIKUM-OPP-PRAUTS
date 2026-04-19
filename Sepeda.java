public class Sepeda {
    // Atribut
    private String merk;
    private int kecepatan;

    // Constructor (Menggunakan parameter merk dan kecepatan)
    public Sepeda(String merk, int kecepatan) {
        this.merk = merk;
        this.kecepatan = kecepatan;
    }

    // Metode untuk mengubah kecepatan (Parameter: kecepatanBaru)
    public void ubahKecepatan(int kecepatanBaru) {
        this.kecepatan = kecepatanBaru;
    }

    // Metode untuk menampilkan info
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}