package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/2/12
 * Time: 10:49 PM
 * To change this template use File | Settings | File Templates.
 */
def http = [
        100 : 'CONTINUE',
        200 : 'OK',
        400 : 'BAD REQUEST'
]

assert http[200] == 'OK'

http[500] = 'INTERNAL SERVER ERROR'

assert http.size() == 4

