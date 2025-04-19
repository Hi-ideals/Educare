package com.hiideals.instituite.EDcoding

/**
 * @author Uddha Umesh
 * @createdOn 23-Nov-2016
 *
 */
@Singleton
class LookUpED {
	
	/**
	 * Uddha Umesh
	 * @param val
	 * @return
	 */
	public static String encod(Long val){
		return val.toString().bytes.encodeBase64().toString()
	}
	
	/**
	 * Uddha Umesh
	 * @param val
	 * @return
	 */
	public static String encod(String val){
		return val.toString().bytes.encodeBase64().toString()
	}
	
	/**
	 * Uddha Umesh
	 * @param val
	 * @return
	 */
	public static Long decod(String val){
		return new Long(new String(val.decodeBase64()))
	}

}


