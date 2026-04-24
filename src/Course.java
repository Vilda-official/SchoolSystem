public class Course {

    private String code;
    private String title;

    Course (String code, String title) {

        this.code = code;
        this.title = title;
    }

    public String getCode() {

        return code;
    }

    public String getTitle() {

        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course c = (Course) o;
        return code.equals(c.code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }

}
