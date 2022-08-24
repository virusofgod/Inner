package ru.virusofgod.inner_classes;

public class Parcell {
    private String recepient;
    private int mass;



    class Destination{
        private int roomNumber;
        private String street;
        private int homeNumber;
        private static int a;// получилось создать статическую переменную

        enum Abc{ //получилось создать перечисление
            a,b,c;
        }
        public void doSmth(){
            System.out.println(mass);

        }
    }


}