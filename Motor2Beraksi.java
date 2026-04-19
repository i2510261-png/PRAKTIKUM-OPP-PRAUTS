public class Motor2Beraksi {
    public static void main(String[] args) {
        // Membuat objek baru dari class Motor2
        Motor2 motor = new Motor2("Hitam", "Yamaha");
        
        // Menampilkan info pertama
        motor.tampilkanInfo();
        
        // Mengubah warna dan merk menggunakan metode set (Setter)
        motor.setWarna("Biru");
        motor.setMerk("Suzuki");
        
        // Menampilkan info setelah diubah
        motor.tampilkanInfo();
    }
}