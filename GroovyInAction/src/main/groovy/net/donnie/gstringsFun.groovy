package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 6/25/12
 * Time: 10:52 PM
 * To change this template use File | Settings | File Templates.
 */
def nick = 'ReGina'
def book = 'Groovy in Action, 2nd ed.'
assert "$nick is $book" == 'ReGina is Groovy in Action, 2nd ed.'

assert '12345' =~ /\d+/

assert 'xxxxx' == '12345'.replaceAll(/\d/, 'x')

def deepest = {-> "deepest"}
def deep = {-> "deeper and $deepest"}
println "how deep is deep? $deep"

// which is equivalent to:
println "how deep is deep? ${{-> "deeper and ${{-> "deepest"}}"}}" // for demonstrating it is a nested usage only