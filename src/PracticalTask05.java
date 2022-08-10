import java.util.Arrays;

public class PracticalTask05 {
    public static void main(String[] args) {

    }

    public static class AsciiCharSequence implements CharSequence {
        private byte[] a;

        public AsciiCharSequence(byte[] a) {
            this.a = a;
        }

        @Override
        public String toString() {
            return new String(a);
        }

        @Override
        public int length() {
            return a.length;
        }

        @Override
        public char charAt(int index) {
            return (char) a[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return new AsciiCharSequence(Arrays.copyOfRange(a, start, end));
        }
    }
}
