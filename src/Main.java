import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<String> music = new ArrayList<>();
        String line1 = "The wind blew from the sea"; // Ветер с моря дул
        String line2 = "\nCatching up on trouble"; // Нагонял беду
        String line3 = "\nAnd you told me"; // И сказал ты мне
        String line4 = "\nI will not come again"; // Больше не приду
        music.add(line1);
        music.add(line2);
        music.add(line3);
        music.add(line4);
        System.out.println(music);
        String musicLine = String.valueOf(music);
        String[] rows = musicLine.split("\n");
        String[] words = musicLine.split("");
        for (String item1 : rows) {
            String changed = musicLine;
            for (String item2 : words) {
                changed = item1.replaceAll(Pattern.quote(item2), "");
            }
            System.out.println(changed);
            
        }
    }
}
