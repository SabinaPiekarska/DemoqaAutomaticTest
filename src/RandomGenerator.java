import java.util.Random;

public class RandomGenerator {
    Random random = new Random();
    public String getRandomString(int x) {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        return output;
    }
    public int getRandomInt(int x){
        x = random.nextInt(10)+0;
        return x;
    }
}
