import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square > 64 || square < 1){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return BigInteger.valueOf(2).pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        System.out.println(BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE));
        return BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE);
    }

}
