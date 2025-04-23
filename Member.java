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

    public int getPoinLoyalitas() {
        return poinLoyalitas;
    }

    public String getTingkatKeanggotaan() {
        return tingkatKeanggotaan;
    }
    
    public void setTingkatKeanggotaan(String t) {
        tingkatKeanggotaan = t;
    }

    public int getJumlahBukuDipinjam() {
        return jumlahBukuDipinjam;
    }

    public void setJumlahBukuDipinjam(int b) {
        jumlahBukuDipinjam = b;
    }

    public int getJumlahTerlambat() {
        return jumlahTerlambat;
    }

    public void setJumlahTerlambat(int t) {
        jumlahTerlambat = t;
    }

    public int getJumlahDenda() {
        return jumlahDenda;
    }

    public void setJumlahDenda(int d) {
        jumlahDenda = d;
    }

    public String getKodeReferal() {
        return kodeReferal;
    }

    public void setKodeReferal(String k) {
        kodeReferal = k;
    }

    public boolean getLanggananBuletin() {
        return langgananBuletin;
    }

    public void setLanggananBuletin(boolean l) {
        langgananBuletin = l;
    }

    public void setPoinLoyalitas(int poinLoyalitas) {
        this.poinLoyalitas = poinLoyalitas;
    }

    public boolean isStatusAktif() {
        return statusAktif;
    }
}