public class Main {
    public void testRefs(String str, StringBuilder sb) {
        str = str + sb.toString();
        sb.append(str);
        str = null;
        sb = null;
    }

    public static void main(String[] args) {
//        String s = "a";
//        StringBuilder sb = new StringBuilder("b");
//        new Main().testRefs(s, sb);
//        System.out.println("s=" + s + " sb=" + sb);

        String[] dataList = {"one", "two", "three"};
        for (String s : dataList) {
            int innerCounter = 0;
            while (innerCounter < dataList.length) {
                System.out.println(s + " - " + innerCounter);
                innerCounter++;
            }
        }
    }
}