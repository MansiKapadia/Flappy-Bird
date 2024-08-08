import javax.swing.*;//javax.swing package, which provides a window for the GUI application.

   public class App{
    public static void main(String[] args) throws Exception
    {
        int boardWidth=360;
        int boardHeight=640;

        JFrame frame=new JFrame("Flappy Birds");//This line creates a new JFrame object named frame with the title "Flappy Bird".
        frame.setVisible(true);//the visibility of the frame to true, making it visible on the screen
        frame.setSize(boardWidth,boardHeight); //frame to the specified width and height.
        frame.setLocationRelativeTo(null);// sets the location of the frame to the center of the screen.
        frame.setResizable(false);//
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird=new FlappyBird();//This line creates an instance of the FlappyBird class, which represents the game panel.
        frame.add(flappyBird);
        frame.pack();//the frame to be sized to fit the preferred size and layouts of its subcomponents. 
        flappyBird.requestFocus();//llowing it to receive keyboard input 
        frame.setVisible(true);

       
    }
}