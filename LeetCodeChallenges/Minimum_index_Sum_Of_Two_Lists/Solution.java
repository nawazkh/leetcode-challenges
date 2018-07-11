class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<Integer,List<String>> commonRestraunts = new HashMap<Integer,List<String>>();
        List<String> rest;
        int least_value = 0;
        for(int i = 0; i < list1.length; i++){
            for (int j = 0; j < list2.length; j++){
                if(list1[i].equals(list2[j])){
                    least_value = i+j;

                    if(commonRestraunts.get(least_value)==null){
                        rest=new ArrayList<String>();
                        rest.add(list1[i]);
                        commonRestraunts.put(least_value,rest);
                    }
                    else{
                        rest = commonRestraunts.get(least_value);
                        rest.add( list1[i]);
                        commonRestraunts.put(least_value,rest);
                    }


                }
            }
        }
        //System.out.println("Found this matching: "+commonRestraunts);
        Integer min = Collections.min(commonRestraunts.keySet());
        //System.out.println(min); // 0.1
        rest = commonRestraunts.get(min);
        String[] arr = new String[rest.size()];
        // ArrayList to Array Conversion
        for (int i =0; i < rest.size(); i++)
            arr[i] = rest.get(i);
        return arr;
    }
}
