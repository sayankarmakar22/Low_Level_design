package AdapterDesign;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        StudentClient client = new StudentClient();
        List<Student> allStu = client.getStudentList();
        for(Student s : allStu){
            System.out.println(s.getEmail() + " " + s.getName() + " " + s.getSurname());
        }
    }
}
