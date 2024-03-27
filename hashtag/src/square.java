public class square {
    public static void main(String[] args) {
int size = 8;
        //outer loop - rows
        for (int row = 1; row <= size; ++row) {
            //inner loop - cols
            for (int col = 1; col <= size; ++col) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
