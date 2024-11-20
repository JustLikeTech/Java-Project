import java.io.*;

public class ConFileIO_1 {
    public static void main(String [] args){
        FileInputStream finput = null;
        int data;

        try{
            finput = new FileInputStream("H:/file1.txt");
        }

        catch (FileNotFoundException fnfe){
            System.out.println("File Tidak Ditemukan");
            return;
        }

        try {
            while ((data = finput.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException ioe) {
            // TODO: handle exception
            System.out.println(ioe.getMessage());
            return;
        }

        try {
            finput.close();
        } catch (IOException ioe) {
            // TODO: handle exception
        }
    }   
}
