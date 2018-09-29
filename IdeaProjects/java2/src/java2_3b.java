class A

    {

        void b()
        {
            System.out.println("Hello");
        }

    }

    public class java2_3b {

        public static void main(String[] args)

        {
            A a = new A();
            a.b();
        }

    }

class a {
    static class b {}
    public static void main(String args[]) {
        System.out.println("First attempt new b():");
        try {new b(); } catch(Throwable t) {t.printStackTrace();}
        System.out.println("\nSecond attempt new b():");
        try {new b(); } catch(Throwable t) {t.printStackTrace();}
    }
}