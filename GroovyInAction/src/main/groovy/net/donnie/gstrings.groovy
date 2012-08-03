package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/7/12
 * Time: 11:50 PM
 * To change this template use File | Settings | File Templates.
 */
def me = 'Tarzan'                       //|#1 Abbreviated
def you = 'Jane'                        //|#1 dollar syntax
def line = "me $me - you $you"          //|#1
assert line == 'me Tarzan - you Jane'   //|#1

def date = new Date(0)                                          //|#2 Extended
def out = "Year $date.year Month $date.month Day $date.date"    //|#2 abbreviation
assert out == 'Year 69 Month 11 Day 31'                           //|#2

out = "Date is ${date.toGMTString()} !"                         //|#3 Full syntax with
assert out == 'Date is 1 Jan 1970 00:00:00 GMT !'               //|#3 curly braces

//#4 Multiline GStrings start
def sql = """
    SELECT *
      FROM MyTable
     WHERE Year = $date.year """

assert sql == """
    SELECT *
      FROM MyTable
     WHERE Year = 69 """
//#4 Multiline GStrings end

out = "my 0.02\$" //|#5 Literal dollar sign
assert out == 'my 0.02$' //|#5