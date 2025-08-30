import java.util.Arrays;
import java.util.stream.Collectors;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        return Arrays.stream(morseCode.trim().split("   "))
                     .map(word -> Arrays.stream(word.split(" "))
                                        .map(MorseCode::get)
                                        .collect(Collectors.joining()))
                     .collect(Collectors.joining(" "));
    }
}
