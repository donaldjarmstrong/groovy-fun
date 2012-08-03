package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/12/12
 * Time: 10:46 PM
 * To change this template use File | Settings | File Templates.
 */
def myList = ['a', 'b', 'c', 'd', 'e', 'f']
assert myList[0..2] == ['a', 'b', 'c'] //#1 getAt(Range)

assert myList[0, 2, 4] == ['a', 'c', 'e'] //#2 getAt(collection of indexes)

myList[0..2] = ['x', 'y', 'z'] //#3 putAt(Range)
assert myList == ['x', 'y', 'z', 'd', 'e', 'f']

myList[3..5] = [] //#4 Removing a sublist
assert myList == ['x', 'y', 'z']

myList[1..1] = [0, 1, 2] //#5 Inserting a sublist
assert myList == ['x', 0, 1, 2, 'z']

def yourList = ['x', 'y', 'z']
yourList[1] = [0, 1, 2] //#5 Inserting a list
assert yourList == ['x', [0, 1, 2], 'z']

def cutList = ['a', 'b', 'c', 'd', 'e', 'f']
assert cutList[1..-2] == ['b','c','d','e']

assert cutList.last() == cutList[-1]

assert cutList[-6] == cutList.first()

