package 练习;

class Person {
    public Person() {
        System.out.println("this is a Person");
    }
}

class Child extends Person {
        private String name = "tom ";

        public Child() {
            super();
            System.out.println("this is a child");
        }

        public static void main(String[] arg) {
            Child child = new Child();
           // System.out.println(this.name);
        }
    }

