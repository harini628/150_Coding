class sample{
long fibonacci(int input1){
if(input1 == 1){
            return 0;
        }else if(input1 == 2){
            return 1;
        }else{
            long a = 0;
            long b = 1;
            long c = 0;
		for(int i=1;i<input1-1;i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
        }
        
	}
}
