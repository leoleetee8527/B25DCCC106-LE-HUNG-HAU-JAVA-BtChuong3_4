public class Student {
    // --- Bài 2 ---
    private static int counter = 0;
    
    // --- Bài 1 ---
    private String mssv; 
    private String name;
    private double diemCC;
    private double diemGK;
    private double diemCK;

    // --- Bài 2 ---
    private String email;
    private String sdt;

    public Student(String name, double diemCC, double diemGK, double diemCK) {
        // --- Bài 2 ---
        counter++;
        this.mssv = String.format("B21DCCN%03d", counter);

        // --- Bài 1 ---
        this.name = name;
        this.setDiemCC(diemCC);
        this.setDiemGK(diemGK);
        this.setDiemCK(diemCK);
    }

    // --- Bài 1 ---
    public String getMssv() { return mssv; }
    public String getName() { return name; }
    public double getDiemCC() { return diemCC; }
    public double getDiemGK() { return diemGK; }
    public double getDiemCK() { return diemCK; }

    // --- Bài 1 ---
    public void setDiemCC(double diemCC) {
        if (diemCC >= 0 && diemCC <= 10) this.diemCC = diemCC;
    }

    public void setDiemGK(double diemGK) {
        if (diemGK >= 0 && diemGK <= 10) this.diemGK = diemGK;
    }

    public void setDiemCK(double diemCK) {
        if (diemCK >= 0 && diemCK <= 10) this.diemCK = diemCK;
    }

    // --- Bài 1 ---
    public double diemTrungBinh() {
        return (diemCC * 0.1) + (diemGK * 0.3) + (diemCK * 0.6);
    }

    // --- Bài 2 ---
    public Student capNhatEmail(String email) {
        this.email = email;
        return this;
    }

    // --- Bài 2 ---
    public Student capNhatSdt(String sdt) {
        this.sdt = sdt;
        return this;
    }

    // --- Bài 2 ---
    public static int getTotalStudents() {
        return counter;
    }
}