import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SchoolSystem {


    private Set<Student> students = new HashSet<>();
    private Set<Course> courses = new HashSet<>();
    private List<Grade> grades = new ArrayList<>();

    public Set<Student> getStudents() {
        return students;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public void addStudents(Student s) {
        students.add(s);
    }

    public void addCourses(Course c) {
        courses.add(c);
    }

    public boolean addGrade(Student student, Course course, int value, Lecturer lecturer) {

        for (Grade g : grades) {
            if (g.getStudent().equals(student) &&
                    g.getCourse().equals(course)) {
                return false;
            }
        }

        Grade grade = new Grade(value, student, course, lecturer);
        grades.add(grade);
        return true;
    }



}