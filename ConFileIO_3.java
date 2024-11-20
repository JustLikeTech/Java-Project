import java.io.*;

public class ConFileIO_3 {
    public static void main (String [] args){
        FileInputStream finput = null;
        FileOutputStream foutput = null;

        int data;

        try {
            finput = new FileInputStream("d:/file1.txt");
        } catch (FileNotFoundException fnfe) {
            // TODO: handle exception
            System.out.println("File Input Tidak Ditemukan");
            return;
        }

        try {
            finput = new FileInputStream("d:/file2.txt");
        } catch (FileNotFoundException fnfe) {
            // TODO: handle exception
            System.out.println("File Output Tidak Terbentuk");
            return;
        }

        try {
            while ((data = finput.read()) != -1){
                foutput.write(data);
            }
        } catch (IOException ioe) {
            // TODO: handle exception
            System.out.println(ioe.getMessage());
            return;
        }

        try {
            finput.close();
            foutput.close();
        } catch (IOException ioe) {
            // TODO: handle exception
        }
    }
}
