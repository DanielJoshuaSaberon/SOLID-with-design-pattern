package SOLID3.Resource;

import SOLID3.Interface.Borrow;

public class Books implements Borrow {
    @Override
    public String borrow(String title) {
        return "Book Titled " + title;
    }
}