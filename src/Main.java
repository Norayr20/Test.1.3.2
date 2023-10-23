public class Main {
    public static void main(String[] args) {
        int resoult = charExpression(1);
        System.out.println(resoult);
    }

    public static char charExpression(int a) {
        return (char) ('d' + a);
    }
}
