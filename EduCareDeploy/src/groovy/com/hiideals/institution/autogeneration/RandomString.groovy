package com.hiideals.institution.autogeneration
import org.apache.commons.lang.RandomStringUtils;

/**
 * @author Uddha Umesh
 * @createdOn 24-Nov-2016
 *
 */
@Singleton
class RandomString {

	/**
	 * Uddha Umesh
	 * @param length
	 * @return
	 */
	public String generate(length){
		String charset = (('A'..'Z') + ('0'..'9')).join()
		return (RandomStringUtils.random(length, charset.toCharArray())).toString()
	}

	/**
	 * Uddha Umesh
	 * @param name
	 * @return
	 */
	public String splitString(String name){

		String[] nn = name.split(" ");
		String na = "";

		if(nn.size() <= 1){
			na =nn[0].substring(name.length(), name.length())
		}
		else{
			for(String val in nn){
				na = na+val.substring(0, 2)
			}
		}
		
		return na.toUpperCase();
	}
}

