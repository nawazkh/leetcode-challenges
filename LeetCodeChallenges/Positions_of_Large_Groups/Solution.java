class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<Integer> myList;
        List<List<Integer>> tempList = new ArrayList<List<Integer>>();
        String[] temp = S.split("");
        int counter = 1;
        String left = temp[0];
        //System.out.println(temp.length);
        for(int i = 1; i<temp.length; i++){
            if(left.equals(temp[i])){
                //there are two characters
                counter++;
                //System.out.println(temp[i]);
            }
            else if(!left.equals(temp[i])){
                //sequence broke
                left=temp[i];//new char
                if(counter >= 3){
                    myList = new ArrayList<Integer>();
                    //System.out.println(counter);
                    //System.out.println((i-counter)+" "+(i-1));
                    myList.add(i-counter);
                    myList.add(i-1);
                    tempList.add(myList);
                }
                counter = 1;
            }
            if( i == (temp.length-1) && counter >=3){
                myList = new ArrayList<Integer>();
                //System.out.println(counter);
                //System.out.println((i-counter)+" "+(i-1));
                myList.add(i-counter+1);
                myList.add(i);
                tempList.add(myList);
            }
        }
        //System.out.println(temp[0]);
        return tempList;
    }
}
