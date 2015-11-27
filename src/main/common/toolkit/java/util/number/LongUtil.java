package common.toolkit.java.util.number;

import common.toolkit.java.util.StringUtil;

/**
 * Integer 工具类
 * @author   银时：yinshi.nc / yinshi.nc@taobao.com
 * @Date	 Jan 13, 2012
 */
public class LongUtil {

	public static long defaultIfZero(long originalLong, long defaultLong) {
		if (0 == originalLong) {
			return defaultLong;
		}
		return originalLong;
	}

	public static long defaultIfNull(Long originalLong, long defaultLong) {
		if (null == originalLong) {
			return defaultLong;
		}
		return originalLong;
	}

	public static long defaultIfNull(Long originalLong) {
		if (null == originalLong) {
			return 0;
		}
		return originalLong;
	}

	public static long defaultIfError(String originalStr, Integer defaultLong) {

		try {
			return Long.parseLong(StringUtil.trimToEmpty(originalStr));
		} catch (Exception e) {
			return defaultLong;
		}
	}

	public static long defaultIfError(String originalStr, long defaultLong) {

		try {
			return Long.parseLong(StringUtil.trimToEmpty(originalStr));
		} catch (Exception e) {
			return defaultLong;
		}
	}

	public static long defaultIfNotPositive(long originalLong, long defaultLong) {
		if (0 >= originalLong) {
			return defaultLong;
		}
		return originalLong;
	}

	/** 是否为0 */
	public static boolean isBlank(Long originalLong) {
		return (null == originalLong || 0 == originalLong);
	}

	/** 是否为0 */
	public static boolean isZero(long originalLong) {
		return 0 == originalLong;
	}

	public static long maxIfTooBig(long originalLong, long maxLong) {
		if (originalLong >= maxLong) {
			originalLong = maxLong;
		}
		return originalLong;
	}

}
