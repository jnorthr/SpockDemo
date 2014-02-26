package com.jnorthr.blog
// see mrhaki post on testing at : http://mrhaki.blogspot.fr/2010/06/spock-spotlight-introduction-to-spock.html
import spock.lang.Specification

class UserServiceSpecification extends Specification {

    def "Return total number of users"() {
        setup: 'Create UserService instance with 2 users'
        UserService userService = new UserService(users: ['mrhaki', 'hubert'])

        expect: 'Invoke count() method'
        2 == userService.count()
    }

}