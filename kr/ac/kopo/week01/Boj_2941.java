package kr.ac.kopo.week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2941 {

	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inStr = br.readLine();
		
		System.out.println(resetString(inStr));
	}
	
	public static int resetString(String str) {
		
		String alpha[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String result=str;
		
		for(int i = 0; i < alpha.length; i++) {
			result = result.replace(alpha[i], "1");
		}
		return result.length();
	}
}
