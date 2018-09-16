package HomeWork.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger firstBigInteger = new BigInteger("999999999999999999");
        BigInteger secondBigInteger = new BigInteger("1000");
        BigInteger summ = new BigInteger(BigInteger.summ(firstBigInteger.getInteger(),secondBigInteger.getInteger()));
        // BigInteger Mutiplication = new BigInteger(BigInteger.multiplication(FirsBigInteger,SecondBigInteger));
        System.out.println(summ.getInteger());
        //System.out.println(Mutiplication.getInteger());
    }
}
