import java.io.*;

public class ConFileIO_5 {
    public static void main (String [] args ) throws IOException{
        RandomAccessFile berkas=null;
        berkas = new RandomAccessFile("abc.dat", "rw");
        berkas.writeBytes("ABCDEFGHIJKL");
        char kar='0';

        berkas.seek(0);
        System.out.println("Isi Berkas: ");
        while (berkas.getFilePointer()<berkas.length()) {
            kar = (char) berkas.readByte();
            System.out.println(kar);
        }
    }
}
