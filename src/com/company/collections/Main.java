package com.company.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        //print stack in loop
//        while (!stack.isEmpty()) {
////            System.out.println(stack.pop());
//        }
//        System.out.println(stack);

//        List<String> list = List.of("hello", "world", "what's up");
        List<String> list = Arrays.asList("hello", "world", "what's up");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ListIterator<String> listIterator = list.listIterator();
        ListIterator<String> listIterator1 = list.listIterator(list.size());
        while (listIterator.hasNext()) {
            String obj = listIterator.next();
            if (obj.equals("hello")) {
                listIterator.set("new value hello");
            }
        }

        System.out.println(list);

        while (listIterator1.hasPrevious()) {
            System.out.println(listIterator1.previous());
        }

        System.out.println("=========================== ArrayDeque ===========================");
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(list);

        arrayDeque.addFirst("first");
        arrayDeque.addLast("last");

        System.out.println(arrayDeque);

        arrayDeque.pollFirst();
        System.out.println(arrayDeque);

        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.pop());

        System.out.println(arrayDeque);

        System.out.println("=========================== LinkedList ===========================");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(list);
        System.out.println(linkedList);

        System.out.println();

        linkedList.offerFirst("my first");
        linkedList.addFirst("my first2");

        linkedList.offerLast("my last");
        linkedList.addLast("my last2");

        linkedList.add(4, "insert center");
        linkedList.add("last add");

        System.out.println(linkedList);

        Set<Integer> simpleSet = new HashSet<>();
        simpleSet.addAll(List.of(2, 8, 3, 1, 5, 4, 7, 6));
        System.out.println(simpleSet);

        System.out.println(simpleSet.contains(22));

        for (Integer i : simpleSet) {
            System.out.print(i + "\t");
        }
        System.out.println(simpleSet.contains(0));

        simpleSet.remove(2);
        System.out.println(simpleSet);

        TreeSet<Integer> treeSet = new TreeSet<>(simpleSet);
        treeSet.addAll(List.of(2, 8, 1, 4, 7, 9, 9, 7, 6));

        System.out.println(treeSet);

        System.out.println(treeSet.higher(3));
        System.out.println(treeSet.lower(3));

        treeSet.pollFirst();
        treeSet.pollLast();

        System.out.println(treeSet);

        System.out.println(treeSet.tailSet(5));
        System.out.println(treeSet.headSet(5));
        System.out.println(treeSet.subSet(2, 5));


        Map<String, String> map = new HashMap<>();
        map.put("anya", "ge");
        map.put("igor", "gruntov");
        map.put("vasya", "pupkin");
        map.put("pavel", "radi");
        map.put("maxim", "grad");

        for (Map.Entry<String, String> item : map.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }

        System.out.println(map.getOrDefault("igor1", "default"));

        map.put("igor", "valir");
        map.replace("igor", "mur");
//        map.replaceAll((s, s2) -> s+"-v__k-"+s2);

//        map.forEach((k, v) -> System.out.println(k+"__"+v));

        System.out.println("============keySet============");
        for (String val : map.keySet()) {
            System.out.println(val);
        }

        TreeMap<Object, Object> treeMap = new TreeMap<>();

        treeMap.putAll(map);
        System.out.println(treeMap);

        System.out.println(treeMap.tailMap("pavel"));
        System.out.println(treeMap.headMap("igor"));

        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());

        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 8));
        List<Integer> integers2 = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 8));
        System.out.println(integers);

        Iterator<Integer> iterator1 = integers.iterator();

        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + "\t");
            iterator1.remove();
        }
        System.out.println("\n" + integers);

        ListIterator<Integer> integerListIterator = integers2.listIterator();

        while (integerListIterator.hasNext()) {
            integerListIterator.next();
            System.out.println(integerListIterator.nextIndex());
        }


        Map<String, String> linkedHashMap = new HashMap<>();
        linkedHashMap.put("hello", "1");
        linkedHashMap.put("hello2", "2");
        linkedHashMap.put("hello3", "3");
        linkedHashMap.put("hello4", "4");

        for (String val : linkedHashMap.keySet()) {
            System.out.println(val);
        }

    }
}
