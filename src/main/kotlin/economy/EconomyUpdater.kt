package economy

interface EconomyUpdater {

    fun update(id : String, amount : Double, method : EconomyUpdateMethod);

}