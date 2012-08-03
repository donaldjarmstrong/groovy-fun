package net.donnie.regex

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/8/12
 * Time: 1:03 PM
 * To change this template use File | Settings | File Templates.
 */
def myFairStringy = 'The rain in Spain stays mainly in the plain!'

// words that end with 'ain': bw*ainb
def wordEnding = /\w*ain/
def rhyme = /\b$wordEnding\b/
def found = ''
myFairStringy.eachMatch(rhyme) { match -> // #1 String.eachMatch(regex){}
    found += match + ' '
}
assert found == 'rain Spain plain '

found = ''
(myFairStringy =~ rhyme).each { match -> // #2 Matcher.each {}
 found += match + ' '
}

assert found == 'rain Spain plain '
def cloze = myFairStringy.replaceAll(rhyme){ it-'ain'+'___' } //#3 String.replaceAll(regex){}
assert cloze == 'The r___ in Sp___ stays mainly in the pl___!'