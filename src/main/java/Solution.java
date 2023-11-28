public class Solution {
    public int numberOfWays(String corridor) {
        int modulo = 1_000_000_007;
        int sTotalCount = 0;
        int curSCount = 0;
        int curPCount = 0;
        long totalNumberOfWays = 1;
        for (int i = 0; i < corridor.length(); i++) {
            char ch = corridor.charAt(i);
            if(ch == 'S'){
                sTotalCount++;
                if(curSCount < 2){
                    curSCount++;
                }else {
                    totalNumberOfWays  = (totalNumberOfWays * (curPCount + 1)) % modulo;
                    curPCount = 0;
                    curSCount = 1;
                }
            }
            else if(ch == 'P'){
                if(curSCount == 2){
                    curPCount++;
                }
            }

        }

        if(sTotalCount < 2 || sTotalCount % 2 != 0){
            return 0;
        }

        return (int)totalNumberOfWays;
    }
}
