package Problem3;

public class Money {
    private long dollars;
    private int cents;

    public Money(long dollars, int cents) {
        if (cents >= 100) {
            dollars += cents / 100;
            cents = cents % 100;
        }
        this.dollars = dollars;
        this.cents = cents;
    }

    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    public long getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    public Money add(Money other) {
        long newDollars = this.dollars + other.dollars;
        int newCents = this.cents + other.cents;
        return new Money(newDollars, newCents);
    }

    public Money subtract(Money other) {
        long newDollars = this.dollars - other.dollars;
        int newCents = this.cents - other.cents;
        if (newCents < 0) {
            newCents += 100;
            newDollars -= 1;
        }
        return new Money(newDollars, newCents);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return dollars == money.dollars && cents == money.cents;
    }

    public int compareTo(Money other) {
        if (this.dollars != other.dollars) {
            return Long.compare(this.dollars, other.dollars);
        }
        return Integer.compare(this.cents, other.cents);
    }

    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
