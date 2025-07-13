class Sample{
int unique_count(int input1){

int count = 0;
        String num = "";
        while(input1 !=0){
            int rem = input1%10;
            String s = rem + "";
            if( !(num.contains(s)) ){
                num = num + s;
                count++;

            }
            input1 = input1/10;
        }
        return count;
    }
}
