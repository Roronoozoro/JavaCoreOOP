public class PracticalTask02 {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human((byte) 58, "Федор", "Трушин", "Волейбол");
        Human human3 = new Human((byte) 22, "Юра", "Быков");
    }

    public static class Human {
        private byte age;
        private String name;
        private String secondName;
        private String favoriteSport;

        public Human() {

        }

        public Human(byte age, String name, String secondName, String favoriteSport) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
            this.favoriteSport = favoriteSport;
        }

        public Human(byte age, String name, String secondName) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
        }
    }
}
