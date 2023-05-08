package org.example;

public class SumCalculator {
    public int sum(int n){
        if(n<1){
            throw new IllegalArgumentException("n must be greater than or equal to 1");
        }
        int res=0;
        for (int i=1;i<=n;i++){


            res=res+i;


        }
      return  res;
    }
}
