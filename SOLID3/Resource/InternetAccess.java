package SOLID3.Resource;

import SOLID3.Interface.Borrow;

public class InternetAccess implements Borrow {
    @Override
    public String borrow(String title) {
        return "Website Called " + title;
    }
}