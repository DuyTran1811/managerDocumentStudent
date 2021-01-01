public class DocumentStudent {
    private String className;
    private String courseOfStudy;
    private String semester;
    private Student student;

    public DocumentStudent() {
    }

    public DocumentStudent(String className, String courseOfStudy, String semester, Student student) {
        this.className = className;
        this.courseOfStudy = courseOfStudy;
        this.semester = semester;
        this.student = student;
    }

    public String getClassName() {
        return className;
    }

    public String getCourseOfStudy() {
        return courseOfStudy;
    }

    public String getSemester() {
        return semester;
    }

    public Student getStudent() {
        return student;
    }
}
