class Program3{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb);

		sb.append("Suyash");
		System.out.println(sb.capacity());
                System.out.println(sb);

		sb.append("Gharge");
		System.out.println(sb.capacity());
                System.out.println(sb);

		sb.append("Core2Web");
                System.out.println(sb.capacity());
                System.out.println(sb);


	}
}
