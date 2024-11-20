// Perpustakaan


/*public class Perpustakaan {
    public static void main(String[] args){
        Buku a, b;
        a = new Buku();
        b = new Buku();

        String pengarangA, pengarangB;
        String judulA, judulB;

        pengarangA = "Helga Anindya";
        judulA = "Siaga Merah";

        pengarangB = "David Noor";
        judulB = "Siaga Hitam";

        System.out.println("Judul" + judulA + "Pengarang: " + pengarangA);
        System.out.println("Judul" + judulB + "Pengarang: " + pengarangB);
    }
}*/

/*public class UMLClassDiagram {
    public static void main(String[] args) {
        Buku a, b;
        a = new Buku();
        b = new Buku();

        a.pengarang = "Helga Anindya";
        a.judul = "Siaga Merah";

        b.pengarang = "David Noor";
        b.judul = "Siaga Hitam";

        System.out.println("Judul" + a.judul + "Pengarang: " + a.pengarang);
        System.out.println("Judul" + b.judul + "Pengarang: " + b.pengarang);
    }
}

class Buku {
    String pengarang;
    String judul;
}*/

/*class Mahasiswa{
    private int NRP;
    private String nama;

    public void setNRP(int nrp){
        this.NRP = nrp;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getNRP(){
        return this.NRP;
    }

    public String getNama(){
        return this.nama;
    }

}
public class UMLClassDiagram{
    public static void main(String args[]){
        Mahasiswa mhs=new Mahasiswa();

        mhs.setNRP(7206);
        mhs.setNama("Ali Ridho");

        System.out.println("Nama Mahasiswa "+ mhs.getNama() + " NRP " +mhs.getNRP());
    }
}*/

/*class Mahasiswa{
    private int NRP;
    private String nama;

    public void setNRP(int nrp){
        this.NRP = nrp;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getNRP(){
        return this.NRP;
    }

    public String getNama(){
        return this.nama;
    }

}
public class UMLClassDiagram{
    public static void main(String args[]){
        Mahasiswa mhs=new Mahasiswa();

        mhs.setNRP(7206);
        mhs.setNama("Ali Ridho");

        System.out.println("Nama Mahasiswa "+ mhs.getNama() + " NRP " +mhs.getNRP());
    }
}*/

class AcaraTV {
    private String stasiunTV;
    private String acara;

    public String getStasiunTV() {
        return stasiunTV;
    }

    public void setStasiunTV(String stasiunTV) {
        this.stasiunTV = stasiunTV;
    }

    public String getAcara() {
        return acara;
    }

    public void setAcara(String acara) {
        this.acara = acara;
    }

    public void cetak() {
        System.out.println("Acara " + acara + " Stasiun TV " + stasiunTV);
    }
}

public class UMLClassDiagram {
    public static void main(String args[]) {
        AcaraTV a = new AcaraTV();

        a.setStasiunTV("Indosiar");
        a.setAcara("Sinetron");
        a.cetak();
    }
}