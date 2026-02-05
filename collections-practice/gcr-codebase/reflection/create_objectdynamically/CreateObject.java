package reflection.create_objectdynamically;

        public class CreateObject {

            public static void main(String[] args) throws Exception {

                Class<?> c = Class.forName("Student");

                Object obj = c.getDeclaredConstructor().newInstance();
            }
        }
