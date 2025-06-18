class Sample{
int nonprime_sum(int[] input1){

int sum = input1[0]+input1[1];
        for(int i=2;i<input1.length;i++){
            int count = 0;
            for(int j=1;j<=i;j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count > 2){
                sum = sum + input1[i];
            }
        }
        return sum;
		
	}
}
