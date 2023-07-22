class Program5{
        public static void main(String[] args){
                String str1="Suyash";
                String str2="Gharge";
                System.out.println(str1+str2);
                String str3="SuyashGharge";
                String str4=str1.concat(str2);
                System.out.println(System.identityHashCode(str3));
                System.out.println(System.identityHashCode(str4));
        
	}

}

