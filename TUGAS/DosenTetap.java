import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen{
    private String NIDN;

    public DosenTetap(){
    }

    public DosenTetap(String NIP, String NIDN, String nama, LocalDate tanggal_lahir, LocalDate TMT, double gajiPokok, String Fakultas){
        super(NIP, nama, tanggal_lahir, TMT, gajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    public String getNIDN(){
        return NIDN;
    }

    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    public double getTunjangan() {
        int masaKerja = Period.between(getTMT(), LocalDate.now()).getYears();
        return 0.02 * masaKerja * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN            : " + getNIDN());
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + getFakultas());
        System.out.println("Masa Kerja      : " + getMasaKerja());
        System.out.println("BUP             : " + getFormattedDate(getBUP(65)));
        System.out.println("Tunjangan       : " + formatRupiah(getTunjangan()));
    }
}