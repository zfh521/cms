package com.webbricks.cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.webbricks.cmsdata.WBUri;
import com.webbricks.exception.WBIOException;

public interface WBUrisCache extends WBRefreshableCache {

	public static final int HTTP_GET_INDEX = 0;
	public static final int HTTP_POST_INDEX = 1;
	public static final int HTTP_PUT_INDEX = 2;
	public static final int HTTP_DELETE_INDEX = 3;
	
	public WBUri getByExternalKey(String key) throws WBIOException;
	
	public WBUri get(String uri, int httpIndex) throws WBIOException;

	public Set<String> getAllUris(int httpIndex) throws WBIOException;	
	
	public Long getCacheFingerPrint();
	
	public int httpToOperationIndex(String httpOperation);
	public String indexOperationToHttpVerb(int index);
	

}
