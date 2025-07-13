class Sample{

int Sum_cyclic(int input1){

String s = input1+"";
        int sum = 0;int n = 0;
        while(n!=6){
            for(int i=n;i<s.length();i++){
                char x = s.charAt(i);
                sum = sum + (x - '0');
            }
            n++;
        }
        return sum;
	}
}
