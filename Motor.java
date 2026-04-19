public class Motor {
    // Atribut
    private String warna;
    private String merk;

    // Constructor
    public Motor(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
    }

    // Metode
    public void tampilkanInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Merk: " + merk);
    }

    // Tambahan: Method main untuk menjalankan kodenya
    public static void main(String[] args) {
        Motor motorBaru = new Motor("Hitam", "Honda");
        motorBaru.tampilkanInfo();
    }
}