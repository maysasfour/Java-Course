package OOPRevision;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
//        Swimable objRef = new Fish();
////        objRef=new Dolphin();
//        Animal objRef2 = new Fish();
//        objRef2.eat();
//
//        objRef2=new Bird();
        List<Integer> list = new LinkedList<>();


        Shape obj = new Circle(5);
//        obj.getArea();

        // SET
        Set <Integer> mySet = new HashSet<>();
        // 8 6 7 8 9 10 -5
        mySet.add(8);
        mySet.add(6);
        mySet.add(7);
        mySet.add(8);
        mySet.add(9);
        mySet.add(10);
        mySet.add(-5);
        for (Integer obj4 : mySet)
        {
            System.out.println(obj4);
        }
        System.out.println("***********");
        Set <String> mySet1 = new HashSet<>();
        mySet1.add("Mays");
        mySet1.add("Reem");
        mySet1.add("Kareem");
        mySet1.add("Ibrahim");
        mySet1.add("Tala");
        for (String obj5 : mySet1)
        {
            System.out.println(obj5);
        }
        System.out.println("***********");
        Set <String> mySet3 = new LinkedHashSet<>();
        mySet3.add("Mays");
        mySet3.add("Reem");
        mySet3.add("Kareem");
        mySet3.add("Ibrahim");
        mySet3.add("Tala");

        for (String obj6 : mySet3)
        {
            System.out.println(obj6);
        }

        System.out.println("***********");

        Set <String> mySet4 = new TreeSet<>();
        mySet4.add("Mays");
        mySet4.add("Reem");
        mySet4.add("Kareem");
        mySet4.add("Ibrahim");
        mySet4.add("Tala");

        for (String obj7 : mySet3)
        {
            System.out.println(obj7);
        }

        System.out.println("***********");
        Set <String>mySet8 = new HashSet<>();
        mySet8.add(null);
        mySet8.add("1");
        mySet8.add(null);
        mySet8.add(null);
        System.out.println(mySet8);
        System.out.println("***********");
        // Map

        Map <String,Integer> myGradeList = new HashMap<>();

        myGradeList.put("Mays",86);
        myGradeList.put("Reem",77);
        myGradeList.put("Kareem",70);
        myGradeList.put("Ibrahim",99);
        myGradeList.put("Ibrahim",59);
        System.out.println(myGradeList);
        for (Map.Entry<String,Integer> element : myGradeList.entrySet())
        {
            element.setValue(element.getValue()+5);
            System.out.println(element.getKey()+" = > " + element.getValue());
element.getKey();

        }
        System.out.println("***********");
        myGradeList.remove("Ibrahim");

        for (Map.Entry<String,Integer> element : myGradeList.entrySet())
        {
            element.setValue(element.getValue()+5);
            System.out.println(element.getKey()+" = > " + element.getValue());
            element.getKey();

        }
        System.out.println("***********");
        Set <Animal> myAnimal = new HashSet<>();
        myAnimal.add(new Animal("blue","male") {
            @Override
            public String toString() {
                return super.toString();
            }
        });

        System.out.println(myAnimal);

        System.out.println("***********");

//        Set <Integer> obj10 = new HashSet<>();
//        obj10.add(test);
//        obj10.add(test3);
//        obj10.add(test2);
//        for (Integer obj101;obj10)
//            obj101 = new Integer(5);
//
//        for (Integer obj101;obj10)
//            System.out.println(obj101);


        // 1 2 3 4 5
        // 1 1 2 2 2 5 5 5 5 6 6
    }
}
