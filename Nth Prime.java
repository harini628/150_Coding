class Sample{
int NthPrime(int input1){
int c = 1;int i = 2;
        while(c <= input1){
            int count = 0;
            for(int n = 1;n<=i;n++){
                if(i%n == 0){
                    count++;
                }
            }
            if(count == 2){
                c++;
            }
            i++;
        }
        return i-1;
	}
}
