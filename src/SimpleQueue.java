import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue<Type>
{
    private Queue<Type> queue;

    public SimpleQueue()
    {
        queue = new LinkedList<>();
    }

    public void add(Type value)
    {
        queue.offer(value);
    }

    public void remove()
    {
        if(queue.isEmpty())
            System.out.println("Queue is empty!");
        else
            queue.remove();
    }

    public Type peek()
    {
        if(queue.isEmpty())
        {
            System.out.println("Queue is empty!");
            return null;
        }
        else return queue.peek();
    }

    public boolean isEmpty()
    {
        return queue.isEmpty();
    }
}
