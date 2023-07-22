class Parent{

        Object fun(){
                System.out.println("Parent fun");
                return 'A';
        }
}
class Child extends Parent{
        String fun(){
                System.out.println("Child fun");
                return "Shashi";
        }
}
class Client{
        public static void main(String[] args){
                Parent p=new Child();
                p.fun();
        }
}
