package lowFareRouting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
class Dijkstra {
		public static void main(String args[]) throws Exception
		{
			File file = new File("distance1.txt");
			File file1 = new File("ha29_name.txt");
			File file2 = new File("ha29_code.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			BufferedReader brname = new BufferedReader(new FileReader(file1));
			BufferedReader brcode = new BufferedReader(new FileReader(file2 ));
			int vertices=29;
			String st2=brname.readLine();
			String st1=brname.readLine();
			String st;
			// ArrayList<String> Countries=new ArrayList<String>();
			String Countries[]=new String[29];
			int a=0;
			while ((st = brname.readLine()) != null)
			{
				Countries[a]=st;
				a++;
			}
			String st3=brcode.readLine();
			String st4=brcode.readLine();
			String st5;
			// ArrayList<String> CountryCodes=new ArrayList<String>();
			String CountryCodes[]=new String[29];
			int b=0;
			while ((st5 = brcode.readLine()) != null)
			{
				CountryCodes[b]=st5;
				b++;
			}
			System.out.println(Countries);
			System.out.println(CountryCodes);
			String st6=br.readLine();
			String st7=br.readLine();
			String st8=br.readLine();
			int matrix[][]=new int[29][29];
			int i=0;
			String s;
			while((s=br.readLine())!=null)
			{
				int count=0;
				String[] sq=s.split("  ");
				for(int j=0;j<29;j++)
				{
					String sd=sq[j];
					matrix[i][j]=Integer.parseInt(sd);
					count++;
				}  
				i++;
			}
			LowFareRouting graph=new LowFareRouting(vertices,matrix,Countries,CountryCodes);
			ShortestPath sp=new ShortestPath();
			String s1="AZ";
			int h=0;
			for(int i2=0;i2<29;i2++)
			{
				if(s1.equals(CountryCodes[i2]))
				{
					h=i2;
					//System.out.println(h);
					break;
				}
			}
			sp.dijkstra(matrix, h,Countries);

			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			Floyd a1 = new Floyd();
			String src="AZ";
			String desti="GM";
			int h1=0;
			for(int i2=0;i2<29;i2++)
			{
				if(src.equals(CountryCodes[i2]))
				{
					h1=i2;
					//System.out.println(i2);
					break;
				}
			}
			int h11=0;
			for(int i2=0;i2<29;i2++)
			{
				if(desti.equals(CountryCodes[i2]))
				{
					h11=i2;
					//System.out.println(i2);
					break;
				}
			}
			//   System.out.println(h1+"   "+h11);
			//a1.floydWarshall(matrix,graph,h1,h11);
		}
	}