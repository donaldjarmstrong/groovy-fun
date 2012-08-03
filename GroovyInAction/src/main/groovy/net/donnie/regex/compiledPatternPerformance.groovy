package net.donnie.regex

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/8/12
 * Time: 2:40 PM
 * To change this template use File | Settings | File Templates.
 */
def twister = 'she sells sea shells at the sea shore of seychelles'
// some more complicated regex:
// word that starts and ends with same letter

def regex = /\b(\w)\w*1\b/
def many = 100 * 1000

start = System.nanoTime()
many.times {
    twister =~ regex // #1 Find operator with implicit pattern construction
}
timeImplicit = System.nanoTime() - start

start = System.nanoTime()
pattern = ~regex // #2 Explicit pattern construction
many.times{
pattern.matcher(twister) // #3 Apply pattern on a string
}
timePredef = System.nanoTime() - start
assert timeImplicit > timePredef * 2 // #4 up to factor 5