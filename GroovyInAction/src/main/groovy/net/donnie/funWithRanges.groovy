package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/11/12
 * Time: 11:19 PM
 * To change this template use File | Settings | File Templates.
 */
assert (0..10).contains(0)  //|#1 Inclusive range
assert (0..10).contains(5)  //|#1
assert (0..10).contains(10) //|#1
assert (0..10).contains(-1) == false //|#1
assert (0..10).contains(11) == false  //|#1

assert (0..<10).contains(9) //|#2 Half-exclusive range
assert (0..<10).contains(10) == false //|#2

def a = 0..10 //|#3 Reference to range
assert a instanceof Range //|#3
assert a.contains(5)      //|#3

a = new IntRange(0,10) //|#4 Explicit construction
assert a.contains(5)    //|#4

assert (0.0..1.0).contains(0.5) == false // #5 Containment

assert (0.0..1.0).containsWithinBounds(0.5) // #6 Bounds

def today = new Date()
def yesterday = today-1
assert (yesterday..today).size() == 2 // #7 Date range

assert ('a'..'c').contains('b') // #8 String range

def store = ''
for (element in 5..9) { // #9 for in range loop
    store += element
}
assert store == '56789'
store = ''
for (element in 9..5) { // #10 Reverse loop
    store += element
}

assert store == '98765'
store = ''
(9..<5).each { element -> // #11 Reverse range, each
    store += element
}
assert store == '9876'

