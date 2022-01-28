package account

class Account(private var id : String,
              private var name : String,
              balance : Double) : AccountUpdatable(balance) {

    fun getId() : String {
        return id;
    }

    fun getName() : String {
        return name;
    }

}