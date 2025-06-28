class Solution{
  int pin(int input1,int input2,int input3){
    int sol = 0;int min;int max = 0;int max_num;
		for(int l=0;l<3;l++){
            int n=input1%10;
            int m = input2%10;
            int p = input3%10;
            if(n>m){
                if(p>m){
                    min =m;
                }else{
                    min = p;
                }
            }else{
                if(p>n){
                    min = n;
                }else{
                    min = p;
                }
            }
            sol = sol*10+min;
            if(n<m){
                if(p<m){
                    max_num =m;
                }else{
                    max_num = p;
                }
            }else{
                if(p<n){
                    max_num = n;
                }else{
                    max_num = p;
                }
            }
            if(max_num>max){
                max = max_num;
            }

            input1 = input1/10;input2 = input2/10;input3 = input3/10;
        }
        int res = max;
        for(int i=0;i<3;i++){
            int x = sol%10;
            res = res*10+x;
            sol = sol/10;
        }
        return res;
	}
}
