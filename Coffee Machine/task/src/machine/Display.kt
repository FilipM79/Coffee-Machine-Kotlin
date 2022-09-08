package machine

class Display {

    fun activate() {
        val service = Service()
        var exit = false

        while (!exit) {
            var back = false
            print("Write action (buy, fill, take, remaining, exit): > ")

            when (readln()) {
                "buy" -> {
                    while (!back) {
                        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: > ")
                        val coffee = Coffee()
                        back = coffee.buy(readln())
                    }
                }
                "fill" -> service.fill()
                "take" -> service.take()
                "remaining" -> service.remaining()
                "exit" -> exit = true
                else -> println("Wrong input, try again.")
            }
        }
    }
}