package md.utm.marcel.lab6;

import java.util.List;

public class Hospital {
    private String name;
    private Address address;
    private Phone phone;
    private List<Department> departments;

    public Hospital(String name, Address address, Phone phone, List<Department> departments) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", phone=" + phone +
                ", departments=" + departments +
                '}';
    }
}
