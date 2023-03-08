package ObjectPoolPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program to create the object pool of department");
        // Student( int enroll,String name, String departmentName)
        Student s1 = new Student(1232,"Ajay","ComputerScience");
        System.out.println(s1.getDepartment());
        
        Student s3 = new Student(12389,"kiruthika","ComputerScience");
        System.out.println(s3.getDepartment());
        System.out.println(s1.getDepartment() == s1.getDepartment());
        
        Student s2 = new Student(1232,"Sachin","Electrical");
        System.out.println(s2.getDepartment());
        
        
        
        
        
        Student s4 = new Student(122322,"Akshaya","Electrical");
        System.out.println(s4.getDepartment());
        
        System.out.println(s4.getDepartment() == s2.getDepartment());
        
        Student s5 = new Student(1888,"vettri","Mechanical");
        System.out.println(s5.getDepartment());
        
        Student s6 = new Student(9888," Sunitha","Mechanical");
        System.out.println(s6.getDepartment());
        
        System.out.println(s6.getDepartment() == s5.getDepartment());
        
        System.out.println(Student.getComDepCount());
        System.out.println(Student.getMecDepCount());
        System.out.println(Student.getEleDepCount());
        
        Student.releaseReference(s6);
        s6 =null;
        System.out.println(Student.getMecDepCount());
        
        System.out.println(s1 instanceof Object);
        ComputerScience c = new ComputerScience();
        Department d = new Department();
        System.out.println(c instanceof Department);
        System.out.println(d instanceof ComputerScience);
        
    }
}

