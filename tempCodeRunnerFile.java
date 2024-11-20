import java.util.Date;

public class EmployeeData {
    private static final double BASE_SALLARY = 15000.00;
    private String name;
    private double sallary;
    private Date birthDate;

    public EmployeeData(String name, double sallary, Date DoB){
        this.name = name;
        this.sallary = sallary;
        this.birthDate = DoB;
    }

    public EmployeeData(String name, double Sallary) {
        this(name, sallary, null); // Problem
    }

    public EmployeeData(String name, Date DoB) {
        this(name, BASE_SALLARY, DoB);
    }
    
    public EmployeeData(String name) {
        this(name, BASE_SALLARY);
    }

    //More EmployeeData Code
}

class Manager extends EmployeeData {
    private String departement;

    public Manager (String name, double sallary, String dept){
        super(name, sallary);
        departement = dept;
    }
    
    public Manager (String n, String dept) {
        super(n);
        departement = dept;
    }

    public Manager (String dept) {
        departement = dept;
    }
}
