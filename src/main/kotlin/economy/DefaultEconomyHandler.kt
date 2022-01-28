package economy

import account.Account

class DefaultEconomyHandler : EconomyHandler {

    override fun createAccount(name: String, initialBalance: Double): Account {
        TODO("Not yet implemented")
    }

    override fun deleteAccount(id: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun update(account: Account) {
        TODO("Not yet implemented")
    }

    override fun get(id: String): Account {
        TODO("Not yet implemented")
    }

    override fun deleteAccountByName(name: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun deposit(id: String, amount: Double) {
        TODO("Not yet implemented")
    }

    override fun withdraw(id: String, amount: Double) {
        TODO("Not yet implemented")
    }

    override fun set(id: String, amount: Double) {
        TODO("Not yet implemented")
    }

}