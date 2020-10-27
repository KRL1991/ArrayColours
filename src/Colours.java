import java.awt.*;


public class Colours {

    static final int X = 10;
    static final int Y = 10;
    static Color[] colours = new Color[X];

    public static void main(String[] args) {
        chosenColours();
        randomColours();




    }

    public static void chosenColours(){

        colours [0] = Color.red;
        colours [1] = Color.green;
        colours [2] = Color.gray;
        colours [3] = Color.black;
        colours [4] = Color.blue;
        colours [5] = Color.yellow;
        colours [6] = Color.pink;
        colours [7] = Color.white;
        colours [8] = Color.orange;
        colours [9] = Color.magenta;



        System.out.println("The ArrayLength is " + colours.length);
    }

    public static void randomColours() {


        Color[] colors = new Color [Y];

        boolean randomTest = true;

        boolean colourExists;


        int i = 0;
        while(randomTest) {

            colourExists = false;

            Color randomColour = colours[(int) (Math.random() * 10)];

            int j = 0;
            while (j < colors.length) {

                if (colors[j] == randomColour) {
                    colourExists = true;
                    break;
                }

                j++;
            }


            if (i == X) {
                randomTest = false;
            }

            if (!colourExists) {

                colors[i] = randomColour;
                System.out.println(colors[i] + "\n");

                i = i + 1;

            }

        }

    }


}





