package hw;

public class Account {
    private Long number;
    private Long amount;

    public Account(Long number, Long amount) {
        this.number = number;
        this.amount = amount;
    }

    public Long getNumber() {
        return number;
    }

    public Long getAmount() {
        return amount;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account(number: " + number + ", amount: " + amount + ")";
    }

    @Override
    public int hashCode() {
        int numberHash = number == null ? 0 : number.hashCode();
        int amountHash = amount == null ? 0 : amount.hashCode();

        return numberHash + amountHash;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (getClass() != other.getClass()) return false;

        Account otherAccount = (Account) other;
        return this.number == otherAccount.number && this.amount == otherAccount.amount;
    }
}
