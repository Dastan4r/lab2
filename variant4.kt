import kotlin.math.*

fun main () {
    var y = 0.025;
    var x = 0.335;

    var4calcS(x);
    var4calcF(x, y);
}

fun var4calcS(x: Double) : Double {
    return 1 + x + (x.pow(2) / 2) + (x.pow(3) / 6) + (x.pow(4) / 24);
}

fun var4calcF(x: Double, y: Double) : Double {
    return x * (sin(x.pow(3)) + ((1 + cos(2 * y)) / 2))
}
