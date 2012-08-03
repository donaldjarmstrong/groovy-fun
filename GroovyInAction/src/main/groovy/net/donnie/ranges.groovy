package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/2/12
 * Time: 10:50 PM
 * To change this template use File | Settings | File Templates.
 */
def x = 1..10
assert x.contains(5)
assert x.contains(15) == false
assert x.size() == 10
assert x.from == 1
assert x.to == 10
assert x.reverse() == 10..1