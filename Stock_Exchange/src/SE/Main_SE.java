package SE;

import java.io.File;
import java.util.*;
public class Main_SE {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no_of_testcases = 5;
		int i = 0;
		while(i < no_of_testcases){
			String inputFile = "input00"+i+".txt";
			//String outputFile = "output00"+i+".txt";
			try {
				ReadInput(inputFile);
			} catch (Exception e) {
				e.printStackTrace();
			}
			i++;
		}
	}


	public static void ReadInput(String inputFile) throws Exception{
		Scanner sc = new Scanner(new File(inputFile));
		int no_of_companies = Integer.parseInt(sc.nextLine());
		System.out.println(no_of_companies);
		Main_SE MAIN=new Main_SE();
		HashMap<String,Double> hs=new HashMap<String,Double>();
		HashMap<String,Double> hm=new HashMap<String,Double>();
		HashMap<String,Double> min=new HashMap<String,Double>();
		HashMap<String,Double> max=new HashMap<String,Double>();
		HashMap<String,Double> hmx=new HashMap<String,Double>();
		int x1=0;
		int xx=6;
		int nox=xx*no_of_companies;
		String stt=sc.nextLine();
		//		int c=1;
		//		while(c<=6) {
		//			System.out.println("hour =="+c);
		//			for(int i=0;i<no_of_companies;i++) 
		//			{
		//				String s=sc.nextLine();
		//				System.out.println(s);
		//			}
		//			c=c+1;
		//			
		//		}
		int jv=1;
		while(x1<nox) {
			int y=0;
			while(y<no_of_companies) {
				try {
					y=y+1;
					String[] Student_info = stt.split(",");
					if(Student_info[1]!=null) {
						double d=Double.parseDouble(Student_info[1]);
						if(hs.containsKey(Student_info[0])||!(hs.containsKey(Student_info[0])))
							hmx.put(Student_info[0]+jv,d);
						if(!hs.containsKey(Student_info[0])&& y<no_of_companies) {
							hs.put(Student_info[0],d);
							stt=sc.nextLine();
							x1++;
						}
						else {
							hs.put(Student_info[0],d);
							stt=sc.nextLine();
							System.out.println();
							hm.putAll(hs);
							LinkedHashMap<String, Double> reverseSortedMap = new LinkedHashMap<>();
							hm.entrySet()
							.stream()
							.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
							.forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
							int j1=0;
							int m1=5;
							int mi=0;
							int ma=0;
							for (Map.Entry<String, Double> en : reverseSortedMap.entrySet()) { 
								if(ma==0) {
									max.put(en.getKey(),en.getValue());
									ma=1;
								}
								if(j1!=m1) {
									System.out.println("Key = " + en.getKey() +", Value = " + en.getValue()); 
									j1++;
								}
								else {
									break;
								}
							}
							System.out.println();
							LinkedHashMap<String, Double> sortedMap = new LinkedHashMap<>(); 
							hm.entrySet()
							.stream()
							.sorted(Map.Entry.comparingByValue())
							.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
							int j=0;
							int m=5;
							for (Map.Entry<String, Double> en : sortedMap.entrySet()) { 
								if(mi==0) {
									min.put(en.getKey(),en.getValue());
									mi=1;
								}
								if(j!=m) {
									System.out.println("Key = " + en.getKey() +", Value = " + en.getValue()); 
									j++;
								}
								else {
									break;
								}
							}
							System.out.println();
							y=y+1;
							x1++;
							hs.clear();
							jv=jv+1;
						}
					}
				}catch(Exception e) {
				}
			}
		}
		System.out.println();
		//	System.out.println(hmx);
		try {
			while(stt!=null) {
				stt=sc.nextLine();
				String[] Student_info = stt.split(",");
				if(Student_info[0].equals("intersection")) {
					MAIN.intersection(hmx);
				}
				if(Student_info[2]!=null) {
					if(Student_info[1].equals("minST")) {
						MAIN.minST(hmx, Student_info[2]);
					}
					else if(Student_info[1].equals("maxST")) {
						MAIN.maxST(hmx, Student_info[2]);
					}
				}

			}
		}catch(Exception e) {

		}
	}

	public Double minST(HashMap <String, Double> hm,String s) {
		Double val=0.0;
		System.out.println();
		TreeMap<String, Double> sorted = new TreeMap<>(); 
		TreeMap<String, Double> min = new TreeMap<>(); 
		sorted.putAll(hm); 
		for (Map.Entry<String, Double> entry : sorted.entrySet())  {
			for(int j=1;j<7;j++) {
				String s1=s;
				s1=s+j;
				if(s1.equals(entry.getKey())) {
					min.put(entry.getKey(),entry.getValue());
				} 
			}
		}
		LinkedHashMap<String, Double> sortedMap = new LinkedHashMap<>(); 
		min.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
		int j=0;
		int m=1;
		for (Map.Entry<String, Double> en : sortedMap.entrySet()) { 
			if(j!=m) {
				System.out.println("Minimum   "+"Key = " + en.getKey() +", Value = " + en.getValue()); 
				val=en.getValue();
				j++;
			}
			else {
				break;
			}
		}
		return val;
	}


	public Double maxST(HashMap <String, Double> hm,String s) {
		Double val=0.0;
		System.out.println();
		TreeMap<String, Double> sorted = new TreeMap<>(); 
		TreeMap<String, Double> max = new TreeMap<>(); 
		sorted.putAll(hm); 
		for (Map.Entry<String, Double> entry : sorted.entrySet())  {
			for(int j=1;j<7;j++) {
				String s1=s;
				s1=s+j;
				if(s1.equals(entry.getKey())) {
					max.put(entry.getKey(),entry.getValue());
				} 
			}
		}
		LinkedHashMap<String, Double> reverseSortedMap = new LinkedHashMap<>();
		max.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
		.forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
		int j1=0;
		int m1=1;
		for (Map.Entry<String, Double> en : reverseSortedMap.entrySet()) { 
			if(j1!=m1) {
				System.out.println("Maximum   "+"Key = " + en.getKey() +", Value = " + en.getValue()); 
				val=en.getValue();
				j1++;
			}
			else {
				break;
			}
		}
		return val;
	}


	public void intersection(HashMap<String, Double> hm) {
		TreeMap<String, Double> sorted = new TreeMap<>(); 
		TreeMap<String, Double> min = new TreeMap<>(); 
		sorted.putAll(hm); 
		for (Map.Entry<String, Double> entry : sorted.entrySet())  {
			String s=entry.getKey();
			int l=s.length();
			String sub=s.substring(0,l-1);
			min.put(sub,entry.getValue());
		} 
		LinkedHashMap<String, Double> sortedMap = new LinkedHashMap<>(); 
		min.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
		System.out.println();

		TreeMap<String, Double> sorted1 = new TreeMap<>(); 
		TreeMap<String, Double> max = new TreeMap<>(); 
		sorted1.putAll(hm); 
		for (Map.Entry<String, Double> entry : sorted1.entrySet())  {
			String s=entry.getKey();
			int l=s.length();
			String sub=s.substring(0,l-1);
			max.put(sub,entry.getValue());
		}
		LinkedHashMap<String, Double> reverseSortedMap = new LinkedHashMap<>();
		max.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
		.forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
		int cou=0;
		int m=10;
		for (Map.Entry<String, Double> me : min.entrySet()) { 
			// assuming your map is Map<String, String>
			if(cou!=m) {
				if(max.containsValue(me.getValue()))
					{
					System.out.println("Found Duplicate -> " + me.getKey());
					cou++;
				}
			}
		}
	}

	public static HashMap<String, Double> Max(HashMap<String, Double> hm) {
		List<Map.Entry<String, Double> > list = new LinkedList<Map.Entry<String, Double> >(hm.entrySet()); 
		HashMap<String, Double> temp = new LinkedHashMap<String, Double>(); 
		for (Map.Entry<String, Double> aa : list) { 
			temp.put(aa.getKey(), aa.getValue()); 
		} 
		return temp; 
	}
}