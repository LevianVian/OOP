package Jobsheet2;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        
        m1.displayBiodata();


        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023433";
        m2.nama = "Haikal Maghsin";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "TI-2D";
        
        m2.displayBiodata();

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023434";
        m3.nama = "Levian Arta";
        m3.alamat = "Pasuruan, Jawa Timur";
        m3.kelas = "2G";
        
        m3.displayBiodata();
    }
}