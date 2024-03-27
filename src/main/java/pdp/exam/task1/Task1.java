package pdp.exam.task1;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("src/main/java/pdp/exam/task1/Assignment 4.txt"));
        StringBuilder builder = new StringBuilder();
        while (scanner.hasNext()) {
            builder.append(scanner.nextLine());
        }
        String encode = Base64.getEncoder().encodeToString(builder.toString().getBytes());
        FileOutputStream out = new FileOutputStream("src/main/java/pdp/exam/task1/test.txt");
        out.write(encode.getBytes());

    }
}
