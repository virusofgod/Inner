package ru.virusofgod.static_nested_class;

public class Boeing737 {

    private int manufactureYear;
    private static int maxPassengersCount = 300;

    public Boeing737(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public static class Drawing {

        public static int getMaxPassengersCount() {

            return maxPassengersCount;
        }
    }
}