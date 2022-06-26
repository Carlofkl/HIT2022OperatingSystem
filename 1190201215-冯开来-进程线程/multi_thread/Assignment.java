package multi_thread;

public class Assignment {
	
	private String name;
    private int count = 1;
    private boolean flag = false;
    
    public synchronized void assign(String name){
        while(flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace()
                ;
            }
        }
        this.name=name+count;
        count++;
        System.out.println(Thread.currentThread().getName()+"Teacher has assigned "+this.name);
        flag=true;
        notifyAll();
    }


    public synchronized void complete(){
        while(!flag){
            try{this.wait();}catch(InterruptedException e){}
        }
        System.out.println(Thread.currentThread().getName()+"Student has completed "+this.name);//Ïû·Ñ¿¾Ñ¼1
        flag = false;
        notifyAll();
    }

}
