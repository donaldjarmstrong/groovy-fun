package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/12/12
 * Time: 11:15 PM
 * To change this template use File | Settings | File Templates.
 */
assert [true] == ['test', 12, 20, true].grep(Boolean), 'Class isInstance'

assert ['Groovy'] == ['test', 'Groovy', 'Java'].grep(~/^G.*/), 'Pattern match'

assert ['b', 'c'] == ['a', 'b', 'c', 'd'].grep(['b', 'c']), 'List contains'

assert [15, 16, 12] == [1, 15, 16, 30, 12].grep(12..18), 'Range contains'

assert [42.031] == [12.300, 109.20, 42.031, 42.032].grep(42.031), 'Object equals'

assert [100, 200] == [10, 20, 30, 50, 100, 200].grep({ it > 50 }), 'Closure boolean'