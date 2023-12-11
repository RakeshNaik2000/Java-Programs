public static int getLen_is_Negative(int []input1,int input2){
        // write code here
        
        int mx = -1;
        int count=0;
        for(int i=0;i<input1.length+1;i++){
            if(i!=input1.length && input1[i]<0){
                count++;
            }
            else{
                mx = (int)Math.max(mx,count);
                count=0;
            }
        }
        if(mx==0){
            return -1;
        }
        else{
            return mx;
        }
