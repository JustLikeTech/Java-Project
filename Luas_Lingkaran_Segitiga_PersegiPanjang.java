// Luas Lingkaran,Segitiga,PersegiPanjang

class Luas_Lingkaran_Segitiga_PersegiPanjang {
    public double getLuas(){
        return 0.0;
    }
}

class Lingkaran extends Luas_Lingkaran_Segitiga_PersegiPanjang{
    private double r;
    
    public Lingkaran(double r){
        this.r = r;
    }
    public double getR(){
        return r;
    }
    public double getLuas(){
        return Math.PI * r * r;
    }
}

class PersegiPanjang extends Luas_Lingkaran_Segitiga_PersegiPanjang{
    private double p;
    private double l;

    public PersegiPanjang(double p, double l){
        this.p = p;
        this.l = l;
    }
    public double getPanjang(){
        return p;
    }
    public double getLebar(){
        return l;
    }
    public double getLuas(){
        return p * l;
    }
}

class Segitiga extends Luas_Lingkaran_Segitiga_PersegiPanjang{
    private double a;
    private double t;

    public Segitiga (double a, double t){
        this.a= a;
        this.t = t;
    }
    public double getAlas(){
        return a;
    }
    public double getTinggi(){
        return t;
    }
    public double getLuas(){
        return 0.5  * a * t;
    }
}
public class Luas_Lingkaran_Segitiga_PersegiPanjangSubClass {
    public static void main(String[] args){
        Lingkaran lingkaran = new Lingkaran(5);
        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 6);
        Segitiga segitiga = new Segitiga(3, 4);
    
        System.out.println("Luas Lingkaran: " + lingkaran.getLuas());
        System.out.println("Luas PersegiPanjang: " + persegiPanjang.getLuas());
        System.out.println("Luas Segitiga: " + segitiga.getLuas());
    }
}
