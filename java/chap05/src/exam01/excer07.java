package exam01;

public class excer07 {

    public static void main(String[] args) {
        
        int scores[] = {5, 4, 3, 2, 1}; 
        
        
        System.out.println("scores[0]:" + scores[0]);
        System.out.println("scores[1]:" + scores[1]);
        System.out.println("scores[2]:" + scores[2]);
        System.out.println("scores[3]:" + scores[3]);
        System.out.println("scores[4]:" + scores[4]);

        
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        
    }
}