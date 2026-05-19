public class Mobil {
    private String merk;
    private String warna;
    private Mesin komponenMesin; 
    private Ban[] daftarBan; 

    public Mobil(String merk, String warna, String tipePiston, int kapasitasCC) {
        this.merk = merk;
        this.warna = warna;
        this.daftarBan = new Ban[4]; 
        this.komponenMesin = new Mesin(tipePiston, kapasitasCC);
    }

    public String getMerk() {
        return merk;
    }

    public void pasangSetBan(Ban[] setBan) {
        if (setBan.length <= 4) {
            this.daftarBan = setBan;
            System.out.println("[Sistem] 4 Ban mandiri berhasil dipasang ke " + merk);
        } else {
            System.out.println("[Sistem] Kapasitas ban melebihi batas!");
        }
    }

    public void tampilkanSpesifikasi() {
        System.out.println("Spesifikasi Mobil: " + merk + " (" + warna + ") ");
        komponenMesin.infoMesin();
        System.out.println("- Daftar Ban yang Terpasang:");
        for (int i = 0; i < daftarBan.length; i++) {
            if (daftarBan[i] != null) {
                System.out.println("  Ban " + (i + 1) + ": " + daftarBan[i].getSpesifikasi());
            }
        }
    }
}