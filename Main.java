// --- Bài 3 ---
class Classroom {
    private String tenLop;
    private java.util.ArrayList<Student> danhSach;

    public Classroom(String tenLop) {
        this.tenLop = tenLop;
        this.danhSach = new java.util.ArrayList<>();
    }

    // --- Bài 3 ---
    public void addStudent(Student s) {
        for (int i = 0; i < danhSach.size(); i++) {
            Student student = danhSach.get(i);
            if (student.getMssv().equals(s.getMssv())) {
                throw new IllegalArgumentException("MSSV " + s.getMssv() + " đã tồn tại trong lớp!");
            }
        }
        danhSach.add(s);
    }

    // --- Bài 3 ---
    public String xepLoai(Student s) {
        double dtb = s.diemTrungBinh();
        if (dtb >= 8) return "Giỏi";
        if (dtb >= 6.5) return "Khá";
        if (dtb >= 5) return "Trung bình";
        return "Yếu";
    }

    // --- Bài 3 ---
    public void inBangDiem() {
        System.out.println("--- BẢNG ĐIỂM LỚP " + tenLop + " ---");
        for (int i = 0; i < danhSach.size(); i++) {
            Student s = danhSach.get(i);
            System.out.printf("MSSV: %s | Tên: %-15s | ĐTB: %.2f | Xếp loại: %s\n",
                    s.getMssv(), s.getName(), s.diemTrungBinh(), xepLoai(s));
        }
        System.out.println("Sĩ số lớp: " + danhSach.size());
    }
}

public class Main {
    public static void main(String[] args) {
        // --- Bài 3 ---
        Classroom d21 = new Classroom("D21CQCN");

        // --- Bài 1 & Bài 2 ---
        Student sv1 = new Student("Nguyen Van A", 9, 8, 8);
        sv1.capNhatEmail("a@ptit.edu.vn").capNhatSdt("0987654321");
        
        Student sv2 = new Student("Tran Thi B", 10, 5, 4.5);
        Student sv3 = new Student("Le Van C", 7, 7, 7);

        // --- Bài 1 ---
        sv1.setDiemGK(11);
        sv2.setDiemCK(-1);

        // --- Bài 3 ---
        try {
            d21.addStudent(sv1);
            d21.addStudent(sv2);
            d21.addStudent(sv3);
            
            System.out.println("Thử thêm sinh viên trùng MSSV...");
            d21.addStudent(sv1); 
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        System.out.println();
        
        // --- Bài 3 ---
        d21.inBangDiem();
        
        System.out.println();
        
        // --- Bài 2 ---
        System.out.println("Tổng số sinh viên đã tạo (Student.getTotalStudents()): " + Student.getTotalStudents());
    }
}