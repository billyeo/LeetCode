class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> stack= new HashSet<String>();
        
        for(int i=0; i< words.length;i++){
            String temp = "";
            for(int j=0; j< words[i].length();j++){
                char curr = words[i].charAt(j); //holds the character
                int ascii = (int) curr;
                ascii -= 97;
                
                temp += morse[ascii];
            }
            stack.add(temp);
            //System.out.println(temp);
        }
        
        return stack.size();
    }
}
