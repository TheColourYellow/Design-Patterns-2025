import java.util.HashMap;
import java.util.Map;

public class EncryptedPrinter extends PrinterDecorator {

    //Source used to learn about Caesar Cipher:
    // https://www.geeksforgeeks.org/python/substitution-cipher/

    String allletters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ !";
    Map<Character, Character> encryptionMap = new HashMap<>();
    Map<Character, Character> decryptionMap = new HashMap<>();


    StringBuilder encryptedText = new StringBuilder();
    StringBuilder decryptedText = new StringBuilder();

    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    public String encrypt(String print, int key) {

        for (int i=0; i<allletters.length(); i++) {
            encryptionMap.put(allletters.charAt(i), allletters.charAt((i+key) % allletters.length()));
        }
        for (char c : print.toCharArray()) {
            if (allletters.indexOf(c) != -1) {
                encryptedText.append(encryptionMap.get(c));
            } else {
                encryptedText.append(encryptionMap.get(c));
            }
        }
        return encryptedText.toString();
    }

    public String decrypt(int key) {
        for (int i=0; i<allletters.length(); i++) {
            decryptionMap.put(allletters.charAt(i), allletters.charAt((i - key + allletters.length()) % allletters.length() ));
            }
        for (char c : encryptedText.toString().toCharArray()) {
            if (allletters.indexOf(c) != -1) {
                decryptedText.append(decryptionMap.get(c));
            } else {
                decryptedText.append(decryptionMap.get(c));
            }
        }
        return decryptedText.toString();

    }
    @Override
    public void print(String print) {
        String result = encrypt(print, 10);
        String decrypted = decrypt(10);
        super.print("Encrypted print is: " + result + " Decypted print is: " + decrypted);
    }
}
