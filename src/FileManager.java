import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
   private static String pathFile= "userlist.dat";
   public void writeFile(List<Student> students) throws IOException {
       FileOutputStream fout = new FileOutputStream(pathFile);
       ObjectOutputStream obs = new ObjectOutputStream(fout);
       obs.writeObject(students);
       obs.close();
       fout.close();
   }
   public List<Student> readFile() throws IOException, ClassNotFoundException {
       FileInputStream fis = new FileInputStream(pathFile);
       ObjectInputStream ois = new ObjectInputStream(fis);
       List<Student> list1 =(List<Student>) ois.readObject();
       return list1;
   }
}
