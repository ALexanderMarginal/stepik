import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
	byte[] bytes;

	public AsciiCharSequence(byte[] bytes) {
		this.bytes = bytes;
	}

	@Override
	public int length() {
		return bytes.length;
	}

	@Override
	public char charAt(int index) {
		return (char) bytes[index];
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		byte[] chars = new byte[end - start];

		int counter = 0;

		for (int i = start; i < end; i++) {
			chars[counter] = this.bytes[i];
			counter++;
		}

		return new AsciiCharSequence(chars);
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (byte aByte : bytes) {
			stringBuilder.append((char) aByte);
		}
		return stringBuilder.toString();
	}
}
