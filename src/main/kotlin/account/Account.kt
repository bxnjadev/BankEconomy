package account

class Account(id : String,
              name : String,
              balance : Double) : AccountUpdatable(balance) {

    private var id : String;
    private var name : String;

    init {
        this.id = id;
        this.name = name;
    }

    fun getId() : String {
        return id;
    }

    fun getName() : String {
        return name;
    }

}