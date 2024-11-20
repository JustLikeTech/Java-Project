public class esxp_test5 {
        public static void main(String[] args) {
            int bil = 10;
            String b[] = { "a", "b", "c" };
            try {
                System.out.println(bil / 0);
            } catch (ArithmeticException ai) {
                // TODO: handle exception
                System.out.println("Pesan dari getMessage()");
                System.out.println(ai.getMessage());
            } finally{
                System.out.println("Blok Finnaly AKan Selalu Di Esksekusi");
            }
        }
    }
