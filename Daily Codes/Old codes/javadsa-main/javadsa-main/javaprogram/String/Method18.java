/*
method18:public string[] split(String delimiter);
*/

class Method18{
	public static void main(String[] args){
		String str="know the code till the core";
		String[] strResult=str.split(" ");
		for(int i=0;i<strResult.length;i++){
			System.out.println(strResult[i]);
		}
	}
}
