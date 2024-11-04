package schoolClasses;

public class StudentRecord {
    // deklarasi intace variable
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;

    // Accessor methods
    public String getName () {
        // public = menjelaskan bahwa method dapat diakses objek luar class
        // String = tipe data return value dari method
        // getName = nama dari method
        // () = parameter pada method
        return name;
    }

    public double getAverage () {
        double result = 0;
        result = (mathGrade + englishGrade + scienceGrade) / 3;

        return result;
    }

    public void setName (String temp) {
        name = temp;
    }

    public String getNumberInWords (int num) {
        String defaultNum = "zero";

        if (num == 1) {
            return "one";
        }
        else if (num == 2) {
            return "two";
        }
        return defaultNum;
    }

    // Accessor Method
    public double getMathGrade() {
        return mathGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    // Mutator Method
    public void setAddress (String address) {
        this.address = address;
    }

    public void setMathGrade (double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setEnglishGrade (double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public void setScienceGrade (double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    public static int getStudentCount () {
        return studentCount;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void print (String temp) {
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Age : " + age);
    }

    public void print (double eGrade, double mGrade, double sGrade) {
        System.out.println("Name : " + name);
        System.out.println("Math Grade : " + mGrade);
        System.out.println("English Grade : " + eGrade);
        System.out.println("Science Grade : " + sGrade);
    }

    // default contructor
    public StudentRecord() {
        this("some string");
        studentCount++;
    }

    public StudentRecord (String temp) {
        this.name = temp;
        studentCount++;
    }

    public StudentRecord (String name, String address) {
        this.name = name;
        this.address = address;
        studentCount++;
    }

    public StudentRecord (double mGrade, double eGrade, double sGrade) {
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
        studentCount++;
    }

    public static void main(String[] args) {
        StudentRecord annaRecord = new StudentRecord("Anna");
        StudentRecord beahRecord = new StudentRecord("Beah", "Philippines");
        StudentRecord crisRecord = new StudentRecord(80, 90, 100);

        annaRecord.setName("Anna");
        annaRecord.setAddress("Philiphines");
        annaRecord.setAge(15);
        annaRecord.setMathGrade(80);
        annaRecord.setEnglishGrade(95.5);
        annaRecord.setScienceGrade(100);
        beahRecord.setName("Beah");
        crisRecord.setName("Cris");

        annaRecord.print (annaRecord.getName());
        annaRecord.print(annaRecord.getEnglishGrade(), annaRecord.getMathGrade(), annaRecord.getScienceGrade());

        System.out.println(annaRecord.getName());

        System.out.println("Count = " + StudentRecord.getStudentCount());
    }
}