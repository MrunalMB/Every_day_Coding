class Sol
{
    public static long numberCount (long n, long k)
    {
        // your code here
        long count=0;
        long index=-1;
        long start=1;
        long end=n;
        while(start<=end){
            long mid= start + (end - start )/2;
            long org = mid;
            long sum=0;
            while(org > 0){
                long r = org % 10;
                sum= sum +r;
                org = org /10;
            }
            long diff = mid - sum;
            if(diff < k){
                start= mid + 1;
            }else{
                //count++;
                end = mid -1;
                index=start;
            }
        } 
       // System.out.println(index);
       if(n - start+1 <0){
           return 0;
       }else{
         return (long) n - start+1;
       }
    }
}
