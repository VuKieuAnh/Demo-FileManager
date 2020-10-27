import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Student> students;
        public static void main(String args[]) throws IOException {

            try {
                FileManager son = new FileManager();
                students = son.readFile();
                //tạo mới 1 user
                Student student = new Student(3, "Duy Blue");
                students.add(student);

                //ghi file
                son.writeFile(students);


                //đọc file
                List<Student> students1 = son.readFile();
                System.out.println(students1.get(2).toString());
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            } finally {
            }
            System.out.println("success!");
        }
}
