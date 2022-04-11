package algo;
import java.util.Arrays;

public class 로또최고순위최저순위 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		int [] lottos = {44, 1, 0, 0, 31, 25};
		int [] win_nums = {31, 10, 45, 1, 6, 19};
		
		int[] ans = sol.solution(lottos,win_nums);
		System.out.println(ans);
	}

}


class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
    	int[] answer = {0,0};
        int check = 0;
        int zero = 0;
        for(int i = 0; i < 6; i++) {
        	if(lottos[i] == 0) {
        		zero += 1;
        		continue;
        	}
            for(int k = 0; k < 6; k++) {
            	if( lottos[i] == win_nums[k]) {
            		check += 1;
            		break;
            	}
            		
            }	
        }
        System.out.println((7-check)+ "  " + (7 -( check + zero)));
        
        answer[0] = (7 -( check + zero));
        answer[1] = (7-check);
        if((7 -(check + zero)) == 7)
        	answer[0] = 6;
        else
        	answer[0] = (7 -( check + zero));

        if((7-check) == 7)
        	answer[1] = 6;
        else
        	answer[1] = (7-check);
        return answer ;
        
    }
}

class Solution1 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int cnt1 = 0;
        int cnt2 = 0;
        for(int i : lottos) {
            if(i == 0) {
                cnt1++;
                continue;
            }
            for(int j : win_nums) {
                if(i == j) cnt2++;
            }
        }


        answer[0] = getGrade(cnt1+cnt2);
        answer[1] = getGrade(cnt2);

        return answer;
    }

    public int getGrade(int n) {
        switch(n) {
            case 6 :
                return 1;
            case 5 :
                return 2;
            case 4 :
                return 3;
            case 3 :
                return 4;
            case 2 :
                return 5;
            default :
                return 6;
        }
    }
}