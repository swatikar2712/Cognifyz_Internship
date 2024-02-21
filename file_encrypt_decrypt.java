import java.io.*;
public class file_encrypt_decrypt {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Choose an option:\n1. Encrypt\n2. Decrypt");
            int option = Integer.parseInt(reader.readLine());
            System.out.print("Enter file name or path: ");
            String fileName = reader.readLine();
            String content = readFile(fileName);
            String result = option == 1 ? encrypt(content) : decrypt(content);
            writeFile("output.txt", result);
            System.out.println("Operation completed. Result saved to output.txt");
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();}}   
    private static String readFile(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                content.append(line).append("\n");}}     
        return content.toString();}
    private static void writeFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);}}
    private static String encrypt(String text) {
        return shift(text, 3);}
    private static String decrypt(String text) {
        return shift(text, -3);}
    private static String shift(String text, int offset) {
        StringBuilder shiftedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char shiftedChar = (char) (c + offset);
                if ((Character.isLowerCase(c) && shiftedChar > 'z') || (Character.isUpperCase(c) && shiftedChar > 'Z')) {
                    shiftedChar -= 26;
                } else if ((Character.isLowerCase(c) && shiftedChar < 'a') || (Character.isUpperCase(c) && shiftedChar < 'A')) {
                    shiftedChar += 26;}              
                shiftedText.append(shiftedChar);
            } else {
                shiftedText.append(c);}}        
        return shiftedText.toString();}}
