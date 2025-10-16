import java.util.Scanner;
public class CaseMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("NIM  : ");
        String nim = input.nextLine();

        // Mata kuliah 1
        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        double NilaiUTS1 = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double NilaiUAS1 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double NilaiTugas1 = input.nextDouble();

        // Mata kuliah 2
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        double NilaiUTS2 = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double NilaiUAS2 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double NilaiTugas2 = input.nextDouble();

        // Menghitung nilai akhir tiap mata kuliah
        double NilaiAkhir1 = (NilaiUTS1 * 0.3) + (NilaiUAS1 * 0.4) + (NilaiTugas1 * 0.3);
        double NilaiAkhir2 = (NilaiUTS2 * 0.3) + (NilaiUAS2 * 0.4) + (NilaiTugas2 * 0.3);

        // Menghitung rata-rata nilai akhir
        double rataRata = (NilaiAkhir1 + NilaiAkhir2) / 2;

        // Menentukan nilai huruf
        String NilaiHuruf1 = NilaiHuruf(NilaiAkhir1);
        String NilaiHuruf2 = NilaiHuruf(NilaiAkhir2);

        // Menentukan status lulus tiap mata kuliah
        String Status1 = (NilaiAkhir1 >= 60) ? "LULUS" : "TIDAK LULUS";
        String Status2 = (NilaiAkhir2 >= 60) ? "LULUS" : "TIDAK LULUS";

        // Menentukan status semester
        String statusSemester = (rataRata >= 70) ? "LULUS" : "TIDAK LULUS (Rata-rata < 70)";

        // Output hasil
        System.out.println("\n==================== HASIL PENILAIAN AKADEMIK ====================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Mata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n",
                NilaiUTS1, NilaiUAS1, NilaiTugas1, NilaiAkhir1, NilaiHuruf1, Status1);
        System.out.printf("Struktur Data\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n",
                NilaiUTS2, NilaiUAS2, NilaiTugas2, NilaiAkhir2, NilaiHuruf2, Status2);
        System.out.println();
        System.out.printf("Rata-rata Nilai Akhir: %.2f\n", rataRata);
        System.out.println("Status Semester      : " + statusSemester);
    }

    // Fungsi untuk menentukan nilai huruf
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