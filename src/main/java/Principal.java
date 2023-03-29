
public class Principal {

    public static void main(String[] args) {
        Runnable t1 = new Contador("t1");
        Runnable t2 = new Contador("t2");
        new Thread(t1).start();
        new Thread(t2).start();
    }
}
