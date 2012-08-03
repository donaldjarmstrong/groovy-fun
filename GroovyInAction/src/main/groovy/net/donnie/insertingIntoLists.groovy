package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/12/12
 * Time: 10:56 PM
 * To change this template use File | Settings | File Templates.
 */
List myList = []
myList += 'a' //#1 plus(Object)
assert myList == ['a']

myList += ['b','c'] //#2 plus(Collection)
assert myList == ['a','b','c']

myList = []
myList << 'a' << 'b' //#3 leftShift is like append
assert myList == ['a','b']
assert myList - ['b'] == ['a'] //#4
assert myList * 2 == ['a','b','a','b'] //#5

def fredList = myList
3.times { fredList += myList * 2 }
assert fredList == ['a', 'b', 'a', 'b', 'a', 'b', 'a', 'b', 'a', 'b', 'a', 'b', 'a', 'b']