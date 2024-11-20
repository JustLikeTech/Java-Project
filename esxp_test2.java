/*public class esxp_test2 {
    public static void main(String[] args){
        int bil = 10;
        System.out.println(bil/0);
    }
}*/

public class esxp_test2 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil/0);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Ada Error Yang Terjadi");
        }
    }
}
