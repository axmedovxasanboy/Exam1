package pdp.exam.task2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.IntStream;


public class Task2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("src/main/java/pdp/exam/task2/students.json"));
        StringBuilder builder = new StringBuilder();
        while (scanner.hasNext()) {
            builder.append(scanner.nextLine());
        }

        Gson gson = new Gson();

        Type type = TypeToken.getParameterized(List.class, Student.class).getType();

        List<Student> students = gson.fromJson(builder.toString(), type);

        int age = students.stream().mapToInt(Student::getAge).sum();

        double avg = (double) age / students.size();

        System.out.println("avg = " + avg);

    }
}
