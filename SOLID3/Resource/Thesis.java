package SOLID3.Resource;

import SOLID3.Interface.Borrow;

public class Thesis implements Borrow {
    @Override
    public String borrow(String title) {
        return "Thesis Titled " + title;
    }
}
