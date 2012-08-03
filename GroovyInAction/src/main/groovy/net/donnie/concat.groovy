package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/2/12
 * Time: 11:06 PM
 * To change this template use File | Settings | File Templates.
 */
def code = '1 + '
code += System.getProperty('java.class.version')
assert code == '1 + 51.0'

assert 52.0 == evaluate(code)