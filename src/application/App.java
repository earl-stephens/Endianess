package application;

import java.nio.ByteBuffer;

public class App {

	public static void main(String[] args) {
		int value1 = 123;
		/* 3 is the least signigicant digit;
		 * 1 is the most significant digit
		 */
		
		//hex numbers start with 0x in Java
		//4 bytes, 2 digits per byte
		int value = 0x01020304;
		
		ByteBuffer buffer = ByteBuffer.allocate(4);
		buffer.putInt(value);
		
		byte[] bytes = buffer.array();
		
		for(var b: bytes) {
			System.out.printf("%02x ", b);
		}
		
		/*Java uses Big Endian format
		 * for the value 0x01020304, 01 is the
		 * most significant digit.  The output of the
		 * above code is 01 02 03 04, which means that
		 * the most significant digit is stored in the 
		 * lowest memory address
		 */
		
		/*Can force use of Little Endian format by
		 * using buffer.order(ByteOrder.LITTLE_ENDIAN);
		 */
	}

}
