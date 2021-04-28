public class BuilderEverydayDemo{
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("This a example");
        builder.append("of the builder pattern. ");
        builder.append("It has methods to append ");
        builder.append("almost anything we want to a string. ");
        builder.append(42);
        System.out.println(builder.toString());
    }
}