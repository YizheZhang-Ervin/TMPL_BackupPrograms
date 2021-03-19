class testAnagrams{
public static void main(String[] args){
        String a="anagram";
        String b="margana";
        String xx="";
        String yy="";
        String[] x=new String[a.length()];
        String[] y=new String[b.length()];
        for(int i=0;i<a.length();i++){
             x[i]=String.valueOf(a.charAt(i));
             
        }
        for(int j=0;j<b.length();j++){
            y[j]=String.valueOf(b.charAt(j));
        }

        java.util.Arrays.sort(x,String.CASE_INSENSITIVE_ORDER);
        java.util.Arrays.sort(y,String.CASE_INSENSITIVE_ORDER);

        for(int k=0;k<a.length();k++){
            xx=xx.concat(x[k]);
           //System.out.print(x[k]);
        }
        for(int l=0;l<b.length();l++){
            yy=yy.concat(y[l]);
            //System.out.print(y[l]);
        }

       
        //System.out.print(xx+"     "+yy);
        if(xx.compareToIgnoreCase(yy)==0) System.out.print("true");
        else System.out.print("false");
}
}
