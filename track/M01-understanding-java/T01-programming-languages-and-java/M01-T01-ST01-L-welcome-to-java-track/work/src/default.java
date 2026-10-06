class Course {
    String name;

    Course() {
        // assign Java
        name = "Java";
    }
}

public class default {
    public static void main(String[] args) {
        // create object
        Course course = new Course();

        // print name
        System.out.println(course.name);
    }
}
