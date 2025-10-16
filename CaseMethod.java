import java.util.Scanner;

public class CaseMethod{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Data Mahasiswa
        System.out.println("===== INPUT DATA =====");
        System.out.println("Nama :");
        String Nama = input.nextLine();
        System.out.println("Nim  :");
        String Nim = input.nextLine();

        // Mata Kuliah 1
        System.out.println("\n --- Mata Kuliah 1: Algoritma dan Pemograman ---");
        System.out.println("Nilai UTS    :");
        double NilaiUTS1 = input.nextDouble();
        System.out.println("Nilai UAS    :");
        double NilaiUAS1 = input.nextDouble();
        System.out.println("Nilai Tugas  :");
        double NilaiTugas1 = input.nextDouble();

        // Mata Kuliah 2
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.println("Nilai UTS");
        double NilaiUTS2 = input.nextDouble();
        System.out.println("Nilai UAS");
        double NilaiUAS2 = input.nextDouble();
        System.out.println("Nilai Tugas");
        double NilaiTugas2 = input.nextDouble();

        // Menghitung Nilai Akhir Tiap Mata Kuliah
        double nilaiAkhir1 = (NilaiUTS1 * 0.3) + (NilaiUAS1 * 0.4) + (NilaiTugas1 * 0.3);
        double nilaiAkhir2 = (NilaiUTS2 * 0.3) + (NilaiUAS2 * 0.4) + (NilaiTugas2 * 0.3);

        // Menghitung rata-rata nilai akhir
        double rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;

        // Menentukan nilai huruf
        String NilaiHuruf1 = NilaiHuruf(nilaiAkhir1);
        String NilaiHuruf2 = NilaiHuruf(nilaiAkhir2);

        // Menentukan status lulus tiap mata kuliah
        String Status1 = (nilaiAkhir1 >= 60) ? "LULUS" : "TIDAK LULUS";
        String Status2 = (nilaiAkhir2 >= 60) ? "LULUS" : "TIDAK LULUS";

        // Menentukan status semester
        String StatusSemester = (rataRata >= 70) ? "LULUS" : "TIDAK LULUS (Rata-rata < 70)";

        // Hasil Output Akhir
        System.out.println("================== HASIL PENILAIAN AKADEMIK ==================");
        System.out.println("Nama  :" + Nama);
        System.out.println("Nim   :" + Nim);
        System.out.println();
        System.out.println("Mata Kuliah\t\tUTS\t\tUAS\t\tTugas\t\tNilai Akhir\t\tNilai Huruf\t\tStatus");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("Algoritma Pemograman\t%.0f\t%.0f\t%.0f\t%.2f\t%s\t%s\n",NilaiUTS1,NilaiUAS1,NilaiTugas1,nilaiAkhir1,NilaiHuruf1,Status1);
        System.out.printf("Struktur Data\t%.0f\t%.0f\t%.0f\t%.2f\t%s\t%s\n",NilaiUTS2,NilaiUAS2,NilaiTugas2,nilaiAkhir2,NilaiHuruf2,Status2);
        System.out.println();
        System.out.printf("Rata-rata Nilai Akhir  :\t%.2\n",rataRata);
        System.out.println("Status Smester         :"+ StatusSemester);
        }
        // Fungsi Untuk Menentukan Nilai Huruf
        static String NilaiHuruf(double nilai) {
            if (nilai >= 85) return "A";
            else if (nilai >= 80) return "A-";
            else if (nilai >= 75) return "B+";
            else if (nilai >= 70) return "B";
            else if (nilai >= 65) return "C+";
            else if (nilai >= 60) return "C";
            else if (nilai >= 50) return "D";
            else return "E";
        
    }
}
