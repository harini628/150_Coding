class Sample{
  int oddoreven_sum(int input1,String input2){

int sum = 0;
		if(input2.equals("even")){
            while(input1 !=0){
                int rem = input1%10;
                if(rem%2 == 0){
                    sum = sum+rem;
                }
                input1 = input1/10;
            }

        }else{
            while(input1 !=0){
                int rem = input1%10;
                if(rem%2 != 0){
                    sum = sum+rem;
                }
                input1 = input1/10;
            }

        }
        return sum;
	}
}
