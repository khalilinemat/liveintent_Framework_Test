package com.cybertek.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtility {

    public static String todaysDate(){
        String today = new SimpleDateFormat("MMMM dd, yyy").format(new Date());
        return today;
    }
}
