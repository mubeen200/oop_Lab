package source;

public class Employee {
    private String name;
    private String department;
    private String contact;
    private String designation;
    private double salary;
    private String status;

    public Employee(String name, String department, String contact, String designation, double salary, String status) {
        this.name = name;
        this.department = department;
        this.contact = contact;
        this.designation = designation;
        this.salary = salary;
        this.status = status;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getContact() { return contact; }
    public String getDesignation() { return designation; }
    public double getSalary() { return salary; }
    public String getStatus() { return status; }

    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setContact(String contact) { this.contact = contact; }
    public void setDesignation(String designation) { this.designation = designation; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Name: " + name + ", Department: " + department + ", Contact: " + contact +
                ", Designation: " + designation + ", Salary: " + salary + ", Status: " + status;
    }

    public String toFileFormat() {
        return name + "," + department + "," + contact + "," + designation + "," + salary + "," + status + "\n";
    }
}
