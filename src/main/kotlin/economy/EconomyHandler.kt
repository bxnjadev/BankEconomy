package economy

import account.Account

interface EconomyHandler {

    fun createAccount(name : String, initialBalance : Double): Account;

    fun deleteAccount(id : String): Boolean;

    fun update(account : Account);

    fun get(id : String) : Account;

    fun deleteAccountByName(name : String) : Boolean;

    fun deposit(id : String, amount : Double);

    fun withdraw(id : String, amount : Double);

    fun set(id : String, amount : Double);

}