import java.util.Date;

class Member {
    private String kodeAnggota;
    private Date tanggalGabung;
    private boolean statusAktif;
    private String tingkatKeanggotaan;
    private int jumlahBukuDipinjam;
    private int jumlahTerlambat;
    private int jumlahDenda;
    private int poinLoyalitas;
    private String kodeReferal;
    private boolean langgananBuletin;

    public Member(String kodeAnggota, Date tanggalGabung, boolean statusAktif, String tingkatKeanggotaan,
            int jumlahBukuDipinjam, int jumlahTerlambat, int jumlahDenda, int poinLoyalitas, String kodeReferal,
            boolean langgananBuletin) {
        this.kodeAnggota = kodeAnggota;
        this.tanggalGabung = tanggalGabung;
        this.statusAktif = statusAktif;
        this.tingkatKeanggotaan = tingkatKeanggotaan;
        this.jumlahBukuDipinjam = jumlahBukuDipinjam;
        this.jumlahTerlambat = jumlahTerlambat;
        this.jumlahDenda = jumlahDenda;
        this.poinLoyalitas = poinLoyalitas;
        this.kodeReferal = kodeReferal;
        this.langgananBuletin = langgananBuletin;
    }

    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public Date getTanggalGabung() {
        return tanggalGabung;
    }

    public boolean isStatusAktif() {
        return statusAktif;
    }

    public String getTingkatKeanggotaan() {
        return tingkatKeanggotaan;
    }

    public int getJumlahBukuDipinjam() {
        return jumlahBukuDipinjam;
    }

    public int getJumlahTerlambat() {
        return jumlahTerlambat;
    }

    public int getJumlahDenda() {
        return jumlahDenda;
    }

    public int getPoinLoyalitas() {
        return poinLoyalitas;
    }

    public String getKodeReferal() {
        return kodeReferal;
    }

    public boolean isLanggananBuletin() {
        return langgananBuletin;
    }
}