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

    public boolean periksaKelayakanUpgrade() {
        return membershipInfo.getTingkatKeanggotaan().equals("DASAR") && membershipInfo.getPoinLoyalitas() > 100;
    }

    public double hitungSkorRisiko() {
        double skor = 0;
        skor += membershipInfo.getJumlahTerlambat() * 1.5;
        skor += membershipInfo.getJumlahDenda() * 0.1;
        if (!membershipInfo.isStatusAktif())
            skor += 5;
        if (membershipInfo.getTingkatKeanggotaan().equals("DASAR"))
            skor += 2;
        if (membershipInfo.getJumlahBukuDipinjam() > 50)
            skor -= 1.5;
        return skor;
    }

    public void langgananBuletinPerpustakaan() {
    }

    public void gunakanKodeReferal(String kode) {
    }
}

