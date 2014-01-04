class CourseService {
    Course create(String teacherName, String description) {
        new Course(teacher: new Person(name: teacherName), description: description)
    }
}

class Course {
    Person teacher
    String description
    List<Person> students
}

class Person {
    String name
}