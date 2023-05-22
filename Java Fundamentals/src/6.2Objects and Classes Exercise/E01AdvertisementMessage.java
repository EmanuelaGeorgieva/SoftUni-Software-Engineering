package objectsAndClassesExercise;
import java.util.Random;
import java.util.Scanner;

public class E01AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] phrase = new String[]{
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."
        };
        String[] event = new String[]{
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
        };
        String[] author = new String[]{
                "Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"
        };
        String[] city = new String[]{
                "Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"
        };

        Random rnd = new Random();

        for (int i = 0; i < n; i++){
            int randomPhraseNum = rnd.nextInt(phrase.length);
            int randomEventsNum = rnd.nextInt(event.length);
            int randomCitiesNum = rnd.nextInt(city.length);
            int randomAuthorNum = rnd.nextInt(author.length);

            System.out.println(String.join(" ",phrase[randomPhraseNum] + " " + event[randomEventsNum] + " "+ author[randomAuthorNum] + " - " + city[randomCitiesNum]));
        }
    }
}
