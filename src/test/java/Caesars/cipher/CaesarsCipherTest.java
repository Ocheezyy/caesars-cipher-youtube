package Caesars.cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarsCipherTest 
	{

	private CaesarsCipher cc = new CaesarsCipher();
	@Test
	void testCipheredMessageWithOffsetOf12() {
		assertEquals("tai mdq kag pauzs fapmk", cc.cipher("how are you doing today", 12));
	}
	
	@Test
	void testEmptyString( ) 
	{
		assertEquals("", cc.cipher("", 12));
	}
	
//	@Test
//	void testCipheredMessageWithOffsetOf11( ) 
//	{
//		assertEquals("tai mdq kag pauzs fapmk", cc.cipher("how are you doing today", 11));
//	}

}
