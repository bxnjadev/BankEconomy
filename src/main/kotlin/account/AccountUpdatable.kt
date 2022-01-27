package account

open class AccountUpdatable(balance: Double) {

    private var balance: Double;

    init {
        this.balance = balance;
    }

    fun deposit(balance: Double) {
        this.balance = this.balance + balance;
    }

    fun withdraw(balance: Double) {
        this.balance = this.balance - balance;
    }

    fun set(balance: Double) {
        this.balance = balance;
    }

    fun getBalance() : Double {
        return balance;
    }

}