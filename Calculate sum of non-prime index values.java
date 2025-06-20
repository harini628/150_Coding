class Sample{

int sum_primeindex(int[] input1){

int sum = 0;
        for(int i=0;i<input1.length;i++){
            int count = 0;
            for(int j=1;j<=input1.length;j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count!=2 || i==0 || i==1){
                sum = sum+input1[i];
            }
        }
        return sum;
		
	}
}
