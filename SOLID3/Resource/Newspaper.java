package SOLID3.Resource;

import SOLID3.Interface.Borrow;

public class Newspaper implements Borrow {
    @Override
    public String borrow(String title) {
        return "Newspaper Titled " + title;
    }
}