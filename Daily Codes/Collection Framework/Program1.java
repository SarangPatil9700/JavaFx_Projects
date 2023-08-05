import java.util.*;
class ArrayListDemo extends ArrayList{
	public static void main(String[]args){
	        ArrayListDemo al = new ArrayListDemo();
		ArrayList al2= new ArrayList();

		//add(Element)
		
		al.add(10);
		al.add(20.5f);
		al.add("Core2Web");
		al.add(10);
		al.add(20.5f);


		System.out.println(al);

		// [2] size
		System.out.println(al.size());

		// [3] Contains
		System.out.println(al.contains("Shashi")); //true
		System.out.println(al.contains(30));  //false

		// [4] indexOf(Object)
		System.out.println(al.indexOf(20.5f));  //1

		// [5] lastIndexOf(Object)
		System.out.println(al.lastIndexOf(20.5f));  //4
							    
		// [6] get(int)
		System.out.println("Core2Web"); 
		System.out.println(al.get(3));  //Core2web
						
		// [7] set(index,Incubator)
		System.out.println(al.set(3,"Incubator"));
		System.out.println(al);

		// [8] void add(int,E)
		al.add(3,"Sarang");    //Sarang at 3 index
		System.out.println(al);

		// [9] addAll(Collection)
		System.out.println(al2.add("Salman"));
		System.out.println(al2.add("Shahrukh"));
		System.out.println(al2.add("Amir"));

		al.addAll(al2);
		System.out.println(al);

		// [10] addAll(index,collection)
		al.addAll(3,al2);
		System.out.println(al);
                
		// [11] boolean remove(java.lang.Object);
		System.out.println(al.remove(20.5f));
		System.out.println(al);

		// [12] removeRange(3,5)
		al.removeRange(3,5);
		System.out.println(al);
		
		// [13] remove(int)
		System.out.println(al.remove(4));
		System.out.println(al);
                
		// [14] Object[] toArray()
		Object arr[] = al.toArray();
			System.out.println(arr);
			for(Object data : arr) {
				System.out.print(data + " ");
			}
			System.out.println();

		// [13] clear()
		al.clear();
		System.out.println(al);


	}
}

