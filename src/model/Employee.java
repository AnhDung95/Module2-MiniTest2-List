package model;

public abstract class Employee {
    private String id;
    private String fullName;
    private int age;
    private String phone;
    private String email;

    public abstract float getSalary();

    public Employee() {
    }

    public Employee(String id, String fullName, int age, String phone, String email) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
