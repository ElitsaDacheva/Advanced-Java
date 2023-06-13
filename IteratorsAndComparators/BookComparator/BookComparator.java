package BookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int titleComparator = o1.getTitle().compareTo(o2.getTitle());
        if(titleComparator != 0){
            return titleComparator;
        }
        return o1.getYear() - o2.getYear();
    }
}
