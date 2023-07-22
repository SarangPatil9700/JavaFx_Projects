class Program14{
	public static void main(String[] args){
		int arr[]={10,20,30,40,50};
		int arr1[]={10,20,30,40,50};
		System.out.println(arr);
		System.out.println(arr1);
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));

		System.out.println(System.identityHashCode(arr1[0]));
		System.out.println(System.identityHashCode(arr1[1]));

	}
}
