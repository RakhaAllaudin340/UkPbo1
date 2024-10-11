// Kelas Induk 1
class Kendaraan {
    private String merek;
    private int tahunProduksi;

    public Kendaraan(String merek, int tahunProduksi) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public void info() {
        System.out.println("Merek: " + merek + ", Tahun Produksi: " + tahunProduksi);
    }
}

// Kelas Induk 2
class AlatTransportasi {
    private int kapasitas;

    public AlatTransportasi(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void info() {
        System.out.println("Kapasitas: " + kapasitas);
    }
}

// Kelas Anak 1
class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merek, int tahunProduksi, int jumlahPintu) {
        super(merek, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

// Kelas Anak 2
class Sepeda extends Kendaraan {
    private boolean adaRem;

    public Sepeda(String merek, int tahunProduksi, boolean adaRem) {
        super(merek, tahunProduksi);
        this.adaRem = adaRem;
    }

    public boolean isAdaRem() {
        return adaRem;
    }

    public void setAdaRem(boolean adaRem) {
        this.adaRem = adaRem;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Ada Rem: " + (adaRem ? "Ya" : "Tidak"));
    }
}

// Kelas Anak 3
class Bus extends AlatTransportasi {
    private String tujuan;

    public Bus(int kapasitas, String tujuan) {
        super(kapasitas);
        this.tujuan = tujuan;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Tujuan: " + tujuan);
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 2020, 4);
        Sepeda sepeda = new Sepeda("Giant", 2019, true);
        Bus bus = new Bus(50, "Jakarta");

        mobil.info();
        System.out.println();
        sepeda.info();
        System.out.println();
        bus.info();
    }
}
