class Sample{
  int evensum(int input1){

int sum = 0;
        while(input1 !=0){
            int rem = input1%10;
            if(rem%2 ==0){
                sum = sum+rem;
            }
            input1 = input1/10;
        }
        return sum;
	}
}
