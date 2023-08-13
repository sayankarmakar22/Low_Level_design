package PrototypeDesign;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{
    private List<String> emp;
    public Employees(){
        emp = new ArrayList<>();
    }
    public Employees(List<String> list){
        this.emp=list;
    }
    public void loadData() throws InterruptedException {
        System.out.println("fetching data..........");
        Thread.sleep(5000);
        emp.add("Pankaj");
        emp.add("Raj");
        emp.add("David");
        emp.add("Lisa");
        System.out.println("data has been fetched.");
    }
    public List<String> getEmployees(){
        return this.emp;
    }

    @Override
    public Employees clone() {
        List<String> temp = new ArrayList<String>();
        for(String s : this.getEmployees()){
            temp.add(s);
        }
        return new Employees(temp);
    }
}
