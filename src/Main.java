public class Main {
    public static void main(String[] args) {
        int resoult = charExpression('d');
        System.out.println(resoult);
    }

    public static char charExpression(int a) {
        char с = (char) ('d' + a);
        return с;
    }
}
