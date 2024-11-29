package collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
    private String employeeName;
    private List<String> phones;
    private Set<String> address;
    private Map<String,String> courses;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Emp(String employeeName, List<String> phones, Set<String> address, Map<String, String> courses) {
        super();
        this.employeeName = employeeName;
        this.phones = phones;
        this.address = address;
        this.courses = courses;
    }

    public Emp() {
        super();
    }
}
