package TextProcessingExercise08;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String path = scan.nextLine();

        int slashIndex = path.lastIndexOf('\\');
        int pointIndex = path.lastIndexOf('.');

        String fileName = path.substring(slashIndex + 1, pointIndex);
        String extension = path.substring(pointIndex + 1);

        System.out.println(String.format("File name: %s", fileName));
        System.out.println(String.format("File extension: %s", extension));
    }
}
