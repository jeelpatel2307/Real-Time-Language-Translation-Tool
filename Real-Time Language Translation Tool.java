import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

import java.util.Scanner;

public class LanguageTranslationTool {

    public static void main(String[] args) {
        // Initialize the translation service
        Translate translate = TranslateOptions.getDefaultInstance().getService();
        
        // Input text to be translated
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to translate: ");
        String textToTranslate = scanner.nextLine();
        
        // Source and target language codes
        System.out.print("Enter source language code (e.g., en for English): ");
        String sourceLanguage = scanner.nextLine();
        System.out.print("Enter target language code (e.g., fr for French): ");
        String targetLanguage = scanner.nextLine();
        
        // Translate the text
        Translation translation =
                translate.translate(textToTranslate, Translate.TranslateOption.sourceLanguage(sourceLanguage),
                        Translate.TranslateOption.targetLanguage(targetLanguage));

        // Display the translated text
        System.out.println("Translated text: " + translation.getTranslatedText());
    }
}
