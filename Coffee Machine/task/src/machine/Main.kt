package machine

const val WATER_PER_ESPRESSO = 250
const val WATER_PER_LATTE = 350
const val WATER_PER_CAPPUCCINO = 200

const val MILK_PER_LATTE = 75
const val MILK_PER_CAPPUCCINO = 100

const val COFFEE_BEANS_PER_ESPRESSO = 16
const val COFFEE_BEANS_PER_LATTE = 20
const val COFFEE_BEANS_PER_CAPPUCCINO = 12

const val PRICE_OF_ESPRESSO = 4
const val PRICE_OF_LATTE = 7
const val PRICE_OF_CAPPUCCINO = 6

fun main() {

    var waterInMachine = 400
    var milkInMachine = 540
    var coffeeBeansInMachine = 120
    var disposableCupsInMachine = 9
    var moneyInMachine = 550

    var exit = false

    while (!exit) {
        var back = false
        print("Write action (buy, fill, take, remaining, exit): > ")
        when (readln()) {
            "buy" -> {
                while (!back) {
                    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: > ")
                    when (readln()) {
                        "1" -> {
                            when {
                                waterInMachine - WATER_PER_ESPRESSO < 0 -> {
                                    println("Sorry, not enough water!\n")
                                    back = true
                                }

                                coffeeBeansInMachine - COFFEE_BEANS_PER_ESPRESSO < 0 -> {
                                    println("Sorry, not enough coffee beans!\n")
                                    back = true
                                }
                                disposableCupsInMachine == 0 -> {
                                    println("Sorry, not enough disposable cups!\n")
                                    back = true
                                }

                                else -> {
                                    println("I have enough resources, making you a coffee!\n")
                                    waterInMachine -= WATER_PER_ESPRESSO
                                    coffeeBeansInMachine -= COFFEE_BEANS_PER_ESPRESSO
                                    disposableCupsInMachine -= 1
                                    moneyInMachine += PRICE_OF_ESPRESSO
                                    back = true
                                }
                            }
                        }

                        "2" -> {
                            when {
                                waterInMachine - WATER_PER_LATTE < 0 -> {
                                    println("Sorry, not enough water!\n")
                                    back = true
                                }
                                milkInMachine - MILK_PER_LATTE < 0 -> {
                                    println("Sorry, not enough milk!\n")
                                    back = true
                                }
                                coffeeBeansInMachine - COFFEE_BEANS_PER_LATTE < 0 -> {
                                    println("Sorry, not enough coffee beans!\n")
                                    back = true
                                }
                                disposableCupsInMachine == 0 -> {
                                    println("Sorry, not enough disposable cups!\n")
                                    back = true
                                }

                                else -> {
                                    println("I have enough resources, making you a coffee!\n")
                                    waterInMachine -= WATER_PER_LATTE
                                    milkInMachine -= MILK_PER_LATTE
                                    coffeeBeansInMachine -= COFFEE_BEANS_PER_LATTE
                                    disposableCupsInMachine -= 1
                                    moneyInMachine += PRICE_OF_LATTE
                                    back = true
                                }
                            }
                        }

                        "3" -> {
                            when {
                                waterInMachine - WATER_PER_CAPPUCCINO < 0 -> {
                                    println("Sorry, not enough water!\n")
                                    back = true
                                }
                                milkInMachine - MILK_PER_CAPPUCCINO < 0 -> {
                                    println("Sorry, not enough milk!\n")
                                    back = true
                                }
                                coffeeBeansInMachine - COFFEE_BEANS_PER_CAPPUCCINO < 0 -> {
                                    println("Sorry, not enough coffee beans!\n")
                                    back = true
                                }
                                disposableCupsInMachine == 0 -> {
                                    println("Sorry, not enough disposable cups!\n")
                                    back = true
                                }

                                else -> {
                                    println("I have enough resources, making you a coffee!\n")
                                    waterInMachine -= WATER_PER_CAPPUCCINO
                                    milkInMachine -= MILK_PER_CAPPUCCINO
                                    coffeeBeansInMachine -= COFFEE_BEANS_PER_CAPPUCCINO
                                    disposableCupsInMachine -= 1
                                    moneyInMachine += PRICE_OF_CAPPUCCINO
                                    back = true
                                }
                            }
                        }

                        "back" -> back = true
                        else -> println("Wrong input, try again.")
                    }
                }
            }

            "fill" -> {
                print("\nWrite how many ml of water do you want to add: > ")
                var temp = readln().toInt()
                waterInMachine += temp

                print("Write how many ml of milk do you want to add: > ")
                temp = readln().toInt()
                milkInMachine += temp

                print("Write how many grams of coffee beans do you want to add: > ")
                temp = readln().toInt()
                coffeeBeansInMachine += temp

                print("Write how many disposable cups of coffee do you want to add: ")
                temp = readln().toInt()
                disposableCupsInMachine += temp
                println()
            }

            "take" -> {
                println("\nI gave You $moneyInMachine")
                moneyInMachine = 0
                println()
            }

            "remaining" -> {
                println(
                    "\nThe coffee machine has:\n" +
                            "$waterInMachine ml of water\n" +
                            "$milkInMachine ml of milk\n" +
                            "$coffeeBeansInMachine g of coffee beans\n" +
                            "$disposableCupsInMachine disposable cups\n" +
                            "\$$moneyInMachine of money\n"
                )

            }

            "exit" -> exit = true
            else -> println("Wrong input, try again.")
        }
    }
}
