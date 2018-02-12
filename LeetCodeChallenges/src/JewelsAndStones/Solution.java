/*
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
*/
class Solution {
    public int numJewelsInStones(String J, String S) {
        String[] jTemp = J.trim().split("");
        String[] sTemp = S.trim().split("");
        int myCounter = 0;
        int retValue = 0;
        for(int i = 0; i < J.length(); i++){
            //System.out.println(S[i]);
            if( S.contains(jTemp[i]) ){
                for(int j = 0; j < S.length(); j++){
                    if(sTemp[j].equals(jTemp[i])){
                        retValue++;
                        sTemp[j] = "0";
                    }
                }
            }
            else{
                myCounter++;
            }
            
        }
        return retValue;
    }
}
