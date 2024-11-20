public class LuasKelilingLingkaran {
    private double jari;

    public LuasKelilingLingkaran() {
        jari = 0.0;
    }

    public void isijari(double jari) {
        this.jari = jari;
    }

    public double getluas() {
        return 3.14 * jari * jari;
    }

    public double getKeliling() {
        return 2 * 3.14 * jari;
    }

    public void gethasil() {
        System.out.println("Jadi Luasnya " + getluas() + " Sedangkan Kelilingnya " + getKeliling());
    }

    public static void main(String args[]) {
        LingkaranWithUML a = new LingkaranWithUML();
        a.isijari(10.0);
        a.gethasil();
    }
}
