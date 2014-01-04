// see: http://mrhaki.blogspot.fr/2010/07/spock-spotlight-assert-magic.html
import spock.lang.Specification

class CourseServiceSpec extends Specification {

    def "Create new course with teacher and description"() {
        setup:
        def courseService = new CourseService()

        when:
        def course = courseService.create('mrhaki', 'Groovy Goodness')

        then:
        assertCourse course
    }

    private void assertCourse(course) {
        assert 'mrhaki' == course.teacher.name
        assert 'Grails Goodness' == course.description
        assert !course.students
    }

}
