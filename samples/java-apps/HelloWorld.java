class HelloWorld{
   public static void main(String[] args){
	System.out.println("Hello World");
	User user = new User();
	user.setEmail("alex@gmail.com");
	System.out.println("Email Id is: " + user.getEmail());
	}
}