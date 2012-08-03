package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/12/12
 * Time: 10:12 PM
 * To change this template use File | Settings | File Templates.
 */
enum Month {
    Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec
}

assert (Month.Jan..Month.Mar).isCase(Month.Feb)
assert Month.Feb in (Month.Jan..Month.Mar)

def noClams = Month.May .. Month.Aug
def thisMonth = Month.Aug
boolean iWarnedYou = false
if (thisMonth in noClams) { // #1 'in' operator
    println "Don't eat clams this month,"
    println "it has no 'r' in its name!"
    iWarnedYou = true
}
assert iWarnedYou