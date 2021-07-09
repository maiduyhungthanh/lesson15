import java.util.Scanner;

public class Laptringvien extends Nhanvien {
    private int time;

    public Laptringvien() {
    }

    public Laptringvien(int id, String name, int age, int phone, String email, int salary, int time) {
        super(id, name, age, phone, email, salary);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
 
    public int salaryLTV() {
        return getSalary() + time*200000;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - Lương:  " + salaryLTV();
    }
    
   @Override
   public void input() {
       // TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       super.input();
       System.out.println(" Nhập Số giờ Overtime");
       time = sc.nextInt();
   }

    
}
