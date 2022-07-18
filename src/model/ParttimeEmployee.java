package model;

public class ParttimeEmployee extends Employee {
    private float workHours;

    public ParttimeEmployee(String id, String fullName, int age, String phone, String email, float workHours) {
        super(id, fullName, age, phone, email);
        this.workHours = workHours;
    }

    public ParttimeEmployee(float workHours) {
        this.workHours = workHours;
    }

    @Override
    public float getSalary() {
        return workHours*100;
    }

    public ParttimeEmployee() {
    }

    public float getWorkHours() {
        return workHours;
    }

    public void setWorkHours(float workHours) {
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        return "ParttimeEmployee{" +
                "workHours=" + workHours +
                '}';
    }
}
