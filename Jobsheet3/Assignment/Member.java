package Jobsheet3.Assignment;

public class Member {
    private String nomorKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Member(String nomorKtp, String nama, int limitPinjaman) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getName() {
        return this.nama;
    }

    public int getLimitLoan() {
        return this.limitPinjaman;
    }

    public int getLoanAmount() {
        return this.jumlahPinjaman;
    }

    public void borrow(int nominal) {
        if (this.jumlahPinjaman + nominal > this.limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            this.jumlahPinjaman += nominal;
        }
    }

    public void installment(int nominal) {
        double batasMinimal = this.jumlahPinjaman * 0.10;
        if (nominal < batasMinimal) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            this.jumlahPinjaman -= nominal;
        }
    }
}