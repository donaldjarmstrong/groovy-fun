package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/8/12
 * Time: 3:25 PM
 * To change this template use File | Settings | File Templates.
 */
def store = ''
10.times{ // #1 Repetition
    store += 'x'
}
assert store == 'xxxxxxxxxx'

store = ''
1.upto(5) { number -> // #2 Walking up with loop variable
    store += number
}
assert store == '12345'

store = ''
2.downto(-2) { number -> // #3 Walking down
    store += number + ' '
}
assert store == '2 1 0 -1 -2 '

store = ''
0.step(0.5, 0.1 ){ number -> // #4 Walking with step width
    store += number + ' '
}
assert store == '0 0.1 0.2 0.3 0.4 '