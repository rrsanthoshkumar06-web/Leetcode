class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(ans.size()==0 || ans.get(0)!=nums[i]&&(ans.size()<2|| ans.get(1)!=nums[i])){
                int count=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[j]==nums[i]){
                        count++;
                    }
                }
                if(count>n/3){
                    ans.add(nums[i]);
                }
            }
        }
        return ans;
    }
}