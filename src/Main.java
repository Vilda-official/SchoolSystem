public class Main {

    public static void main(String[] args) {
        SchoolSystem system = new SchoolSystem();

        Student s = new Student("123");
        Student s2 = new Student("123");
        Course c = new Course("OOP", "OOP");
        Lecturer l = new Lecturer("Jan");

        system.addStudents(s);
        system.addStudents(s2);
        system.addCourses(c);

        system.addGrade(s, c, 1, l);

        system.addGrade(s, c, 2, l);

        System.out.println("Hotovo");
    }
}
