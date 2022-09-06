package machine

const val WATER_PER_ESPRESSO = 250
const val WATER_PER_LATTE = 350
const val WATER_PER_CAPPUCCINO = 200

const val MILK_PER_ESPRESSO = 0
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

    println("The coffee machine has:\n" +
        "$waterInMachine ml of water\n" +
        "$milkInMachine ml of milk\n" +
        "$coffeeBeansInMachine g of coffee beans\n" +
        "$disposableCupsInMachine disposable cups\n" +
        "\$$moneyInMachine of money\n"
    )

    print("Write action (buy, fill, take): > ")
    val action = readln()
    val choiceOfCoffee: String


    when (action) {
        "buy" -> {

            print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: > ")
            choiceOfCoffee = readln()

            when (choiceOfCoffee) {
                "1" -> {
                    waterInMachine -= WATER_PER_ESPRESSO
                    milkInMachine -= MILK_PER_ESPRESSO
                    coffeeBeansInMachine -= COFFEE_BEANS_PER_ESPRESSO
                    disposableCupsInMachine -= 1
                    moneyInMachine += PRICE_OF_ESPRESSO

                    println("\nThe coffee machine has:\n" +
                            "$waterInMachine ml of water\n" +
                            "$milkInMachine ml of milk\n" +
                            "$coffeeBeansInMachine g of coffee beans\n" +
                            "$disposableCupsInMachine disposable cups\n" +
                            "\$$moneyInMachine of money\n"
                    )
                }

                "2" -> {
                    waterInMachine -= WATER_PER_LATTE
                    milkInMachine -= MILK_PER_LATTE
                    coffeeBeansInMachine -= COFFEE_BEANS_PER_LATTE
                    disposableCupsInMachine -= 1
                    moneyInMachine += PRICE_OF_LATTE

                    println("\nThe coffee machine has:\n" +
                            "$waterInMachine ml of water\n" +
                            "$milkInMachine ml of milk\n" +
                            "$coffeeBeansInMachine g of coffee beans\n" +
                            "$disposableCupsInMachine disposable cups\n" +
                            "\$$moneyInMachine of money\n"
                    )
                }

                "3" -> {
                    waterInMachine -= WATER_PER_CAPPUCCINO
                    milkInMachine -= MILK_PER_CAPPUCCINO
                    coffeeBeansInMachine -= COFFEE_BEANS_PER_CAPPUCCINO
                    disposableCupsInMachine -= 1
                    moneyInMachine += PRICE_OF_CAPPUCCINO

                    println("\nThe coffee machine has:\n" +
                            "$waterInMachine ml of water\n" +
                            "$milkInMachine ml of milk\n" +
                            "$coffeeBeansInMachine g of coffee beans\n" +
                            "$disposableCupsInMachine disposable cups\n" +
                            "\$$moneyInMachine of money\n"
                    )
                }
            }
        }

        "fill" -> {
            print("Write how many ml of water do you want to add: > ")
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

            println("\nThe coffee machine has:\n" +
                    "$waterInMachine ml of water\n" +
                    "$milkInMachine ml of milk\n" +
                    "$coffeeBeansInMachine g of coffee beans\n" +
                    "$disposableCupsInMachine disposable cups\n" +
                    "\$$moneyInMachine of money\n"
            )
        }

        "take" -> {
            println("I gave You $moneyInMachine")
            moneyInMachine = 0

            println("\nThe coffee machine has:\n" +
                    "$waterInMachine ml of water\n" +
                    "$milkInMachine ml of milk\n" +
                    "$coffeeBeansInMachine g of coffee beans\n" +
                    "$disposableCupsInMachine disposable cups\n" +
                    "\$$moneyInMachine of money\n"
            )
        }
    }


//    print("Write how many ml of water the coffee machine has: > ")
//    val water = readln().toInt()
//    print("Write how many ml of milk the coffee machine has: > ")
//    val milk = readln().toInt()
//    print("Write how many grams of coffee beans the coffee machine has: > ")
//    val coffeeBeans = readln().toInt()
//    print("Write how many cups of coffee you will need: > ")
//    val cups = readln().toInt()
//
//    val cupsInWater = water / 200               // 200ml of water is needed for 1 cup of coffee
//    val cupsInMilk = milk / 50                  // 50ml of milk is needed for 1 cup of coffee
//    val cupsInCoffeeBeans = coffeeBeans / 15    // 15g of CoffeeBeans is needed for 1 cup of coffee
//
//    val maxNumOfCups: Int =
//            if (cupsInWater - cups <= cupsInMilk - cups && cupsInWater - cups <= cupsInCoffeeBeans - cups) {
//                cupsInWater
//            } else if (cupsInMilk - cups < cupsInWater - cups && cupsInMilk - cups < cupsInCoffeeBeans - cups) {
//                cupsInMilk
//            } else {
//                cupsInCoffeeBeans
//            }
//
//    println(maxNumOfCups)
//
//    if (maxNumOfCups == cups) {
//        println("Yes, I can make that amount of coffee")
//    } else if (maxNumOfCups > cups) {
//        println("Yes, I can make that amount of coffee (and even ${maxNumOfCups - cups} more than that)")
//    } else {
//        println("No, I can make only $maxNumOfCups cups of coffee")
//    }

}
