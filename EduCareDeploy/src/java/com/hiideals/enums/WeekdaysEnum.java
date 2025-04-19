package com.hiideals.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum WeekdaysEnum {
	
	Monday(1), Tuesday(2), Wednesday(3), Thursday (4), Friday (5), Satuarday(6);

	private static final Map<Integer, WeekdaysEnum> lookup = new HashMap<Integer, WeekdaysEnum>();

	static {
		for (WeekdaysEnum w : EnumSet.allOf(WeekdaysEnum.class))
			lookup.put(w.getCode(), w);
	}

	private int code;

	private WeekdaysEnum(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static WeekdaysEnum get(int code) {
		return lookup.get(code);
	}


}
