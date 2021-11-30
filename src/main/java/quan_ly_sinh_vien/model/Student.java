package quan_ly_sinh_vien.model;

public class Student {
    private int id ;
    private String name;
    private double mathScore;
    private double physicalScore;
    private double chemicalScore;

    public Student(int id, String name, double mathScore, double physicalScore, double chemicalScore) {
        this.id = id;
        this.name = name;
        this.mathScore = mathScore;
        this.physicalScore = physicalScore;
        this.chemicalScore = chemicalScore;
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

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getPhysicalScore() {
        return physicalScore;
    }

    public void setPhysicalScore(double physicalScore) {
        this.physicalScore = physicalScore;
    }

    public double getChemicalScore() {
        return chemicalScore;
    }

    public void setChemicalScore(double chemicalScore) {
        this.chemicalScore = chemicalScore;
    }
}
