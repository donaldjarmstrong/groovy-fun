package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/12/12
 * Time: 10:06 PM
 * To change this template use File | Settings | File Templates.
 */
class Weekday implements Comparable {
    static final DAYS = [
        'Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'
    ]

    private int idx = 0

    Weekday(index) {
            idx = index
    } // #1 Allow all values

    Weekday next() {
        new Weekday(idx+1)
    } // #2 Range bound methods

    Weekday previous() {
        new Weekday(idx-1)
    } // #2

    int compareTo(Object other) {
        this.idx <=> other.idx
    } // #2

    String toString() {
        def index = idx % DAYS.size()
        while (index < 0) index += DAYS.size()
        DAYS[index]
    }
}

def mon = new Weekday(1)
def fri = new Weekday(5)
def report = ''
for (day in mon..fri) { // #3 Working through the week
    report += day.toString() + ' '
}
assert report == 'Mon Tue Wed Thu Fri '

7.times { mon++ }
def diary = 'no work on '
for (day in ++fri ..< mon) { // #4 Enjoying the weekend
diary += day.toString() + ' ' }
assert diary == 'no work on Sat Sun '