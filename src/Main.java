import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String args[]) throws IOException {
            FileOutputStream fout = null;

            try {
                fout = new FileOutputStream("userlist.dat");
                ObjectOutputStream obs = new ObjectOutputStream(fout);
                List<Student> list = new ArrayList<>();
                list.add(new Student(1, "Khanh Duy"));
                list.add(new Student(2, "Quang Duy"));
                obs.writeObject(list);
                obs.close();
                fout.close();


                FileInputStream fis = new FileInputStream("userlist.dat");
                ObjectInputStream ois = new ObjectInputStream(fis);
                List<Student> list1 =(List<Student>) ois.readObject();
                System.out.println(list.get(1).toString());
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            } finally {
            }
            System.out.println("success!");
        }
}
