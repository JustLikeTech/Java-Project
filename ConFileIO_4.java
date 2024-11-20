import java.io.*;

public class ConFileIO_4 {
    public static void main (String [] args){
        String dir = "d:/hanif";
        File f = new File(dir);

        String[] daftar = f.list();
        java.util.Arrays.sort(daftar);

        System.out.println("File Dan Direktori Didalam D:/Hanif");
        System.out.println();
        
        for( int i=0; i<daftar.length; i++){
            File fTemp = new File (dir + "/" + daftar[i]);
            if (fTemp.isDirectory()) {
                System.out.println(daftar[i] + "\t\t<DIR>");
            }
            else {
                System.out.println(daftar[i]);
            }
        }

    }

}
