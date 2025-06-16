class Sample{
int ispalindrome(int input1){

String s = input1 + "";
        int n = s.length()-1;
        boolean flag = false;
        for(int i=0;i<s.length()/2;i++){
            char x = s.charAt(i);
            char y = s.charAt(n);
            if(x != y){
                flag = true;
                break;
            }
            n--;
        }
        if(flag){
            return 1;
        }else{
            return 2;
        }
	}
}
