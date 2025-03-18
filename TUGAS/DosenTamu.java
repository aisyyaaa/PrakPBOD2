import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen{
    private String NIDK;
    private LocalDate AkhirKontrak;

    public DosenTamu(){
    }

    public DosenTamu(String NIP, String NIDK, String nama, LocalDate tanggal_lahir, LocalDate TMT, double gajiPokok, String Fakultas, LocalDate AkhirKontrak){
        super(NIP, nama, tanggal_lahir, TMT, gajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.AkhirKontrak = AkhirKontrak;
    }

    public String getNIDK(){
        return NIDK;
    }

    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    public LocalDate getAkhirKontrak(){
        return AkhirKontrak;
    }

    public void setAkhirKontrak(LocalDate AkhirKontrak) {
        this.AkhirKontrak = AkhirKontrak;
    }

    public double getTunjangan() {
        return 0.025 * getGajiPokok();
    }

    public String getSisaKontrak() {
        Period period = Period.between(LocalDate.now(), getAkhirKontrak());
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK            : " + getNIDK());
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + getFakultas());
        System.out.println("Sisa Kontrak    : " + getSisaKontrak());
        System.out.println("Tunjangan       : " + formatRupiah(getTunjangan()));
    }
}