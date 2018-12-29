/**
 * 
 */
package me.spring.beans.colltions;

import java.util.Properties;

/**
 * @Description TODO
 * @author ºîÖÎ»ª
 * @date 2018-12-18 ÏÂÎç4:01:40
 */

public class DataSource {
	
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "DataSource [properties=" + properties + "]";
	}
	
}
