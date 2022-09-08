package machine

enum class Storage (var inMachine: Int, val forEspresso: Int, val forLatte: Int, val forCappuccino: Int) {
    WATER(inMachine = 400, forEspresso = 250, forLatte = 350, forCappuccino = 200),
    MILK(inMachine = 540, forEspresso = 0, forLatte = 75, forCappuccino = 100),
    COFFEE_BEANS(inMachine = 120, forEspresso = 16, forLatte = 20, forCappuccino = 12),
    DISPOSABLE_CUPS(inMachine = 9, forEspresso = 1, forLatte = 1, forCappuccino = 1),
    MONEY(inMachine = 550, forEspresso = 4, forLatte = 7, forCappuccino = 6)
}