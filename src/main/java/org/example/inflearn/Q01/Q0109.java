package org.example.inflearn.Q01;


public class Q0109 {
    public int solution(String input) {
        String s = input.replaceAll("[^0-9]", "");
        return Integer.parseInt(s);
    }

    public int solution2(String s){
        //int answer=0;
        String answer="";
        for(char x : s.toCharArray()){
            //if(x>=48 && x<=57) answer=answer*10+(x-48);
			/*if(Character.isDigit(x)){
				answer=answer*10+ Character.getNumericValue(x);
			}*/
            if(Character.isDigit(x)) answer+=x;
        }
        return Integer.parseInt(answer);
    }

}
