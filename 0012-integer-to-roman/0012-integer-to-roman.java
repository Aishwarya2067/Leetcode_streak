class Solution {
    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder("");
        int copy=num;
        int i=6;
	    char ch[]= {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        while(copy>0){
            int d= copy%10;
            if(d==9){
                roman.insert(0, ch[i]);
                roman.insert(1, ch[i-2]);
            }
            else if(d>=5){
                roman.insert(0, ch[i-1]);
                for(int j= 0; j< d-5; j++)
                    roman.insert(1, ch[i]);
            }
            else if(d==4){
                roman.insert(0, ch[i]);
                roman.insert(1, ch[i-1]);
            }
            else
                for(int j= 0; j< d; j++)
                   roman.insert(0, ch[i]);
            copy= copy/10;
            i=i-2;
        }
        
        return roman.toString();
    }
}