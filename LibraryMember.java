public class LibraryMember {

    private Person personalInfo;
    private Member membershipInfo;

    public LibraryMember(Person personalInfo, Member membershipInfo) {
        this.personalInfo = personalInfo;
        this.membershipInfo = membershipInfo;
    }

    public void cetakProfilLengkap() {
        System.out.println("===== PROFIL ANGGOTA =====");
        System.out.println("Nama         : " + personalInfo.getNamaLengkap());
        System.out.println("Jenis Kelamin: " + personalInfo.getJenisKelamin());
        System.out.println("Alamat       : " + personalInfo.getAlamat());
        System.out.println("Telepon      : " + personalInfo.getNomorTelepon());
        System.out.println("Email        : " + personalInfo.getEmail());
        System.out.println("Kode Anggota : " + membershipInfo.getKodeAnggota());
        System.out.println("Tanggal Gabung: " + membershipInfo.getTanggalGabung());
        System.out.println("Status Aktif : " + membershipInfo.isStatusAktif());
        System.out.println("Tingkat      : " + membershipInfo.getTingkatKeanggotaan());
        System.out.println("Buku Dipinjam: " + membershipInfo.getJumlahBukuDipinjam());
        System.out.println("Terlambat    : " + membershipInfo.getJumlahTerlambat());
        System.out.println("Denda        : Rp " + membershipInfo.getJumlahDenda());
        System.out.println("Poin         : " + membershipInfo.getPoinLoyalitas());
        System.out.println("Kode Referal : " + membershipInfo.getKodeReferal());
        System.out.println("Langganan Buletin: " + membershipInfo.isLanggananBuletin());
        System.out.println("Skor Risiko : " + hitungSkorRisiko());
        System.out.println("Layak Upgrade?: " + periksaKelayakanUpgrade());
        System.out.println("===========================");
    }

    public void langgananBuletinPerpustakaan() {
    }

    public void gunakanKodeReferal(String kode) {
    }

    public boolean periksaKelayakanUpgrade() {
        return membershipInfo.getTingkatKeanggotaan().equals("DASAR") && membershipInfo.getPoinLoyalitas() > 100;
    }

    public double hitungSkorRisiko() {
        final double DENDA_TERLAMBAT= 1.5;
        final double DENDA_JUMLAH = 0.1;
        final double DENDA_NONAKTIF = 5.0;
        final double DENDA_MEMBER_BASIC = 2.0;
        final double BONUS_BUKU_LEBIH = 1.5;
        final int DENDA_JUMLAH_PINJAM_BUKU = 50;
    
        double skor = 0;
        skor += membershipInfo.getJumlahTerlambat() * DENDA_TERLAMBAT;
        skor += membershipInfo.getJumlahDenda() * DENDA_JUMLAH;
        
        if (!membershipInfo.isStatusAktif())
            skor += DENDA_NONAKTIF;
        if (membershipInfo.getTingkatKeanggotaan().equals("DASAR"))
            skor += DENDA_MEMBER_BASIC;
        if (membershipInfo.getJumlahBukuDipinjam() > DENDA_JUMLAH_PINJAM_BUKU)
            skor -= BONUS_BUKU_LEBIH;
        return skor;
    }
}

