class Solution{

int Weight_of_hill_pattern(int input1;int input2;int input3){
int sum = 0;int x = input2;
		for(int i=1;i<=input1;i++){
            for(int j=1;j<=i;j++){
                
                sum = sum + x;
            }
            
            x = x + input3; 
        }
        return sum;
	}
}
