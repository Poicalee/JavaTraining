//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        long nums [] = {1000000,1,1000000};
        int i,j,k;
        int triplet;
        long sum;
        long best = 0;

        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                for(k=j+1;k<nums.length;k++){
                    sum =  (nums[i] - nums[j]) *nums[k];
                    if(sum>best){
                        best = sum;
                    }
                    System.out.println(best);
                }
            }
        }

    }
}