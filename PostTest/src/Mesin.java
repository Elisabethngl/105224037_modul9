public class Mesin {
    private String tipePiston;
    private int kapasitasCC;

    public Mesin(String tipePiston, int kapasitasCC) {
        this.tipePiston = tipePiston;
        this.kapasitasCC = kapasitasCC;
    }

    public void infoMesin() {
        System.out.println("Mesin: " + tipePiston + " (" + kapasitasCC + " CC)");
    }
}