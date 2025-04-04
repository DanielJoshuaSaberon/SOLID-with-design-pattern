package SOLID3.Resource;

import SOLID3.Interface.Borrow;

public class Journal implements Borrow {
    @Override
    public String borrow(String title) {
        return "Journal  Titled " + title;
    }
}
