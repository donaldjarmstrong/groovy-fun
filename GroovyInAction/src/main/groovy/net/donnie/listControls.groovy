package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/12/12
 * Time: 11:02 PM
 * To change this template use File | Settings | File Templates.
 */
List myList = ['a', 'b', 'c']
assert myList.isCase('a')
assert 'b' in myList

def candidate = 'f'
switch (candidate) {
    case myList: assert true; break //#1 Classify by containment
    default: assert false, 'onPurpose'
}

assert ['x', 'a', 'z'].grep(myList) == ['a'] //#2 Intersection filter

myList = []
if (myList)
    assert false //#3 Empty lists are false

// Lists can be iterated with a 'for' loop
def expr = ''
for (i in [1, '*', 5]) { //#4 for in Collection
    expr += i
}
assert expr == '1*5'