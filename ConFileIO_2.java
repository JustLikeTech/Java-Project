import java.io.*;

public class ConFileIO_2 {
    public static void main(String [] args){
        FileOutputStream foutput =null;
        String data = "Baris Pertama \nBaris Kedua \nBarisKetiga"; //Tidak Ada ;

        try {
            foutput = new FileOutputStream("d:/Output.txt");
        } catch (FileNotFoundException fnfe) {
            // TODO: handle exception
            System.out.println("File Tidak Dapat Dibentuk");
            return;
        }

        try {
            for (int i=0; i<data.length(); i++){
                foutput.write ((int) data.charAt(i));
            }
        } catch (IOException ioe) {
            // TODO: handle exception
            System.out.println(ioe.getMessage());
            return;
        }

        try{
            foutput.close();
        }
        catch (IOException ioe) {}
    }
}
