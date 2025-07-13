Class Sample{
  int Non-Repeated_count(int input1){
    int count = 0;
    String s = input1+"";
    String str="";
    for(int i=0;i<s.length();i++){
      boolean flag = true;
      char x = s.charAt(i);
      if(!(str.contains(x+""))){
        for(int j=i+1;j<s.length();j++){
          char y = s.charAt(j);
          if(x==y){
            flag = false;
            break;
          }
        }
        if(flag){
          count++;
        }
        str = str + x;
      }
    }
    return count;
  }
}
