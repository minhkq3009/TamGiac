import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Nhập vào 3 số từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh A: ");
        double canhA = scanner.nextDouble();
        System.out.println("Nhập độ dài cạnh B: ");
        double canhB = scanner.nextDouble();
        System.out.println("Nhập độ dài cạnh C: ");
        double canhC = scanner.nextDouble();

        // Tạo đối tượng tam giác
        Tamgiac tamgiac = new Tamgiac(canhA, canhB, canhC);

        // Kiểm tra và in ra chu vi và diện tích của tam giác
        if (tamgiac.laTamGiac()) {
            System.out.println("Chu vi tam giác là: " + tamgiac.tinhChuVi());
            System.out.println("Diện tích tam giác là: " + tamgiac.tinhDienTich());
        } else {
            System.out.println("Ba giá trị không tạo thành tam giác.");
        }
    }
}
