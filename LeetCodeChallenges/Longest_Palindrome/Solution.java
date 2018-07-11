class Solution {
    public int longestPalindrome(String s) {
        Map<String,Integer> givenLetters = new HashMap<String,Integer>();
        String[] temp = s.split("");
        //System.out.println(temp.length);
        for(int i = 0; i < temp.length; i++){
            if(givenLetters.get(temp[i]) == null){
                givenLetters.put(temp[i],1);
            }
            else{
                givenLetters.put(temp[i],(givenLetters.get(temp[i])+1));
            }
        }
        //System.out.println("len is"+givenLetters.get("c"));
        int finalLength=0,maxOddLen = 0,counter=0,myVal=0;;
        for (Map.Entry<String, Integer> entry : givenLetters.entrySet()) {
            // String key = entry.getKey();
            Integer value = entry.getValue();
            if(value%2 == 0){//even, can be added to palindrome
                finalLength = finalLength+value;
            }
            else if(value%2 != 0){//find max odd length
                // also add last maxOddLen-1 to the value
                counter++;
                myVal=myVal+value;
                if(value>=maxOddLen){
                    maxOddLen = value;
                }

            }
        }
        //System.out.println("finalLength:"+finalLength+" maxOddLen:"+maxOddLen);
        if(maxOddLen>0){
            return (finalLength+maxOddLen+myVal-maxOddLen+1-counter);
        }
        else{
            return (finalLength);
        }

    }
}
