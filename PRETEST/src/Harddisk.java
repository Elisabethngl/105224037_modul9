// Harddisk.java
public class Harddisk {
    private String kapasitas;

    public Harddisk(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getKapasitas() { return kapasitas; }

    public void tampilkanInfo() {
        System.out.println("  Harddisk: " + kapasitas);
    }
}