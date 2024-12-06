public class S53BINARYSUBARRSSUM {
     // public int numSubarraysWithSum(int[] nums, int goal) {
    //     int n = nums.length;
    //     int count=0;
    //     for(int i=0;i<n;i++){
    //         int sum=0;
    //         for(int j=i;j<n;j++){
    //             sum+=nums[j];
    //             if(sum==goal) count++;
    //             else if(sum>goal){
    //                 break;
    //             }
    //         }
    //     }
    //     return count;
    // }

    
    //BETTER
    // public int numSubarraysWithSum(int[] nums, int goal) {
    //     int n = nums.length;
    //     int count=0,sum=0;
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     map.put(0,1);
    //     for(int i=0;i<n;i++){
    //         sum+=nums[i];
    //         if(map.containsKey(sum-goal)){
    //             count+=map.get(sum-goal);
    //         }
    //         map.put(sum,map.getOrDefault(sum,0)+1);
    //     }
    //     return count;   
    // }


    //OPTIMAL
    public int f(int[] nums, int goal){
        int l=0,r=0,cnt=0,sum=0;
        if(goal<0) return 0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            cnt+=(r-l+1);
            r++;
        }
        return cnt;
    }
    public int numSubarraysWithSum(int[] nums, int goal){
        return f(nums,goal)-f(nums,goal-1);
    }
    
    public static void main(String[] args) {
        
    }
}
