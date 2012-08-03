package net.donnie.regex

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/8/12
 * Time: 1:16 PM
 * To change this template use File | Settings | File Templates.
 */
def matcher = 'a:1 b:2 c:3' =~ /(\S+):(\S+)/
assert matcher.hasGroup()
assert matcher[0] == ['a:1', 'a', '1'] // 1st match
assert matcher[1][2] == '2' // 2nd match, 2nd group

matcher.each { full, key, value ->
    assert full.size() == 3; println full
    assert key.size() == 1; println key // a,b,c
    assert value.size() == 1; println value // 1,2,3
}