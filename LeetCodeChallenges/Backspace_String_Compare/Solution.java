class Solution {
    public boolean backspaceCompare(String S, String T) {
        String temp=S;
        if(S.equals(T)){
            return true;
        }
        else{
            while(S.contains("#")){
                int pos = S.indexOf("#");
                if(pos == 0){
                    //ignore
                    S = S.substring(1,S.length());
                }
                 else if(pos == (S.length()-1)){//last char is #
                    S = S.substring(0,pos-1);
                }
                else{
                    S=S.substring(0,pos-1)+""+S.substring(pos+1,S.length());
                }
            }
            // System.out.println(S);
            while(T.contains("#")){
                int pos = T.indexOf("#");
                if(pos == 0){
                    //ignore
                    T = T.substring(1,T.length());
                }
                else if(pos == (T.length()-1)){//last char is #
                    T = T.substring(0,pos-1);
                }
                else{
                    T=T.substring(0,pos-1)+""+T.substring(pos+1,T.length());
                }
            }
            // System.out.println(T);
        }
        if(S.equals(T)){
            return true;
        }
        else {
            return false;
        }
    }
}
