package _7_kyu;
import java.util.*;


/*
args_count(1, 2, 3) -> 3
args_count(1, 2, 3, 10) -> 4
* */
class HowManyArguments
{
    public static long countArgs(Object... args) {
        return (int)Arrays.stream(args).count();

    }
}
