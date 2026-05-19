public class Main {
    public static void main(String[] args) {
        System.out.println("--- LANGKAH 1: PRODUKSI BAN MANDIRI ---");
        Ban[] setBanGudang = new Ban[4];
        setBanGudang[0] = new Ban("Bridgestone", 17);
        setBanGudang[1] = new Ban("Bridgestone", 17);
        setBanGudang[2] = new Ban("Bridgestone", 17);
        setBanGudang[3] = new Ban("Bridgestone", 17);
        System.out.println("4 Ban baru telah selesai diproduksi dan disimpan di gudang.");
        System.out.println();

        Mobil mobilSport = new Mobil("Supra MK4", "Putih", "Inline-6 Twin-Turbo", 3000);
        mobilSport.pasangSetBan(setBanGudang);
        mobilSport.tampilkanSpesifikasi();
        System.out.println();

        Montir montirQC = new Montir("MTR-007", "Dimas");
        montirQC.lakukanQualityControl(mobilSport);
        System.out.println();

        mobilSport = null;
        System.out.println("Sistem: Objek 'mobilSport' telah dihancurkan (di-set menjadi null).");
        System.out.println();

        System.out.println("Mengecek sisa komponen di dalam memori gudang pusat:");
        System.out.println("- Status Ban 1 di Gudang: " + setBanGudang[0].getSpesifikasi());
        System.out.println("- Status Ban 2 di Gudang: " + setBanGudang[1].getSpesifikasi());
    }
}