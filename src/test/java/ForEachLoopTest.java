import org.junit.jupiter.api.Test;

public class ForEachLoopTest {
    @Test
    public void iterateArray() {
        int array[] = {1,3,4,5,5,6,7,7,8,89,8,67565};
        
        for (int i : array) {
            System.out.println("i = " + i);
        }
    }
}
