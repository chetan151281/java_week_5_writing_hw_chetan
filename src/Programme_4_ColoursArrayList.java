import java.util.ArrayList;

public class Programme_4_ColoursArrayList {

    public static void main(String[] args) {
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("RED");
        colourList.add("BLUE");
        colourList.add("GREEN");
        colourList.add("YELLOW");
        colourList.add("BLACK");
        colourList.add("WHITE");
        colourList.add("ORANGE");
        colourList.add("PURPLE");
        colourList.add("CYAN");
        for (String colorList : colourList){
            System.out.println(colorList + " ,");

        }
    }
}
