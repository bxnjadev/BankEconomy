package economy

import account.Account
import cache.LocalCache
import http.AsyncHttpHandler
import http.HttpHandler

class EconomyAccountProvider {

    private val localCache: LocalCache<String, Account> = LocalCache();
    private val httpHandler : HttpHandler<Account> = AsyncHttpHandler("economybank.net/api/", Account::class.java);

    fun get(id: String): Account {
        val account = getIsLoaded(id);

        if (account != null) {
            return  account;
        }

        return httpHandler.get(id, "/get/");
    }

    private fun getIsLoaded(id: String): Account? {
        return localCache.get(id);
    }

}