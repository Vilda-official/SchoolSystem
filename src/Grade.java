import java.time.LocalDateTime;

public class Grade {

    private int value;
    private Lecturer lecturer;
    private LocalDateTime date;
    private Student student;
    private Course course;

    public Grade(int value, Student student, Course course, Lecturer lecturer) {

        this.value = value;
        this.student = student;
        this.course = course;
        this.lecturer = lecturer;
        this.date = LocalDateTime.now();
    }

    public int getValue() {return value;}
    public Student getStudent() {return student;}
    public Course getCourse() {return course;}
    public Lecturer getLecturer() {return lecturer;}
    public LocalDateTime getDate() {return date;}





}


