package pojo.demo;


import com.fasterxml.jackson.annotation.JsonInclude;


// @JsonInclude(JsonInclude.Include.NON_NULL) ifadesi serialize islemlerinde null degerlerin dahil edilmemesini saglar

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employee {


    private String firstname =null;
    private String lastname =null;

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private int age;
    private double salary;
    private String entryDate = null;
    private String role = null;


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", entryDate='" + entryDate + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
