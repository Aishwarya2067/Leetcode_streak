class Solution {
    public String intToRoman(int num) {
        String roman="";
        int copy=num;
        int d= copy%10;
        units:{
            if(d==9){
                roman = "IX" + roman;
            }
            else if(d>=5){
                roman = "V" + roman;
                for(int i= 0; i< d-5; i++)
                    roman+= "I";
            }
            else if(d==4)
                roman+="IV";
            else
                for(int i= 0; i< d; i++)
                    roman+= "I";
        }
        copy= copy/10;
        d=copy%10;
        tens: {
            if(d==9){
                roman = "XC" + roman;
            }
            else if(d>=5){
                for(int i= 0; i< d-5; i++)
                    roman= "X" + roman;
                roman = "L" + roman;
                
            }
            else if(d==4)
                roman="XL"+roman;
            else
                for(int i= 0; i< d; i++)
                    roman= "X" + roman;
        }
        copy= copy/10;
        d= copy%10;
        hundreds: {
            if(d==9){
                roman = "CM" + roman;
            }
            else if(d>=5){
                for(int i= 0; i< d-5; i++)
                    roman= "C" + roman;
                roman = "D" + roman;
                
            }
            else if(d==4)
                roman="CD"+roman;
            else
                for(int i= 0; i< d; i++)
                    roman= "C" + roman;
        }
        copy= copy/10;
        d= copy%10;
        thousands: {
                for(int i= 0; i< d; i++)
                    roman= "M" + roman;
        }
        return roman;
    }
}