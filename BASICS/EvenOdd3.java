class EvenOdd3 {
    public static void main(String[] args) {
        int number = 29;

        if (isEven(number))
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    // Returns true if the number is even
    static boolean isEven(int number) {
        return (number & 1) == 0;
    }
}
