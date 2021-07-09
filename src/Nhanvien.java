import java.util.Scanner;

public class Nhanvien {

    private int id;
    private String name;
    private int age;
    private int phone;
    private String email;
    private int salary;

    public Nhanvien() {
    }

    public Nhanvien(int id, String name, int age, int phone, String email, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id + " - " + name + " - " + age + " yearold - SĐT " + phone + " - " + email ;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID : ");
        id = Integer.valueOf( sc.nextLine());
        System.out.println("Nhập Name : ");
        name = sc.nextLine();
        System.out.println("Nhập Tuổi : ");
        age =  Integer.valueOf(sc.nextLine());
        System.out.println("Nhập SĐT : ");
        phone = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập Email : ");
        email = sc.nextLine();
        System.out.println("Nhập Lương cơ bản : ");
        salary = Integer.valueOf(sc.nextLine());
    }
}
