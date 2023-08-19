package CompositeDesign;

public class SalesDept implements Department{
    private int id;
    private String name;

    public SalesDept(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "SalesDept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
