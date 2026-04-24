public class Student {

    private String studyNumber;

    Student(String studyNumber) {

        this.studyNumber = studyNumber;
    }

    public String getStudyNumber() {

        return studyNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return studyNumber.equals(s.studyNumber);
    }

    @Override
    public int hashCode() {
        return studyNumber.hashCode();
    }

}
