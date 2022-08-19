public class PracticalTask01 {
    public static void main(String[] args) {
        int b = 10;
        for (int i = 0;i<=b;i++){
            System.out.println("Я стану Dev");
        }

    }

    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public void sayHello() {
            System.out.println("Гав!");
        }

        public void catchCat(Cat cat) {
            System.out.println("Кошка поймана");
            sayHello();
            cat.sayHello();
        }
    }


}
