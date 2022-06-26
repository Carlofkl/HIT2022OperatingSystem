package multi_thread;

public class multi_thread {
	public static void main(String[] args)
    {
        Assignment r = new Assignment();
        Teacher pro = new Teacher(r);
        Student con = new Student(r);

        Thread t0 = new Thread(pro);
        Thread t1 = new Thread(pro);

        Thread t2 = new Thread(con);
        Thread t3 = new Thread(con);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
