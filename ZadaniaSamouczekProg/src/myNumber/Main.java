package myNumber;

public class Main {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(2);
        System.out.println(myNumber.pow(2));

    }
}

class MyNumber {
    private final double value;


    public MyNumber(double value) {
        this.value = value;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public double sqrt() {
        return Math.sqrt(value);

    }

    public MyNumber pow(int pow){

        return new MyNumber(Math.pow(value, 3));
    }

    public MyNumber add(MyNumber x){
        return new MyNumber(value + x.value);
    }

    public MyNumber sub(MyNumber x) {
        return new MyNumber(value - x.value);
    }
}
