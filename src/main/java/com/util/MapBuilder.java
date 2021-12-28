package com.util;

import com.alibaba.fastjson.JSON;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: MapBuilder
 *
 * @author: davidwang2006@aliyun.com DavidWang
 * @date: 2020/12/8 10:52
 * @description:
 */
public class MapBuilder<T> {

    private final Map<String,T> map = new HashMap<>();

	public MapBuilder<T> put(String key, T value){
		map.put(key, value);
		return this;
	}

	public MapBuilder<T> putAll(Map<String, T> map){
		this.map.putAll(map);
		return this;
	}


	public Map<String,T> build(){
		return map;
	}

	/**
	 * 生成json
	 * @return
	 */
	public String json(){
		return JSON.toJSONString(map);
	}

	/**
	 * normal builder
	 * @return
	 */
	public static MapBuilder<Object> normal(){
		return new MapBuilder<Object>();
	}

	public static Map<String,Object> of(String key, Object value){
		Map<String,Object> mp = new HashMap<>();
		mp.put(key, value);
		return mp;
	}

}
