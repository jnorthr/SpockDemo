package com.jnorthr.blog

/**
 * = User Service
 *
 * Sample comments that include +source code+. 
 *
 * [source,java] 
 * --
 * public class UserService {
 *     private final Asciidoctor asciidoctor = Asciidoctor.Factory.create();
 *
 *     @SuppressWarnings("UnusedDeclaration") 
 *     public static boolean start(RootDoc rootDoc) {
 *         new Asciidoclet().render(rootDoc);
 *         return Standard.start(rootDoc);
 *     }
 * }
 * --
 *
 * @author https://github.com/jnorthr[jnorthr] 
 */
class UserService {

    Collection<String> users

    int count() {
        users ? users.size() : 0
    }

}