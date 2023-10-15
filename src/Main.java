
public class Main {
    // Класс Car
    public class Car {
        private String make;
        private String model;
        private int year;

        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public Car() {
            // Конструктор по умолчанию
        }

        // Геттеры
        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        // Сеттеры
        public void setMake(String make) {
            this.make = make;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

    // Класс House
    public class House {
        private String address;
        private int numberOfRooms;
        private double area;

        public House(String address, int numberOfRooms, double area) {
            this.address = address;
            this.numberOfRooms = numberOfRooms;
            this.area = area;
        }

        public House() {
            // Конструктор по умолчанию
        }

        // Геттеры
        public String getAddress() {
            return address;
        }

        public int getNumberOfRooms() {
            return numberOfRooms;
        }

        public double getArea() {
            return area;
        }

        // Сеттеры
        public void setAddress(String address) {
            this.address = address;
        }

        public void setNumberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
        }

        public void setArea(double area) {
            this.area = area;
        }
    }

    // Класс Person
    public class Person {
        private String name;
        private int age;
        private String occupation;

        public Person(String name, int age, String occupation) {
            this.name = name;
            this.age = age;
            this.occupation = occupation;
        }

        public Person() {
            // Конструктор по умолчанию
        }

        // Геттеры
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getOccupation() {
            return occupation;
        }

        // Сеттеры
        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }
    }

    // Класс Computer
    public class Computer {
        private String brand;
        private String model;
        private int ramSize;

        public Computer(String brand, String model, int ramSize) {
            this.brand = brand;
            this.model = model;
            this.ramSize = ramSize;
        }

        public Computer() {
            // Конструктор по умолчанию
        }

        // Геттеры
        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getRamSize() {
            return ramSize;
        }

        // Сеттеры
        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setRamSize(int ramSize) {
            this.ramSize = ramSize;
        }
    }

}