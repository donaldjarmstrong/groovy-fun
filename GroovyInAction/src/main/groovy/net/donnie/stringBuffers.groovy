package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/8/12
 * Time: 10:23 AM
 * To change this template use File | Settings | File Templates.
 */
def greeting = 'Hello'
greeting <<= ' Groovy' // #1 Leftshift and assign
assert greeting instanceof java.lang.StringBuffer

greeting << '!' //#2 Leftshift on StringBuffer
assert greeting.toString() == 'Hello Groovy!'

greeting[1..4] = 'i' //#3 Substring 'ello' becomes 'i'
assert greeting.toString() == 'Hi Groovy!'

def kid = "donnie"
def kids = ["donnie", "lillie", "audrey"]
def salutation = "Hello ${-> kid}"

kids.each {
    kid = it;
    salutation
    println salutation
}

