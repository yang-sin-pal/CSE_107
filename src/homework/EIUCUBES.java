package homework;
import java.util.*;;
public class EIUCUBES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numBricks = sc.nextInt();
        int numLayers = (int)Math.cbrt(numBricks*6);
        int currentBricks = (numLayers*(numLayers+1)*(numLayers+2))/6;
        if (currentBricks > numBricks)
            numLayers--;
        System.out.println(numLayers);
        sc.close();
    }
}
