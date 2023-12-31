package AdapterDesign;

import java.util.ArrayList;
import java.util.List;

public class StudentClient{
    public List<Student> getStudentList(){
        List<Student> students = new ArrayList<>();
        CollegeStudent collegeStudent = new CollegeStudent("sayan","karmakar","sayan@gmail.com");
        SchoolStudent schoolStudent = new SchoolStudent("laki","roy","laki@gmail.com");
        students.add(collegeStudent);
        students.add(new SchoolStudentAdapter(schoolStudent));
        return students;
    }
}
