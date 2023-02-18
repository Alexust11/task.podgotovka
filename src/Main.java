import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.ArrayList.*;

public class Main {

    public static void main(String[] args) {
        //1. Дан List <String> names. Удалите первую букву из каждого имени и верните отсортированный список
//        List<String> names=List.of("Алекс", "Федор", "Игорь","Павел");
//
//        names.stream().map(e->e.substring(1)).sorted().forEach(System.out::println);
//
//    }
        //****************************************************************************
        // 2. Напишите программу, которая переворачивает массив
//        String[] array = {"a1", "a2", "a3"};
//        Stream<String> streamFromArrays = Arrays.stream(array);
//        streamFromArrays.sorted(Collections.reverseOrder()).forEach(System.out::println);
        //****************************************************************************

        //3.Напишите программу , которая проверяет, является ли строка палиндромом
//        String str = "казак";
//        String strNew=new StringBuilder(str).reverse().toString();
//        if (strNew.equals(str)) {
//            System.out.println("палиндром");
//        }else System.out.println("не палиндром");
        //****************************************************************************
    }
}