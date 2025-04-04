package SOLID3.Resource;

import SOLID3.Interface.Borrow;

public class Capstone implements Borrow {
    @Override
    public String borrow(String title) {
        return "Capstone Titled " + title;
    }
}