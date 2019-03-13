package tekst;

import java.util.Scanner;

public class Tekst {
	public static void main(String[] args) {
		int i = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj nazwisko: ");
		String nazwisko = scan.nextLine();
		StringBuilder nowy = new StringBuilder().append(nazwisko);
		for(i=1;i<nowy.length();i++)
		{
			if(nowy.charAt(i)=='H'||nowy.charAt(i)=='h')
			{
				nowy.deleteCharAt(i);
			}
		}
		System.out.println("1. "+nowy);
		StringBuilder samogloski = new StringBuilder().append("aeyio¹êuó");
		StringBuilder spolgloski = new StringBuilder().append("bcædfghjklmnprstwyz¿Ÿ");
		int DlugoscCiagu = 0;
		boolean pasuje = false;
		for(i=0;i<nowy.length();i++)
		{
			for(int j=0;j<spolgloski.length();j++)
			{
				if(nowy.charAt(i)==spolgloski.charAt(j))
				{
					pasuje=true;
					break;
				}
				else
				{
					pasuje=false;
				}
			}
			if(pasuje==true)
			{
				DlugoscCiagu++;
			}
			else
			{
				if(DlugoscCiagu>1)
				{
					nowy.replace(i-DlugoscCiagu,i, Character.toString(nowy.charAt(i-DlugoscCiagu)));
				}
				DlugoscCiagu=0;
			}
			
			
		}
		System.out.println("2. " +nowy);
		
		DlugoscCiagu = 0;
		pasuje = false;
		for(i=0;i<nowy.length();i++)
		{
			for(int j=0;j<samogloski.length();j++)
			{
				if(nowy.charAt(i)==samogloski.charAt(j))
				{
					pasuje=true;
					break;
				}
				else
				{
					pasuje=false;
				}
			}
			if(pasuje==true)
			{
				DlugoscCiagu++;
			}
			else
			{
				if(DlugoscCiagu>1)
				{
					nowy.replace(i-DlugoscCiagu,i, Character.toString(nowy.charAt(i-DlugoscCiagu)));
				}
				DlugoscCiagu=0;
			}
			
			
		}
		System.out.println("3. " +nowy);
		
		for(i=1;i<nowy.length();i++)
		{
			if(nowy.charAt(i)=='i'||nowy.charAt(i)=='y')
			{
				nowy.setCharAt(i,'e');
			}
		}
		System.out.println("4. " +nowy);
		
		for(i=1;i<nowy.length();i++)
		{
			if(nowy.charAt(i)=='p')
			{
				nowy.setCharAt(i,'b');
			}
		}
		System.out.println("5. " +nowy);
		
		for(i=1;i<nowy.length();i++)
		{
			if(nowy.charAt(i)=='k'||nowy.charAt(i)=='s')
			{
				nowy.setCharAt(i,'c');
			}
		}
		System.out.println("6. " +nowy);
		
		for(i=1;i<nowy.length();i++)
		{
			if(nowy.charAt(i)=='t')
			{
				nowy.setCharAt(i,'d');
			}
		}
		System.out.println("7. " +nowy);
		
		for(i=1;i<nowy.length();i++)
		{
			if(nowy.charAt(i)=='j')
			{
				nowy.setCharAt(i,'g');
			}
		}
		System.out.println("8. " +nowy);
		
		for(i=1;i<nowy.length();i++)
		{
			if(nowy.charAt(i)=='n')
			{
				nowy.setCharAt(i,'m');
			}
		}
		System.out.println("9. " +nowy);
		
		for(i=1;i<nowy.length();i++)
		{
			if(nowy.charAt(i)=='w')
			{
				nowy.setCharAt(i,'v');
			}
		}
		System.out.println("10. " +nowy);
	}

}
