package CIE_1.StudentManagement;

public class StudentCourses {

    private String semester;
    private String[] courses;
    private int[] marks;

    public StudentCourses(String semester, String[] courses, int[] marks) {
        this.semester = semester;
        this.courses = courses;
        this.marks = marks;
    }

    public void displayCoursesAndMarks() {
        System.out.println("Semester: " + semester);
        System.out.println("Courses and Marks:");

        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i] + ": " + marks[i]);
        }
    }

    public static void main(String[] args) {
        String[] courses = { "Maths", "Science", "History" };
        int[] marks = { 90, 85, 88 };

        StudentCourses studentCourses = new StudentCourses("Spring 2024", courses, marks);
        studentCourses.displayCoursesAndMarks();
    }
}
