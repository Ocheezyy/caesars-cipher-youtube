package Caesars.cipher;

public class Main {

	public static void main(String[] args) {
		
		String message = "How are you doing today";
		int offset = 12;
		
		CaesarsCipher cc = new CaesarsCipher();
		String cipheredMessage = cc.cipher(message, offset);
		
		System.out.println("Original message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Ciphered message: " + cipheredMessage);
	}

}
