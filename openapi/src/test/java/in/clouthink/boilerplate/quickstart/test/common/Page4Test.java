package in.clouthink.boilerplate.quickstart.test.common;

import org.springframework.data.domain.PageImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther dz
 */
public class Page4Test<T> extends PageImpl<T> {

    private final List<T> content = new ArrayList<T>();

    private boolean last;

    private long totalElements;

    private int totalPages;

    private int size;

    private int number;

    private boolean first;

    private int numberOfElements;

    public Page4Test() {
        super(new ArrayList());
    }

    public void setContent(List<T> content) {
        this.content.addAll(content);
    }

    @Override
    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    @Override
    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    @Override
    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    @Override
    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }
}
