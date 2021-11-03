package asciiart;

import java.awt.*;

public class AsciiArtIntegrationTest {

    public void givenTextWithAsciiCharacterAndSettings_shouldPrintAsciiArt() {
        AsciiArt asciiArt = new AsciiArt();
        String text = "BAELDUNG";
        AsciiArt.Settings settings = asciiArt.new Settings(new Font("SansSerif", Font.BOLD, 24), text.length() * 30, 30); // 30 pixel width per character

        asciiArt.drawString(text, "*", settings);
    }
}

