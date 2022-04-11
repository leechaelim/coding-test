import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        // 숏코딩
        //System.out.println(45 - Arrays.stream(numbers).sum()); 
        for(int i = 0; i < 10; i++){
            answer += i;
            for(int k:numbers){
                if(i == k){
                    answer -= i;
                    break;
                }
            }
        }
        return answer;
    }
}