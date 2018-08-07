class stringexample{
public static void main(String args[]){
    String s="mmababctamantlslmag";
    int count = 0 ;
    String n="";
    for (int i = 0; i < s.length(); i++) {

        for (int j = 0; j < s.length(); j++) {

            if(s.charAt(i)==s.charAt(j))
            {
                count++;

            }
        }   
        for(int k=0;k<count;k++)
            {
                n=n+s.charAt(i);
            }
        String d=String.valueOf(s.charAt(i)).trim();
        s=s.replaceAll(d,"");
        count = 0;

    }
    System.out.println(n);

}
}