class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        
        while(tickets[k] > 0){
            for(int i = 0; i < tickets.length; i++){
                
                if(tickets[i] > 0){
                    tickets[i] -= 1;
                    time++;
                }
                
                if(tickets[k] == 0){
                    return time;
                }
            }
        }
        return time;
    }
}