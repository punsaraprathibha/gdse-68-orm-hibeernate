//package entity;
//
//
//import embedded.MobileNo;
//import embedded.NameIdentifier;
//import org.hibernate.annotations.CreationTimestamp;
//
//import javax.persistence.*;
//import java.sql.Timestamp;
//import java.util.ArrayList;
//import java.util.List;
//
////1. @Entity(name = "customer")
//@Entity
//@Table(name = "customer")
//public class CustomerOld {
//
//    @Id // Tells Hibernate that this is the Primary key of this table
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "customer_id")
//    private int id;
//    @Column(name = "customer_name")
//    private NameIdentifier name;
//    @Column(name = "customer_address", length = 100, nullable = false)
//    private String address;
//
//    @Transient
//    @Column(name = "customer_salary")
//    private double salary;
//
//    public NameIdentifier getName() {
//        return name;
//    }
//
//    public void setName(NameIdentifier name) {
//        this.name = name;
//    }
//
//    @CreationTimestamp
//    private Timestamp createdDateTime;
//
//    public Timestamp getCreatedDateTime() {
//        return createdDateTime;
//    }
//
//    public void setCreatedDateTime(Timestamp createdDateTime) {
//        this.createdDateTime = createdDateTime;
//    }
//
//    public List<MobileNo> getMobileNos() {
//        return mobileNos;
//    }
//
//    public void setMobileNos(List<MobileNo> mobileNos) {
//        this.mobileNos = mobileNos;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @ElementCollection
//    @CollectionTable(
//         name = "customer_mobile_nos",
//         joinColumns =
//         @JoinColumn(name = "customer_id"))
//    private List<MobileNo> mobileNos
//            = new ArrayList<>();
//
//    @Transient
//    @Column(name = "customer_age")
//    private int age;
//
//
//    public CustomerOld() {}
//
//    public CustomerOld(int id, String address, double salary, int mobileNo) {
//        this.id = id;
//        this.address = address;
//        this.salary = salary;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Customer{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//}
