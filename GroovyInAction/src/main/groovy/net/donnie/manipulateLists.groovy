package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/19/12
 * Time: 5:55 PM
 * To change this template use File | Settings | File Templates.
 */
assert [1, [2, 3]].flatten() == [1, 2, 3]
assert [1, 2, 3].intersect([4, 3, 1]) == [3, 1]
assert [1, 2, 3].disjoint([4, 5, 6])
assert [1, 2, 3].intersect([4, 5, 6]).empty

List bar = [1,2,3]
def foo = [4,5,6]
def foobar =  [*bar, *foo]
assert  foobar == [1,2,3,4,5,6]

//#1 List as Stack
List list = [1, 2]
list.push 3
assert list == [1, 2, 3]
popped = list.pop()
assert popped == 3
assert list == [1, 2]

assert [1, 2].reverse() == [2, 1]
assert [3, 1, 2].sort() == [1, 2, 3]

//#2 Sort by size
def kings = ['Dierk', 'Paul']
kings = kings.sort {
    item -> item.size()
}
assert kings == ['Paul', 'Dierk']

//#3 Reverse sort by first char
kings.sort {
    a, b -> b[0] <=> a[0]
}
assert kings == ['Paul', 'Dierk']

//#4 Remove by index
list = ['a', 'b', 'c']
list.remove(2)
assert list == ['a', 'b']

//#5 Remove by value
list.remove('b')
assert list == ['a', 'b'] - 'b'

//#6 Remove all
list = ['a', 'b', 'b', 'c']
list.removeAll(['b', 'c'])
assert list == ['a', 'b', 'b', 'c'] - ['b', 'c']

//#7 Converting
list == ['a', 'b', 'b', 'c'] - ['b', 'c']
def doubled = [1, 2, 3].collect {
    item -> item * 2
}
assert doubled == [2, 4, 6]

def squares = [0, 1, 4]
[3, 4, 5].collect(squares) {
    item -> item * item
}
assert squares == [0, 1, 4, 9, 16, 25]

//#8 Filtering
def odd = [1, 2, 3].findAll {
    item -> item % 2 == 1
}
assert odd == [1, 3]

assert 1 == [1, 2, 1].find {
    it % 2 == 1
}