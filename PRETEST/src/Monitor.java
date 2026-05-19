public class Monitor {
    private String merek;

    public Monitor(String merek) {
        this.merek = merek;
    }

    public String getMerek() { return merek; }

    public void tampilkanInfo() {
        System.out.println("  Monitor: " + merek);
    }
}