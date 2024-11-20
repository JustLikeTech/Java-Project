class esxp_test6 {
    static void demo(){
        NullPointerException t;
        t = new NullPointerException("Coba Throw");
        throw t;
    } 
    public static void main(String[] args) {
            try {
                demo();
                System.out.println("Selesai");
            } catch (NullPointerException ex) {
                // TODO: handle exception
                System.out.println("Saya Tangkap Sinyal" + ex);
            }
        }
}
