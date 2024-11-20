public class esxp_test4 {
        public static void main(String[] args) {
            int bil = 10;
            String b[] = {"a", "b", "c"};
            try {
                System.out.println(bil / 0);
                System.out.println(b[3]);
            } catch (ArithmeticException ai) {
                // TODO: handle exception
                System.out.println("Error Aritmatik");
            } catch (ArrayIndexOutOfBoundsException n) {
                // TODO: handle exception
                System.out.println("Ada Error Yang Terjadi");
            }catch (Exception e) {
                // TODO: handle exception
                System.out.println("Ada Error Yang Terjadi");
            }
        }
    } 
