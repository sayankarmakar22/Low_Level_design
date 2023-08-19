package CompositeDesign;

public class HRDept implements Department{
    private int id;
    private String name;

    public HRDept(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "HRDept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
