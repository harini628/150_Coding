class Sample{
int func(int input1,int input2){

int result = input1;
        if(input2 == 1){
            while(input1 != 0){
                if(input1%2 == 0){
                    result = result - (input1 -1);
                    

                }else{
                    result = result + (input1 - 1);
                }
                input1--;
            }

        }else{
            while(input1 != 0){
                if(input1%2 != 0){
                    result = result - (input1 -1);
                    

                }else{
                    result = result + (input1 - 1);
                }
                input1--;
            }

        }
        return result;
