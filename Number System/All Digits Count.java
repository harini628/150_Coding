class Sample{
int Digitscount(int input1){
int c = 0;
		while(input1 != 0){
            input1 = input1/10;
            c++;
        }
        return c;
	}
}
