package com.practise.ik.floater.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem 1: Controlling Set
 * Date: 16-Jul-2019
 * 
 * Input: str="helloworld", set={'l','r','w'}
 * Output: "lowor", 'oworl',"hellowor"
 * 
 * @author sarat.polavarap''
 *l
 */
public class SubStringProblem {

	public static void main(String[] args) {

		String str= "helloworld";
	}
	
	public void controllingSet(String st, Set<Character> set) {
		Set<String> controllingSets = new HashSet<String>();
		char[] ch_arr = st.toCharArray();
		for(int i=0; i< st.length(); i++) {
			for(int j= i+1; j<st.length(); j++) {
				
			}
		}
		
		
	}

}
