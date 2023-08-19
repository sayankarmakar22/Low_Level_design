package CompositeDesign;

public class ITDept implements Department{
    private int id;
    private String name;

    public ITDept(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "ITDept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
