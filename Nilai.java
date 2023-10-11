public class Nilai {
    float NIM, NilaiAbsen, NilaiTugas, NilaiUTS, NilaiAkhir;
    String Nama;

    static void Nilai() {
        System.out.println();
    }
    static void CetakNilai() {
        System.out.println();
    }
}

class DemoNilai {
    public static void main(String[] args) {
        Nilai nilaidemo = new Nilai();

        nilaidemo.Nama = "Muhammad Ardho Rantisy";
        nilaidemo.NIM = 2210631170082F;
        nilaidemo.NilaiAbsen = 100;
        nilaidemo.NilaiTugas = 100;
        nilaidemo.NilaiUTS = 100;
        nilaidemo.NilaiAkhir = 100;

        System.out.println("Nama: " + nilaidemo.Nama);
        System.out.println("NPM: " + nilaidemo.NIM);
        System.out.println("Nilai Absen: " + nilaidemo.NilaiAbsen);
        System.out.println("Nilai Tugas: " + nilaidemo.NilaiTugas);
        System.out.println("Nilai UTS: " + nilaidemo.NilaiUTS);
        System.out.println("Nilai Akhir: " + nilaidemo.NilaiAkhir);
    }
}
