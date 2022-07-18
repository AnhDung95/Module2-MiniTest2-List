import model.Employee;
import model.FulltimeEmployee;
import model.ParttimeEmployee;

import java.util.ArrayList;

public class EmployeeManager {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        FulltimeEmployee b1 = new FulltimeEmployee(100, 0, 10000);
        FulltimeEmployee b2 = new FulltimeEmployee(10, 50, 20000);
        ParttimeEmployee b3 = new ParttimeEmployee(3.4f);
        ParttimeEmployee b4 = new ParttimeEmployee(10.0f);
        employees.add(b1);
        employees.add(b2);
        employees.add(b3);
        employees.add(b4);

        System.out.println(getParttimeUnderSalary());
        System.out.println("Luong phai tra cho nhan vien ban thoi gian: "+ getPartTimeSalary());
    }

    //    1. Lay ra luong trung binh cua cong ty
    public static float getAverageSalary(){
        float sum= 0;
        for (Employee e: employees) {
            sum+=e.getSalary();
        }

        float average = sum/employees.size();
        return average;
    }
    //    2. Lay danh sach nhan vien luong thap hon luong tb
    public static ArrayList<Employee> getParttimeUnderSalary(){
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        float average = getAverageSalary();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof ParttimeEmployee &&
                    employees.get(i).getSalary()<average)
                employeeArrayList.add(employees.get(i));
        }
        return employeeArrayList;
    }
//    Tổng số lương phải trả cho nhân viên bán tgian
    public static double getPartTimeSalary() {
        double sum=0;
        for (Employee e: employees) {
            if (e instanceof ParttimeEmployee){
                sum+=e.getSalary();
            }
        }
        return sum;
    }
//    Sắp xếp nhân viên toàn tgian theo số lương tăng dần
    public static ArrayList<Employee> sortListFTEmployee(){
        ArrayList<Employee>arrayList1=new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof FulltimeEmployee){
                arrayList1.add(employees.get(i));
            }
        }
        arrayList1.sort(((((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary())))));
        return arrayList1;
    }
}

