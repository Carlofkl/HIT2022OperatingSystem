package multi_thread;

public class Student implements Runnable{
    private final Assignment r;
    Student(Assignment r)
    {
        this.r = r;
    }
    public void run()
    {
        while(true)
        {
            r.complete();
        }
    }
}
