public class KomputerServer {
    private String namaServer;
    private Harddisk harddisk;
    private Monitor[] monitors;

    public KomputerServer(String namaServer, Harddisk harddisk,
    Monitor[] monitors) {
        this.namaServer = namaServer;
        this.harddisk   = harddisk;
        this.monitors   = monitors;
    }

    public void tampilkanInfo() {
        System.out.println("Server : " + namaServer);
        harddisk.tampilkanInfo();
        System.out.println("  Jumlah Monitor: " + monitors.length);
        for (Monitor m : monitors) {
            m.tampilkanInfo();
        }
    }
}

/*
-Komposisi terjadi antara KomputerServer dan Harddisk,
karena harddisk dibuat di dalam server dan kalau server dihancurkan maka harddisk ikut hancur juga.
-Agregasi terjadi antara KomputerServer dan Monitor,
karena monitor dibuat di luar server dan bisa eksis sendiri meskipun server dihancurkan.
-Asosiasi terjadi antara Main dan KomputerServer,
karena Main menggunakan objek server hanya untuk memanggil method tampilkanInfo() tanpa memilikinya secara permanen.
*/