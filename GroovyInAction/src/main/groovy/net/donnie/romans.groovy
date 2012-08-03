package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/2/12
 * Time: 10:48 PM
 * To change this template use File | Settings | File Templates.
 */
def roman = ['', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII']
assert roman[4] == 'IV'
roman[8] = 'VIII'
assert roman.size() == 9