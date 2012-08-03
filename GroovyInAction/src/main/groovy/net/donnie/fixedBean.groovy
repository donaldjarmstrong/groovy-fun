package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 6/25/12
 * Time: 10:46 PM
 * To change this template use File | Settings | File Templates.
 */
@Immutable class FixedBook {
    String title
}

def gina = new FixedBook('Groovy in Action')
def regina = new FixedBook(title: 'Groovy in Action')

assert gina.title == 'Groovy in Action'
assert gina == regina

try {
    gina.title = "Oops!"
    assert false, "should not reach here"
} catch (ReadOnlyPropertyException e) {
}
