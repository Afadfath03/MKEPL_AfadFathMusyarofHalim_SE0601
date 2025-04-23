class Person {
    private String namaLengkap;
    private String alamat;
    private String nomorTelepon;
    private String email;
    private Gender jenisKelamin;

    public Person(String namaLengkap, String alamat, String nomorTelepon, String email, Gender jenisKelamin) {
        this.namaLengkap = namaLengkap;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public String getEmail() {
        return email;
    }

    public Gender getJenisKelamin() {
        return jenisKelamin;
    }

    public enum Gender {
        LAKI_LAKI, PEREMPUAN
    }
}