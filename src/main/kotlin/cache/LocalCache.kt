package cache

class LocalCache<K, V> {

    private var cache: MutableMap<K, V> = mutableMapOf();

    fun put(key: K, value: V) {
        cache[key] = value;
    }

    fun remove(key: K) {
        cache.remove(key);
    }

    fun get(key: K): V? {
        return cache[key];
    }

    fun exists(key: K): Boolean {
        return cache.containsKey(key);
    }

}