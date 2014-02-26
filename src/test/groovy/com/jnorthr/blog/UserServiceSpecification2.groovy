package com.jnorthr.blog

import spock.lang.Specification
import spock.lang.Unroll

/**
 * = User Service Specification2 extends Specification
 *
 * Spock test framework that include +source code+. 
 *
 * [source,groovy] 
 * --
 *     class UserServiceSpecification2 extends Specification {
 *     private final Asciidoctor asciidoctor = Asciidoctor.Factory.create();
 *
 *     @Unroll("Expect to count #expectedCount users for following list #userList") 
 *     public static boolean start(RootDoc rootDoc) {
 *         new Asciidoclet().render(rootDoc);
 *         return Standard.start(rootDoc);
 *     }
 * }
 * --
 *
 * @author https://github.com/jnorthr[jnorthr] 
 */

class UserServiceSpecification2 extends Specification {

	@Unroll("Expect to count #expectedCount users for following list #userList")
        def "Return total number of users"() {
        setup: 'Create UserService instance with users'
        UserService userService = new UserService(users: userList)

        expect: 'Invoke count() method'
        expectedCount == userService.count()

        where:
        expectedCount   | userList
        0               | null
        0               | []
        1               | ['mrhaki']
        2               | ['mrhaki', 'hubert']
    }

}