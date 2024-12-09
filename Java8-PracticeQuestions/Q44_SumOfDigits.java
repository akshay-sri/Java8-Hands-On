public class Q44_SumOfDigits {
    public static void main(String[] args) {
        // 1. If input is String
        String num = "1234";
        int ans = num
        .chars()
        .map(Character::getNumericValue)
        .sum();
        System.out.println("When input is String:"+ans);

        // 2. If input is integer
        int n = 1234;
        int a = String.valueOf(n)
        .chars()
        .map(Character::getNumericValue)
        .sum();
        System.out.println("When input is integer:"+a);
    }
}