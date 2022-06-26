package multi_thread;

public class Teacher implements Runnable {
    private final Assignment r;
    Teacher(Assignment r)
    {
        this.r = r;
    }
    public void run()
    {
        while(true)
        {
            r.assign("assignment ");
        }
    }
}
