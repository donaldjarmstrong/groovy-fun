package net.donnie.regex

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/8/12
 * Time: 2:48 PM
 * To change this template use File | Settings | File Templates.
 */
def fourLetters = ~/\w{4}/
assert fourLetters.isCase('work')
assert 'love' in fourLetters
switch ('beer') {
    case ~/\w{4}/: assert true; break
    default: assert false
}

beasts = ['bear', 'wolf', 'tiger', 'regex']
assert beasts.grep(fourLetters) == ['bear', 'wolf']