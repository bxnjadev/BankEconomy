package account

open class AccountUpdatable(private var balance: Double) {

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