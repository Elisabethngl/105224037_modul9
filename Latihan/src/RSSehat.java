public class RSSehat {

    private String namaRS;
    private Ruangan[] daftarRuangan;
    
    private Dokter[] daftarDokter;
    private int jumlahDokter;

    public RSSehat(String namaRS) {
        this.namaRS = namaRS;
        this.jumlahDokter = 0;
        this.daftarDokter = new Dokter[10];

        this.daftarRuangan = new Ruangan[2];
        this.daftarRuangan[0] = new Ruangan("R-01", 15);
        this.daftarRuangan[1] = new Ruangan("R-02", 20);
    }

    public void tambahDokter(Dokter dokter) {
        if (jumlahDokter < daftarDokter.length) {
            daftarDokter[jumlahDokter] = dokter;
            jumlahDokter++;
        } else {
            System.out.println("Kapasitas penugasan dokter di RS ini sudah penuh.");
        }
    }
    public void cetakDaftarRuangan() {
        for (Ruangan r : daftarRuangan) {
            if (r != null) r.infoRuangan();
        }
    }

    public void cetakDaftarDokter() {
        if (jumlahDokter == 0) {
            System.out.println("(Tidak ada dokter yang bertugas)");
        } else {
            for (int i = 0; i < jumlahDokter; i++) {
                System.out.println("- Dr. " + daftarDokter[i].getNama() + " [" + daftarDokter[i].getSpesialisasi() + "]");
            }
        }
    }
}