package Java101Pratik.StudentNoteSystem;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int oralMat, int fizik, int oralFizik, int kimya, int oralKimya) {

        if ((mat >= 0 && mat <= 100) && (oralMat >= 0 && oralMat <= 100)) {
            this.mat.note = mat;
            this.mat.oralNote = oralMat;
            this.mat.finalNote = (this.mat.oralNote * 0.2) + (this.mat.note * 0.8);
        }

        if ((fizik >= 0 && fizik <= 100) && (oralFizik >= 0 && oralFizik <= 100)) {
            this.fizik.note = fizik;
            this.fizik.oralNote = oralFizik;
            this.fizik.finalNote = this.fizik.oralNote * 0.2 + this.fizik.note * 0.8;
        }

        if ((kimya >= 0 && kimya <= 100) && (oralKimya >= 0 && oralKimya <= 100)) {
            this.kimya.note = kimya;
            this.kimya.oralNote = oralKimya;
            this.kimya.finalNote = this.kimya.oralNote * 0.2 + this.kimya.note * 0.8;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.mat.oralNote == 0 || this.fizik.note == 0 || this.fizik.oralNote == 0
                || this.kimya.note == 0 || this.kimya.oralNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.average = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.finalNote);
        System.out.println("Fizik Notu : " + this.fizik.finalNote);
        System.out.println("Kimya Notu : " + this.kimya.finalNote);
    }

}
