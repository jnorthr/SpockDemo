package com.jnorthr.blog

import spock.lang.Specification

class UserServiceSpecification extends Specification {

    def "Return total number of users"() {
        setup: 'Create UserService instance with 2 users'
        UserService userService = new UserService(users: ['jnorthr', 'jim'])

        expect: 'Invoke count() method'
        2 == userService.count()
    }

}