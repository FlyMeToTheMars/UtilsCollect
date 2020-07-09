import org.apache.commons.lang3.ClassUtils;

import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;

/**
 * @Author Fly.Hugh
 * @Date 2020/7/6 10:36 上午
 * @Version 1.0
 **/
public class demo {
    public static void main(String[] args) {

        String str = "abc";
        StringBuilder strbu = new StringBuilder("def");
        boolean boo = true;
        CharSequence cs = boo?str:strbu;
    }
}
