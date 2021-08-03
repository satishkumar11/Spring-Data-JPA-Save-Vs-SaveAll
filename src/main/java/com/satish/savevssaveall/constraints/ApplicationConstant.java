package com.satish.savevssaveall.constraints;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ApplicationConstant {

    public static final int bookCount = 5;
    public static final String BOOK_NAME = "BookBookBookBookBookBookBookBookBookBookBookBookBookBookBook" +
            "BookBookBookBookBookBookBookBookBookBookBookBookBookBookBookBookBookBookBookBookBook";

    public static final String AUTHOR_NAME = "BookBookBookBookBookBookBookBookBookBookBookBookBookBookBook" +
            "BookBookBookBookBookBookBookBookBookBookBookBookBookBookBookBookBookBookBookBookBook";

    public static final String TITLE = "BookBookBookBookBookBookBookBookBookBookBookBookBookBookBook" +
            "BookBookBookBookBookBookBookBookBookBookBookBookBookBookBookBookBookBookBookBookBook";

    public static String calculateTime(Date start, Date end){
        long diff = end.getTime() - start.getTime();

        String TimeTaken = String.format("[%s] hours : [%s] mins : [%s] secs",
                TimeUnit.MILLISECONDS.toHours(diff),
                TimeUnit.MILLISECONDS.toMinutes(diff),
                TimeUnit.MILLISECONDS.toSeconds(diff));
        return TimeTaken;
    }

}
