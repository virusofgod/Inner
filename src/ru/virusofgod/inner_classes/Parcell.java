package ru.virusofgod.inner_classes;

public class Parcell {
    private String recepient;
    private int mass;
    private static int id;

    public class Destination{
            private int roomNumber;
            private String street;
            private int homeNumber;
            private static int count;

            enum Abc {
               a,b,c;
            }



        public void doSmth(){// публичный не статичный класс и статическая и не статическая  переменные доступны
            System.out.println(mass);
        }
    }
}