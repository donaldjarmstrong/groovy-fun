package net.donnie

/**
 * Created with IntelliJ IDEA.
 * User: dad
 * Date: 7/7/12
 * Time: 11:30 PM
 * To change this template use File | Settings | File Templates.
 */
@Immutable
class Money { // #1 overrides == operator
    int amount
    String currency

    Money plus(Money other) { // #2 implements + operator
        if (null == other) return this
        if (other.currency != currency) {
            throw new IllegalArgumentException(
                    "cannot add $other.currency to $currency")
        }
        return new Money(amount + other.amount, currency)
    }
}

Money buck = new Money(1, 'USD')

assert buck
assert buck == new Money(1, 'USD') // #3 use overridden ==
assert buck + buck == new Money(2, 'USD') // #4 use implemented +