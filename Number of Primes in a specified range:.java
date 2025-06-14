class Sample{
  int prime(int input1,int input2){
    int result = 0;
    for(int i=input1 ; i<=input2;i++){
      int count = 0;
      for(int j = 1;j<=i;j++){
        if(i%j == 0){
          count++;
        }
      }
      if(count == 2){
        result++;
      }
    }
    return result;
  }
  
} 
