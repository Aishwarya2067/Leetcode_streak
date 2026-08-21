int findClosestNumber(int* nums, int numsSize) {
    int closest= nums[0];
    for(int i=0; i<numsSize; i++){
        int closestdist=abs(closest), currentdist=abs(nums[i]), current=nums[i];
        if(currentdist<closestdist){
            closest= current;
        }
        else if(currentdist==closestdist&& closest<current)
        closest= current;
        else continue;
    }
    return closest;

}