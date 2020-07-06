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
        List<Class<?>> classes = ClassUtils.convertClassNamesToClasses(Arrays.asList("java.lang.Integer", "java.lang.int"));
        System.out.println(classes);
    }
}
