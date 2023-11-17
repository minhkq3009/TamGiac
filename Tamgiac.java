public class Tamgiac {
    private double canhA;
    private double canhB;
    private double canhC;

    // Phương thức khởi tạo
    public Tamgiac(double canhA, double canhB, double canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    // Phương thức kiểm tra 3 giá trị có phải 3 cạnh 1 tam giác hay không
    public boolean laTamGiac() {
        return (canhA + canhB > canhC) && (canhA + canhC > canhB) && (canhB + canhC > canhA);
    }

    // Phương thức tính chu vi
    public double tinhChuVi() {
        if (laTamGiac()) {
            return canhA + canhB + canhC;
        } else {
            return 0; // Trả về 0 nếu không phải tam giác
        }
    }

    // Phương thức tính diện tích theo công thức Heron
    public double tinhDienTich() {
        if (laTamGiac()) {
            double p = tinhChuVi() / 2;
            return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
        } else {
            return 0; // Trả về 0 nếu không phải tam giác
        }
    }
}

