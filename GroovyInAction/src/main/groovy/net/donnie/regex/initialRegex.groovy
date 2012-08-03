package net.donnie.regex

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/8/12
 * Time: 12:24 PM
 * To change this template use File | Settings | File Templates.
 */
assert "abc" == /abc/
assert "d" == /d/
def reference = "hello"
assert reference == (/$reference/)   //yo
assert "\$" == /$/