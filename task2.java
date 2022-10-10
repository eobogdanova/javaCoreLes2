package les2;

public class task2 {
    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"1", "0", "0", "1"},
                {"0", "1", "1", "0"},
                {"1", "1", "0", "0"},
                {"0", "0", "1", "1"}
        };
        String[][] wrongSizeMatrix = {
                {"1", "0", "0", "1"},
                {"0", "1", "1", "0"},
                {"1", "1", "0", "0"},
                {"0", "0", "1"}
        };
        String[][] wrongChar = {
                {"1", "0", "0", "1"},
                {"0", "?", "1", "0"},
                {"1", "1", "0", "0"},
                {"0", "0", "1", "1"}
        };

        try {
            System.out.println(Converter.strConverter(correctMatrix));
        } catch (CustomException e) {
            e.getMessage();
        }


        try {
            System.out.println(Converter.strConverter(wrongSizeMatrix));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(Converter.strConverter(wrongChar));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }
}
