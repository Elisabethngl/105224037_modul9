public class Ruangan {
    private String noRegistrasi;
    private int kapasitasMaks;

    public Ruangan(String noRegistrasi, int kapasitasMaks) {
        this.noRegistrasi = noRegistrasi;
        this.kapasitasMaks = kapasitasMaks;
    }

    public void infoRuangan() {
        System.out.println("- Ruang: " + noRegistrasi + " | Kapasitas Maks: " + kapasitasMaks + " pasien");
    }
}