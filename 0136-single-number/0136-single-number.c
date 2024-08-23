int singleNumber(int* nums, int numsSize) {
    
    int flag=1,b,sum=0;
    for(int i=0;i<numsSize;i++)
    {
        // flag==1;
        // for(int j=0;j<numsSize;j++)
        // {
        //     if(nums[i]==nums[j]&&i!=j)
        //     {
        //         flag=0;
        //     }

        // }
        // if(flag==1)
        // {
        //     b=nums[i];
        // }
        sum=sum^nums[i];
    }
    return sum;
}