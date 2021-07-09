public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Lập Trình Viên");
        Laptringvien LTV = new Laptringvien();
        LTV.input();
        System.out.println(LTV.toString());

        System.out.println("");

        System.out.println("Kiểm Chứng Viên");
        Kiemchungvien KCV = new Kiemchungvien();
        KCV.input();
        System.out.println(KCV.toString());
    }
}
