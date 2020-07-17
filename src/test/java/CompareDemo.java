import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

/**
 * @program: UtilsCollect
 * @description:
 * @author: Fly.Hugh
 * @create: 2020-07-12 18:58
 **/
public class CompareDemo {
    public static void main(String[] args) {
        String date1 = "16:00:00";
        String date2 = "17:00:00";
//        System.out.println(date1 >= date2);
        Date date = new Date();
        Date dateBefore = DateUtils.addMonths(date, -2);
        String dateStr = DateFormatUtils.format(dateBefore, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dateBefore);
        System.out.println(dateStr);
    }
}
