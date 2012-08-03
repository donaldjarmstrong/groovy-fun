package net.donnie.regex

import java.util.regex.Matcher

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/8/12
 * Time: 12:36 PM
 * To change this template use File | Settings | File Templates.
 */
def twister = 'she sells sea shells at the sea shore of seychelles'

// twister must contain a substring of size 3
// that starts with s and ends with a
assert twister =~ /s.a/                             // #1 Regex find operator as

Matcher finder = (twister =~ /s.a/)                     // #2 Find expression evaluates
assert finder instanceof java.util.regex.Matcher    // #2 matcher object

// twister must contain only words delimited by single spaces
assert twister ==~ /(\w+ \w+)*/                       // #3 Regex match operator

def WORD = /\w+/
matches = (twister ==~ /($WORD $WORD)*/)                // #4 Match expression evaluates
assert matches instanceof java.lang.Boolean                 // #4 to a boolean

assert (twister ==~ /s.e/) == false                         // #5 Match is full unlike find
def wordsByX = twister.replaceAll(WORD, 'x')
assert wordsByX == 'x x x x x x x x x x'

def words = twister.split(/ /)                              // #6 Split returns a list of
assert words.size() == 10
assert words[0] == 'she'