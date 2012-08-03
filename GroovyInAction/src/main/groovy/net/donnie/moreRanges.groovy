package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/12/12
 * Time: 9:54 PM
 * To change this template use File | Settings | File Templates.
 */
def result = ''             //|#1 Range for iteration
(5..9).each { element ->    //|#1
    result += element       //|#1
}
assert result == '56789' //|#1

assert 5 in 0..10 //|#2 Range for classification
assert (0..10).isCase(5) //|#2

def age = 36 //|#2
switch(age){ //|#2
    case 16..20 : insuranceRate = 0.05 ; break //|#2
    case 21..50 : insuranceRate = 0.06 ; break //|#2
    case 51..65 : insuranceRate = 0.07 ; break //|#2
    default: throw new IllegalArgumentException() //|#2
} //|#2
assert insuranceRate == 0.06    //|#2

def ages = [20, 36, 42, 56]             //|#3 Range as filter
def midage = 21..50                     //|#3
assert ages.grep(midage) == [36, 42]    //|#3