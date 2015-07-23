package com.jakubsprega.untestable.code.g;

/**
 * Console printer
 * 
 * @author jakubsprega
 */
public class ConsolePrinter {
    
    
    /**
     * Prints given text into standard output in given {@link TextFormat}
     * 
     * @param text text to be printed
     * @param textFormat text format
     */
    public void print(String text, TextFormat textFormat){
        System.out.println(formatText(text, textFormat));
    }
    
    /**
     * Format text according to given {@link TextFormat}
     * 
     * @param text text to be formatted
     * @param textFormat text format
     * @return formatted text
     */
    public String formatText(String text, TextFormat textFormat) {
        switch(textFormat){
            case NORMAL:
                return text;
            case LOWERCASE:
                return text.toLowerCase();
            case UPPERCASE:
                return text.toUpperCase();
            default:
                return text;
        }
    }
}
