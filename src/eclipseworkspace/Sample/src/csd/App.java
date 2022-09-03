/*-----------------------------------------------------------------------------------------------------------------------	
	Sınıf Çalışması: Parametresi ile aldığı bir yazının içerisindeki sondan ilk uzun palindromu döndüren getLastLongestPalindrome 
	isimli metodu yazınız ve aşağıdaki kod ile test ediniz. Yazı palindrom içermiyorsa metot boş string'e geri dönecektir.
	Örnek: adaeyedipadanadapideyeecealipapilaanastasmumsatsana
	Örnek: adaeyedipadanadapideyeecealipapilaanastasmumsatsanaxxxxyyyyttuabc
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

import java.util.Random;

class App {
	public static void main(String [] args)
	{	
		GetLastLongestPalindromeTest.run();
	}
}

class GetLastLongestPalindromeTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		java.util.Random r = new java.util.Random();
		
		for (;;) {			
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.println(StringUtil.getLastLongestPalindrome(s));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class StringUtil {
	public static String getLastLongestPalindrome(String s)
	{
		//TODO:
	}
	
	public static boolean isPalindrome(String s)
	{
		int left = 0;
		int right = s.length() - 1;
		boolean cLeftFound = false;
		char cLeft = '\0', cRight = '\0';
		
		while (left < right) {
			if (!cLeftFound) {
				cLeft = Character.toLowerCase(s.charAt(left));
				
				if (!Character.isAlphabetic(cLeft)) {
					++left;
					continue;
				}
				
				cLeftFound = true;
			}
			
			cRight= Character.toLowerCase(s.charAt(right));
			
			if (!Character.isAlphabetic(cRight)) {
				--right;
				continue;
			}
			
			if (cLeft != cRight)
				return false;	
			
			
			++left;
			--right;
			cLeftFound = false;
		}
		
		return true;		
	}
}

