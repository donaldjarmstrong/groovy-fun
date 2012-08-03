package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 6/25/12
 * Time: 9:07 PM
 * To change this template use File | Settings | File Templates.
 */
Book gina = new Book('Groovy in Action')
assert gina.getTitle() == 'Groovy in Action'
assert getTitleBackwards(gina) == 'noitcA ni yvoorG'

String getTitleBackwards(book) {
    String title = book.getTitle()
    return title.reverse()
}