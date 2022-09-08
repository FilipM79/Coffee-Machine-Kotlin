package machine

val water = Storage.WATER
val milk = Storage.MILK
val coffeeBeans = Storage.COFFEE_BEANS
val disposableCups = Storage.DISPOSABLE_CUPS
val money = Storage.MONEY

class Service {

    fun fill() {
        print("\nWrite how many ml of water do you want to add: > ")
        water.inMachine += readln().toInt()

        print("Write how many ml of milk do you want to add: > ")
        milk.inMachine += readln().toInt()

        print("Write how many grams of coffee beans do you want to add: > ")
        coffeeBeans.inMachine += readln().toInt()

        print("Write how many disposable cups of coffee do you want to add: ")
        disposableCups.inMachine += readln().toInt()
        println()

    }

    fun take() {
        println("\nI gave You ${money.inMachine}\n")
        money.inMachine = 0
    }

    fun remaining() {
        println(
            "\nThe coffee machine has:\n" +
            "${water.inMachine} ml of water\n" +
            "${milk.inMachine} ml of milk\n" +
            "${coffeeBeans.inMachine} g of coffee beans\n" +
            "${disposableCups.inMachine} disposable cups\n" +
            "\$${money.inMachine} of money\n"
        )
    }
}

class Coffee {

    fun buy (input: String): Boolean {

        var waterPerType = 0
        var milkPerType = 0
        var coffeeBeansPerType = 0
        var moneyPerType = 0
        var wrongInput = false

        when (input) {
            "1" -> {
                waterPerType = water.forEspresso
                milkPerType = milk.forEspresso
                coffeeBeansPerType = coffeeBeans.forEspresso
                moneyPerType = money.forEspresso
            }

            "2" -> {
                waterPerType = water.forLatte
                milkPerType = milk.forLatte
                coffeeBeansPerType = coffeeBeans.forLatte
                moneyPerType = money.forLatte
            }

            "3" -> {
                waterPerType = water.forCappuccino
                milkPerType = milk.forCappuccino
                coffeeBeansPerType = coffeeBeans.forCappuccino
                moneyPerType = money.forCappuccino
            }

            "back" -> return true

            else -> {
                println("Wrong input, try again.")
                wrongInput = true
            }

        }

        when {

            wrongInput -> return false

            water.inMachine - waterPerType < 0 -> {
                println("Sorry, not enough water!\n")
                return true
            }
            milk.inMachine - milkPerType < 0 -> {
                println("Sorry, not enough milk!\n")
                return true
            }
            coffeeBeans.inMachine - coffeeBeansPerType < 0 -> {
                println("Sorry, not enough coffee beans!\n")
                return true
            }
            disposableCups.inMachine == 0 -> {
                println("Sorry, not enough disposable cups!\n")
                return true
            }
            else -> {
                println("I have enough resources, making you a coffee!\n")
                water.inMachine -= waterPerType
                milk.inMachine -= milkPerType
                coffeeBeans.inMachine -= coffeeBeansPerType
                disposableCups.inMachine -= 1
                money.inMachine += moneyPerType
                return true
            }
        }
    }
}