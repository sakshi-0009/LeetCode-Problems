// Problem :- Given an integer n, return any array containing n unique integers such that they add up to 0.

// Solution :-

class Solution {
    public int[] sumZero(int n) {
        int d = -(n/2);
        int arr[] = new int[n];
        if(n%2 != 0){
            for(int i=0; i<n; i++){
                arr[i] = d;
                d++;
            }
        }else{
            for(int i=0; i<n; i++){
                if(d==0){
                    d++;
                }
                arr[i] = d;
                d++;
            }
        }
        return arr;    
    }
}

