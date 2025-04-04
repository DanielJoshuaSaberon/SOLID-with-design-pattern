package SOLID3.Resource;

import SOLID3.Interface.Borrow;

public class EJournal implements Borrow {
    @Override
    public String borrow(String title) {
        return "E-Journal titled " + title;
    }
}
