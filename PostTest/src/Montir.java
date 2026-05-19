public class Montir {
    private String idMontir;
    private String nama;

    public Montir(String idMontir, String nama) {
        this.idMontir = idMontir;
        this.nama = nama;
    }

    public void lakukanQualityControl(Mobil m) {
        System.out.println("[QC Inspeksi] Montir " + nama + " (ID: " + idMontir + ") menguji kelayakan mobil " + m.getMerk() + "...");
        System.out.println("[QC Hasil] Mobil " + m.getMerk() + " GAGAL lolos standar kualitas!");
    }
}