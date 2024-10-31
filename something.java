public class something{
	public static void main(String[] args) {
		System.out.println((char) 041); //octal works too; java is really werid about their octal syntax: python uses 0o; c++ and other c related uses a pre-leading zero
		System.out.println((char) 0x21); //hex works too; a-f can be either upper or lower case
		System.out.println((char) 32); 
		System.out.println((char) 0b100001); //binary works too
	}
}
