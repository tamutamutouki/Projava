package org.example.issue14;

import java.util.List;

public class interfaceSample2 {
    interface Named{
        String name();
    }

    interface Figure{
        int width();
        int height();
    }
    record Student(String name, int score) implements Named {}
    record Teacher(String name, String subject) implements Named{}
    record Staff(String name, String job) implements Named{}

    record Box(int width, int height) implements Figure{}
    record Oval(int width, int height) implements Figure{}

    public static void main(String[] args){
        var people = List.of(new Student("kis",80),new Teacher("hosoya","Math"),
                new Passenger(),new Staff("tamura","SE"));

        var practice = List.of(new Box(23,45),new Oval(50,99));

        for(Named p : people){
            var n = p.name();
            System.out.println("こんにちは%sさん".formatted(n));
        }

        for(Figure r : practice){
            var h = r.height();
            var w = r.width();
            System.out.println("横は%,dで高さは%,dです".formatted(w,h));
        }
    }

    static class Passenger implements Named{

        @Override
        public String name() {
            return "通りすがり";
        }
    }
}
