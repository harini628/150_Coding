class Sample{
  int password(int input1,int input2,int input3,int input4,int input5){
int input[] = {input1,input2,input3,input4,input5};
        int result = 0;
        for(int i = 0;i<5;i++){
            int n = input[i];
            boolean stable = true;
            int count[] = new int[10];
            while(n>0){
                int rem = n%10;
                count[rem]++;
                n = n/10;
            }
            for(int k =0;k<10;k++){
                
                if(count[k]!=0 && stable == true){
                    for(int j=k+1;j<10;j++){
                        if(count[k] != count[j] && count[j]!=0){
                            stable = false;
                            break;
                        }
                    }
                }
            }
            if(stable){
                result = result + input[i];
            }else{
                result = result - input[i];
            }
        }
        return result;

	}
}
