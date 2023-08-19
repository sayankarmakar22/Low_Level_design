package CompositeDesign;

public class Driver {
    public static void main(String[] args) {
        Department sales = new SalesDept(1,"sales");
        HeadDept head = new HeadDept(2,"head");
        Department it = new ITDept(3,"IT");

        head.addDept(sales);
        head.addDept(it);

        head.printDepartmentName();

        head.removeDept(sales);
        head.printDepartmentName();

    }
}
