package Jobsheet3.Assignment;

public class TestKoperasi {
    public static void main(String[] args) {
        Member member1 = new Member("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + member1.getName());
        System.out.println("Limit Pinjaman: " + member1.getLimitLoan());

        System.out.println("\nMeminjam uang 10.000.000...");
        member1.borrow(10000000);
        
        System.out.println("\nMeminjam uang 4.000.000...");
        member1.borrow(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + member1.getLoanAmount());

        System.out.println("\nMembayar angsuran 1.000.000");
        member1.installment(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + member1.getLoanAmount());

        System.out.println("\nMembayar angsuran 3.000.000");
        member1.installment(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + member1.getLoanAmount());
    }
}