import processing.core.PApplet;
public class Processing extends PApplet{

    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    public static final int DIAMETER = 100;
    public static int xCounter = 0;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        System.out.println("Printed from setup method");
    }

    @Override
    public void draw() { //Called indefinitely in a loop
        int ballOneXCoordinate, ballTwoXCoordinate, ballThreeXCoordinate, ballFourXCoordinate;
        paintWhite();
        
        // Ball 1
        drawBall(1);

        // Ball 2
        drawBall(2);
        
        // Ball 3
        drawBall(3);

        // Ball 4
        drawBall(4);

        xCounter++;

    }

    private void drawBall(int ballNumber) {
        int ballXCoordinate;
        ballXCoordinate = (xCounter*ballNumber)%WIDTH;
        ellipse(ballXCoordinate, (ballNumber*HEIGHT)/5, DIAMETER, DIAMETER);
    }

    private void paintWhite() {
        background(255);
    }

    public static void main(String[] args) {
        PApplet.main("Processing", args);
    }
}
