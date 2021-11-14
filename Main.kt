import kotlin.math.*;

fun main () {
    var a: Double = 0.7;
    var b: Double = 0.05;
    var x: Double = 0.5;

    var1calcR(a,b,x);
    var1calcS(a,b,x);

}

fun var1calcR(a: Double, b: Double, x: Double) : Double {
    return (x.pow(2) * (x + 1)) / b - ((1 - cos(2* (x + a))) / 2);
};

fun var1calcS(a: Double, b: Double, x: Double) : Double {
    var cosValue = (x+b).pow(3);
    return sqrt((x * b) / a) + ((1 + cos(2 * (cosValue))) / 2);
};
