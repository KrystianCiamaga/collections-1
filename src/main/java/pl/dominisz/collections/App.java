package pl.dominisz.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * http://dominisz.pl
 * 25.03.2018
 */
public class App {



    public static void addElementsToFront(List<Integer> list, int count) {


        Random rand = new Random();

        long start=System.currentTimeMillis();

        for (int i = 0; i < count; i++) {

            list.add(0, rand.nextInt());
        }
        long end=System.currentTimeMillis()-start;

        System.out.println("add elements to front "+end);
    }


        public static void addElementsToEnd(List < Integer > list,int count){

            Random rand = new Random();


            long start=System.currentTimeMillis();
            for (int i = 0; i < count; i++) {

                list.add(rand.nextInt());
            }

            long end=System.currentTimeMillis();

            System.out.println("add elements to back "+(end-start));
        }


        public static void iterateList(List<Integer> list){


        long start=System.currentTimeMillis();

        for(int i=0;i<list.size()-1;i++){

            list.get(i);

        }
        long end=System.currentTimeMillis();

            System.out.println("iteratelist "+(end-start));
    }


    public static void iterateListForEach(List<Integer> lista){


        long start=System.currentTimeMillis();

        for(Integer x : lista){

            Integer element=x;
        }

        long end=System.currentTimeMillis();

        System.out.println("iteratelistForEach "+(end-start));
    }





    public static void main(String[] args) {

        ArrayList<Integer> lista=new ArrayList<>();

        addElementsToFront(lista,100000);
        addElementsToEnd(lista,100000);
        iterateList(lista);
        iterateListForEach(lista);

        System.out.println("\nLinked list\n");

        LinkedList<Integer> lista2=new LinkedList<>();

        addElementsToFront(lista2,100000);
        addElementsToEnd(lista2,100000);
        iterateList(lista2);
        iterateListForEach(lista2);

    }

}
