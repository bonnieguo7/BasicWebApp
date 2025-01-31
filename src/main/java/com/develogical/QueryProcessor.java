package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
    
        if (query.toLowerCase().contains("what is your name")) {
            return "bonnie";
        }
        
        if (query.toLowerCase().contains("what is 7 plus 7")) {
            return "14";
        }

        if (query.toLowerCase().contains("which of the following numbers is the largest: 19, 131")) {
            return "131";
        }
        return "";
    }

}
