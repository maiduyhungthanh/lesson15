import java.util.Scanner;

public class Kiemchungvien extends Nhanvien {

    private int error;

    public Kiemchungvien() {
    }

    public Kiemchungvien(int id, String name, int age, int phone, String email, int salary, int error) {
        super(id, name, age, phone, email, salary);
        this.error = error;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public int salaryKCV() {
        return getSalary() + error * 50000;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println(" Nhập Số lỗi Error : ");
        error = sc.nextInt();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - Lương:  " + salaryKCV();
    }

    


    



     
}
