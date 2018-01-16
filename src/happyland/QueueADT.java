package happyland;

interface QueueADT {

    public void enqueue(String e) throws Exception;

    public String dequeue() throws Exception;

    public String front() throws Exception;

    public boolean isEmpty();

    public boolean isFull();

    public void clear();

    public int size();

}
