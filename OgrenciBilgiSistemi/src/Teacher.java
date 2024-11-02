public class Teacher {
    String name;
    String phone;
    String branch;
    Teacher(String name, String phone, String branch) {
        this.name = name;
        this.phone = phone;
        this.branch = branch;
    }
    void print() {
        System.out.println("Teacher Name : "+this.name);
        System.out.println("Teacher Phone : "+this.phone);
        System.out.println("Teacher Branch : "+this.branch);
    }
}