
public class Student {
    String name;
    String id;
    public String Batch_Code = "ANP-D4848";
    
    Student(String name, String id){
        this(name, id, "ANP-D4848");
    }
    
    Student(String name, String id, String Batch_Code){
        this.name = name;
        this.id = id;
        this.Batch_Code = Batch_Code;
        System.out.println("This is a parameterized constructor.");
    }
    
    
    public static void main(String[] args) {
        Student person1 = new Student("Prajwal", "AF05108439");
        System.out.println("Name: " + person1.name);
        System.out.println("ID: " + person1.id);
        System.out.println("Batch Code: " + person1.Batch_Code);
    }
}