import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectedJob;
        String[][] jobs = { // inisialisasi job dan deskripsi yang tersedia
                {
                        "Knight",
                        "Knight adalah pejuang yang ulung dengan kemampuan bertahan yang hebat.\n"
                                + "Dia membawa perisai besar dan pedang berat untuk melindungi diri dan rekan-rekannya dalam pertempuran.",
                },
                {
                        "Mage",
                        "Mage adalah penyihir kuat dengan kemampuan sihir yang luar biasa.\n"
                                + "Dia dapat melempar mantra untuk menghancurkan musuhnya dari jarak jauh.\n"
                                + "Meskipun dia lemah dalam pertempuran fisik, kekuatannya dalam sihir menjadikannya pilihan yang bijaksana dalam tim.",
                },
                {
                        "Archer",
                        "Archer adalah penembak jitu yang sangat terampil. Dia menggunakan busur panjang\n"
                                + "untuk menyerang musuh dari jarak jauh dengan tepat. Kecepatan dan ketepatan adalah kekuatannya dalam pertempuran.",
                },
                {
                        "Berserker",
                        "Berserker adalah pejuang berani yang mengandalkan kekuatan dan kemarahan dalam pertempuran.\n"
                                + "Dia bergerak cepat dan menyerang musuhnya dengan kemarahan yang tak terbendung.\n"
                                + "Meskipun dia kuat dalam serangan, kekurangan pertahanan membuatnya harus berhati-hati dalam pertempuran.",
                }
        };

        System.out.println("Selamat datang di Pemilihan Karakter Fantasy!");
        System.out.println("Berikut adalah pilihan karakter yang tersedia:\n");

        for (int jobIndex = 0; jobIndex < jobs.length; jobIndex++) { // looping daftar job
            System.out.println((jobIndex + 1) + ". " + jobs[jobIndex][0]);
        }

        while (true) {
            System.out.print("\nMasukkan nomor karakter yang Anda pilih (1-" + jobs.length + "): ");
            try {
                selectedJob = scanner.nextInt();
                if (selectedJob > 0 && selectedJob <= jobs.length) {
                    System.out.println("\nAnda memilih karakter " + jobs[selectedJob - 1][0] + "."); // tampilkan jjob yang dipilih user
                    System.out.println(jobs[selectedJob - 1][1]); // tampilkan deskripsi job sesuai job yang dipilih
                    break;
                } else { // handle kondisi jika input <= 0 dan > jumlah job yang disediakan
                    System.out.println("Karakter tidak tersedia, silahkan pilih ulang karakter.");
                }
            } catch (Exception e) {
                System.out.println("Karakter tidak tersedia, silahkan pilih ulang karakter.");
                scanner.next(); // clear buffer scanner
            }
        }

        System.out.println("\nSelamat bermain permainan fantasy dengan karakter " + jobs[selectedJob - 1][0] + " Anda!");
        scanner.close(); // tutup objek scanner
    }
}