package CompositeDesign;

import java.util.ArrayList;
import java.util.List;

public class HeadDept implements Department{
    private int id;
    private String name;
    List<Department> departmentList;

    public HeadDept(int id, String name) {
        this.id = id;
        this.name = name;
        this.departmentList = new ArrayList<>();
    }

    public void addDept(Department department){
        this.departmentList.add(department);
    }
    public void removeDept(Department department){
        this.departmentList.remove(department);
    }
    @Override
    public void printDepartmentName() {
        for(Department department : departmentList){
            System.out.println(department);
        }
    }
}
