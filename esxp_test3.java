public class esxp_test3 {
        public static void main(String[] args) {
            int bil = 10;
            try {
                System.out.println(bil / 0);
            } catch (ArithmeticException ai) {
                // TODO: handle exception
                System.out.println("Error Aritmatik");
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Ada Error Yang Terjadi");
            }
        }
    } 
