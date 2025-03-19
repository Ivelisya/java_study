public class Main {
    public static void main(String[] args) {
        int startYear = 1000; //起始
        int endYear = 2024; //结束
        int count = 0; //ans值

        System.out.println("之间的闰年 " + startYear + " and " + endYear + ":");

        for (int year = startYear; year <= endYear; year++) {
            if (isLeapYear(year)) {
                System.out.print(year + " ");
                count++;

                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.println("\n\nTotal number of leap years: " + count);
    }
    //辅助函数返回t f 判断是否为闰年
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}