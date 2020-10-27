import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
        public static void main(String args[]) throws IOException {
            FileOutputStream fout = null;
            BufferedOutputStream bout = null;

            try {
                fout = new FileOutputStream("testout.dat");
                bout = new BufferedOutputStream(fout);
                String s = "Welcome to java.";
                byte b[] = s.getBytes();
                bout.write(b);
                String s1 = "Welcome to java 1.";
                byte b2[] = s1.getBytes();
                bout.write(b2);
                bout.flush();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                bout.close();
                fout.close();
            }

            System.out.println("success!");
        }
}
