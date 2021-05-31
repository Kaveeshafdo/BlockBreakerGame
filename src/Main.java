
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Main {
    
     public static void main(String[] args) {
        JFrame frame = new JFrame("Block breaker");
        
        BlockBreakerPanel panel= new BlockBreakerPanel();
        frame.getContentPane().add(panel);
        
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(498,600);
        frame.setResizable(false);
        
        
    }
}
