package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/2/12
 * Time: 10:51 PM
 * To change this template use File | Settings | File Templates.
 */
int totalClinks = 0
int partyPeople = 100
1.upto(partyPeople) { guestNumber ->
    clinksWithGuest = guestNumber - 1
    totalClinks += clinksWithGuest
}
assert totalClinks == (partyPeople * (partyPeople - 1)) / 2


1.upto 10,  { it ->
    println "${it} lovin it upto"
}

1..10.each { it ->
    println "${it} lovin it each"
}

