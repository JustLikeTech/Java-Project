/*class esxp_test1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[5] = 100;
    }
}*/


public class esxp_test1 {
    public static void main(String args[]) {
        int a[] = new int[5];
        try {
            a[5] = 100;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Anda Mengakses Index Yang Melewati Batas");
        }
    }
}