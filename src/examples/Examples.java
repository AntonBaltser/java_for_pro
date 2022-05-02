package examples;

import java.util.ArrayList;
import java.util.LinkedList;

public class Examples {
    public static void main(String[] args) {
        int some[] = new int[4]; // просто массив с заданной длинной
        // динамический массив
        ArrayList<Integer> some_dyn = new ArrayList<>(5);  //5 перевоночальное колличесво элементов
        some_dyn.add(56); // .add добавляет в конец
        some_dyn.add(6);
        some_dyn.add(5);
        some_dyn.add(7);
        some_dyn.add(342);
        some_dyn.add(8);

        // some_dyn.clear(); //очистить массив
        // .remove(1); удаление элемента по индексу
        //.size() посмотреть длинну массива
        for (Integer x : some_dyn) {
            System.out.println(x);
        }
        //LinkedList представляет собой практически тоже самое что и динамический массив но имееит иличие по вермени вставки и удаления (информацию закрепить повторно) раздница в скорости
        //arrayList хорош для поиска каких-то  елементов в массиве
        LinkedList<String> names = new LinkedList<>();  //5 перевоночальное колличесво элементов
        names.add("Tome"); // .add добавляет в конец
        names.add("George");
        names.add("John");

        names.add(1, "Alex");
        // .clear(); //очистить массив
        // .remove(1); удаление элемента по индексу
        // .size() посмотреть длинну массива
        for (String x : names) {
            System.out.println(x);
        }
    }
}