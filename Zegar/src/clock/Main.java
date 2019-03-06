package clock;

public class Main {
	public static String[] oblicz(int a, int b, int c, int d) {
		// 09:59
		// 19:59
		// 24:59
		
		// Szukam na pierwsze miejsce 2,1,0, szukam na drugie miejsce 4,3,2,1,0 szukam na drugie miejsce 5,4,3,2,1,0 szukam na ostatnie miejsce 9,8,7,6,5,4,3,2,1,0
		int[] cyfry = { a, b, c, d };
		for (int i = 0; i < cyfry.length; i++) {
			for (int j = 0; j < cyfry.length - 1; j++) {
				if (cyfry[j] < cyfry[j + 1]) {
					int tmp = cyfry[j + 1];
					cyfry[j + 1] = cyfry[j];
					cyfry[j] = tmp;
				}
			}

		}
		System.out.println("Pierwsza tablica: "+cyfry[0] + " " + cyfry[1] + " " + cyfry[2] + " " + cyfry[3]); // posortowane malej¹co
		int lokalizacja = 3;
		for(int i = 0; i < cyfry.length; i++)
		{
			if(cyfry[i]>=cyfry[lokalizacja] && cyfry[i]<=2)
			{
				lokalizacja=i;
			}
		}
		int tmp = cyfry[0];
		cyfry[0]=cyfry[lokalizacja];
		cyfry[lokalizacja]=tmp;
		 // mam pierwsza liczbe
		if(cyfry[0]==2)
		{
			lokalizacja = 3;
			System.out.println("Tablica po pierwszym kroku: "+cyfry[0] + " " + cyfry[1] + " " + cyfry[2] + " " + cyfry[3]); 
			for (int i = 1; i < cyfry.length; i++) {
				for (int j = 1; j < cyfry.length - 1; j++) {
					if (cyfry[j] < cyfry[j + 1]) {
						tmp = cyfry[j + 1];
						cyfry[j + 1] = cyfry[j];
						cyfry[j] = tmp;
					}
				}

			}
			for(int i=1;i<cyfry.length;i++)
			{
				if(cyfry[i]>=cyfry[lokalizacja] && cyfry[i]<=4)
				{
					lokalizacja=i;
				}
			}
			tmp = cyfry[1];
			cyfry[1]=cyfry[lokalizacja];
			cyfry[lokalizacja]=tmp;
			System.out.println("Tablica po drugim kroku:"+cyfry[0] + " " + cyfry[1] + " " + cyfry[2] + " " + cyfry[3]); 
			if(cyfry[2]<=5 || cyfry[3] <=5)
			{
				if(cyfry[2]<=5 && cyfry[2]<=cyfry[3])
				{
					System.out.println("Maksymalna godzina: "+cyfry[0] + " " + cyfry[1] + " " + cyfry[2] + " " + cyfry[3]); 
				}
				else
				{
					tmp=cyfry[2];
					cyfry[2]=cyfry[3];
					cyfry[3]=tmp;
					System.out.println("Maksymalna godzina: "+cyfry[0] + " " + cyfry[1] + " " + cyfry[2] + " " + cyfry[3]); 
				}
			}
		}
		else if (cyfry[0]==1 ||cyfry[0]==0)
		{
			lokalizacja = 3;
			System.out.println("Tablica po pierwszym kroku: "+cyfry[0] + " " + cyfry[1] + " " + cyfry[2] + " " + cyfry[3]); 
			for(int i=1;i<cyfry.length;i++)
			{
				if(cyfry[i]>=cyfry[lokalizacja] && cyfry[i]<=9)
				{
					lokalizacja=i;
				}
			}
			tmp = cyfry[1];
			cyfry[1]=cyfry[lokalizacja];
			cyfry[lokalizacja]=tmp;
			System.out.println("Tablica po drugim kroku:"+cyfry[0] + " " + cyfry[1] + " " + cyfry[2] + " " + cyfry[3]); 
			if(cyfry[2]<=5 || cyfry[3] <=5)
			{
				if(cyfry[2]<=5 && cyfry[2]<=cyfry[3])
				{
					System.out.println("Maksymalna godzina: "+cyfry[0] + " " + cyfry[1] + " " + cyfry[2] + " " + cyfry[3]); 
				}
				else
				{
					tmp=cyfry[2];
					cyfry[2]=cyfry[3];
					cyfry[3]=tmp;
					System.out.println("Maksymalna godzina: "+cyfry[0] + " " + cyfry[1] + " " + cyfry[2] + " " + cyfry[3]); 
				}
			}
		}
		else
		{
			System.out.println("Cos poszlo nie tak"); 
		}
		return null;
		
	}

	public static void main(String[] args) {
		oblicz(2,3,9,5);
	}

}
