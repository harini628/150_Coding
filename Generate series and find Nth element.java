class Sample{
  int series(int input1,int input2,int input3,int input4){

int x = input2 - input1;int y = input3 - input2;int sum = input1;
		for(int i=2;i<=input4;i++){
            if(i%2 == 0){
                sum = sum+x;

            }else{
                sum = sum + y;
            }
        }
        return sum;
	}
}
