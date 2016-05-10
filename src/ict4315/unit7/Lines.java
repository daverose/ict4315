package ict4315.unit7;


public class Lines {
    String twolines;
    String fivelines;
    String sevenLines;

    public void setLines(){
        twolines = twoLines();
        fivelines = fivelines();
        sevenLines = sevenLines();
    }
    public String fivelines() {
        StringBuilder string = new StringBuilder();
        string.append("Hi there." + System.lineSeparator() + "How are you?" +
                System.lineSeparator() + "I hope you are well." +
                System.lineSeparator() + "I am feeling good, myself. Thank you." +
                System.lineSeparator() + "I guess I will be going now");
        return string.toString();
    }
    public String twoLines() {
        StringBuilder string = new StringBuilder();
        string.append("I need some cofee. Do you have any?" + System.lineSeparator() + "What? No? I'm going to Starbucks!");
        return string.toString();
    }
    public String sevenLines() {
        StringBuilder string = new StringBuilder();
        string.append("Someone told me you hate Starbucks" + System.lineSeparator() + "You're kidding, right?" +
                System.lineSeparator() + "What, are you one of those Dunkin Doughnuts people?" +
                System.lineSeparator() + "Their coffee is like water and the doughnuts are made with Crisco" +
                System.lineSeparator() + "If you want to wake up..." + System.lineSeparator()
                + "and be able to do your homework..." + System.lineSeparator() + "only Starbucks will do.");
        return string.toString();
    }
}
