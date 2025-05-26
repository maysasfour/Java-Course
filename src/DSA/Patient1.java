package DSA;


        public class Patient1 {
            private String name;
            private int age;
            private String illness;

            public Patient1(String name, int age, String illness) {
                this.name = name;
                this.age = age;
                this.illness = illness;
            }

            @Override
            public String toString() {
                return "Patient1{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", illness='" + illness + '\'' +
                        '}';
            }
}


