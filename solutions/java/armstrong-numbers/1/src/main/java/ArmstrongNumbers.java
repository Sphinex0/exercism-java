class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int tmp = numberToCheck;
        int acc = 0;
        String str1 = numberToCheck + "";
        int exponent = str1.length();
        for (int i = 0 ; i < exponent ; i++){
            acc += Math.pow(numberToCheck%10,exponent);
            numberToCheck /= 10;
        }
    return  acc == tmp;
    }

}
