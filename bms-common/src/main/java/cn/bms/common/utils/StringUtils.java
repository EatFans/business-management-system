package cn.bms.common.utils;

/**
 * 字符串工具类
 *
 * @author Fan
 */
public class StringUtils {
    private static final String NULLSTR = "";

    /**
     * 检查字符串是否是一个空字符串
     * @param str 字符串
     * @return 如果是空就返回true，否则返回false
     */
    public static boolean isEmpty(String str){
        return isNull(str) || NULLSTR.equals(str.trim());
    }

    /**
     * 检查对象是否位空
     * @param object 对象
     * @return 如果是空就返回true，否则就返回false
     */
    public static boolean isNull(Object object){
        return object == null;
    }

    /**
     * * 判断一个对象数组是否非空
     *
     * @param objects 要判断的对象数组
     * @return true：非空 false：空
     */
    public static boolean isNotEmpty(Object[] objects) {
        return !isEmpty(objects);
    }

    /**
     * 判断字符串不是为空
     *
     * @param str 字符串
     * @return 如果不是为空就返回true，否则就返回false
     */
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }

    /**
     * * 判断一个对象是否非空
     *
     * @param object Object
     * @return true：非空 false：空
     */
    public static boolean isNotNull(Object object)
    {
        return !isNull(object);
    }

    /**
     * 获取参数不为空值
     *
     * @param value defaultValue 要判断的value
     * @return value 返回值
     */
    public static <T> T nvl(T value, T defaultValue)
    {
        return value != null ? value : defaultValue;
    }

    /**
     * * 判断一个对象数组是否为空
     *
     * @param objects 要判断的对象数组
     ** @return true：为空 false：非空
     */
    public static boolean isEmpty(Object[] objects) {
        return isNull(objects) || (objects.length == 0);
    }
}
