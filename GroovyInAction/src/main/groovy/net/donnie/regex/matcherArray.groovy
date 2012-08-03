package net.donnie.regex

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/8/12
 * Time: 1:13 PM
 * To change this template use File | Settings | File Templates.
 */
def matcher = 'a b c' =~ /\S/
assert matcher[0] == 'a'
assert matcher[1..2] == ['b','c']
assert matcher.size() == 3