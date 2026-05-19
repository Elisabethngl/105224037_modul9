public class Dokter {
    private String nama;
    private String spesialisasi;

    public Dokter(String nama, String spesialisasi) {
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public String getNama() {
        return nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    // Metode Interaksi (Asosiasi)
    public void periksaPasien(Pasien pasien) {
        System.out.println("Nama Dokter Bertugas : " + this.nama);
        System.out.println("Spesialisasi Dokter  : " + this.spesialisasi);
        System.out.println("Nama Pasien Ditangani: " + pasien.getNama());
        System.out.println("Umur Pasien          : " + pasien.getUmur() + " tahun");
    }
}