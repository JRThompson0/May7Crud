package cohort15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args)
    {
        List<Long> list = new ArrayList<>();
        list.add(4L);
        list.add(2L);
        list.add(12L);
        list.add(10L);
        list.add(18L);
//        TreeSet<Long> set = new TreeSet<>();
//        set.add(4L);
//        set.add(2L);
//        set.add(12L);
//        set.add(10L);
//        set.add(18L);
        Iterator<Long> longIterator = list.iterator();
        while(longIterator.hasNext())
        {
            Long current = longIterator.next();
            if(current < 10L){
                longIterator.remove();
                System.out.println(current+" removed.");
            }
        }
        longIterator = list.listIterator(list.size());
        while(((ListIterator<Long>) longIterator).hasPrevious())
        {
            System.out.println(((ListIterator<Long>) longIterator).previous().longValue());
        }
    }
}