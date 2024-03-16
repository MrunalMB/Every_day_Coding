class Solution{
    static long findGF(long N){
        if(N==1 || N==2){
            return N-1;
        }
        return (long) (Math.pow(findGF(N-2), 2) - findGF(N-1));
    }
    
    static void gfSeries(int N){
        for(int i = 1; i <= N; i++){
            System.out.print(findGF(i) + " ");
        }
        System.out.println();
    }
}
