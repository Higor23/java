
public class enquete01 {
    public static void main(String[] args) {
        //array de respostas da enquete
        int[] responses = {1,2,6,4,8,5,9,7,20,1,6,3,8,6,4,8,6,8,10};
        int [] frequency = new int [11]; // array de contadores de frequência
        
        for(int answer = 0; answer<responses.length; answer++)
        ++frequency[responses[answer]];
        System.out.printf("%s%10s", "Rating", "Frequency");
        
        for(int rating = 1; rating < frequency.length; rating++)
            System.out.printf("%d%10d", rating, frequency[rating]);
    }
    
}
