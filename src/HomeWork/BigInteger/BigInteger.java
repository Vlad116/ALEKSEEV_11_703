package HomeWork.BigInteger;

public class BigInteger {
    private String integer;

    public BigInteger(String integer) {
        this.integer = integer;
    }

    public String getInteger() {
        return integer;
    }

    public void setInteger(String integer) {
        this.integer = integer;
    }

    private static String makeEqualByLength(String a, String b) {
        /*  Делаем равными по длине оба числа , добавим нули перед числом */
        int Difference = Math.abs(a.length() - b.length());
        String FirstInteger = a;
        String SecondInteger = b;
        if (a.length() > b.length()) {
            for (int i = 0; i < Difference; i++) {
                SecondInteger = "0" + SecondInteger;
            }
            return SecondInteger;
        } else {
            for (int i = 0; i < Difference; i++) {
                FirstInteger = "0" + FirstInteger;
            }
            return FirstInteger;
        }
    }

    public static String summ(String a, String b) {
        /* Сложение больших чисел*/
        String firstInteger = a;
        String secondInteger = b;
        if (a.length() > b.length()) {
            secondInteger = makeEqualByLength(a, b);
        } else {
            firstInteger = makeEqualByLength(a, b);
        }
        StringBuilder amount = new StringBuilder(); // строка для сохранения результата вычисления
        byte oneInTheMind = 0; //  выделим переменную для "единицы в уме"
        for (int i = firstInteger.length() - 1; i >= 0; i--) {
            int sum = Character.getNumericValue(firstInteger.charAt(i)) + Character.getNumericValue(secondInteger.charAt(i)) + oneInTheMind;
            oneInTheMind = 0;
            if (sum <= 9) {
                amount.insert(0, sum);
            } else {
                sum %= 10;
                oneInTheMind = 1;
                amount.insert(0, sum);
            }
        }
        if (oneInTheMind != 0) {
            amount.insert(0, oneInTheMind);
        }

        firstInteger = amount.toString();
        return firstInteger;
    }


    /*public static String multiplication(BigInteger a, BigInteger b) {
        String FirstInteger = a.getInteger();
        String SecondInteger = b.getInteger();
        String multiply = "";
        String amount = ""; // строка для сохранения  общего результата вычисления
        StringBuilder simplyMult = new StringBuilder();//сохраняем в строку умножение на число
        int OfTheTens = 0; // разряд десятков
        for (int j = SecondInteger.length() - 1; j > 0; j--) {
            if (Character.getNumericValue(FirstInteger.charAt(j)) == 0) {
                multiply += 0;
                continue;
            }
            multiply += 0;
            for (int i = FirstInteger.length() - 1; i > 0; i--) {
                if (Character.getNumericValue(FirstInteger.charAt(i)) == 0) {
                    multiply += 0;
                    continue;
                }
                int mult = Character.getNumericValue(FirstInteger.charAt(i)) * Character.getNumericValue(SecondInteger.charAt(j)) + OfTheTens;
                OfTheTens = 0;
                if (mult <= 9) {
                    simplyMult.insert(0, mult);
                } else {
                    OfTheTens = mult / 10;
                    mult %= 10;
                    simplyMult.insert(0, mult);
                }
            }
            if (OfTheTens != 0) {
                simplyMult.insert(0, OfTheTens);
            }
            simplyMult.insert(simplyMult.length(), multiply);
            amount = summ(amount, simplyMult.toString());
        }
        return amount;
    }*/
}