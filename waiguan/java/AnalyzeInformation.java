package com.waiguan.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnalyzeInformation {
	public String getSavedContent(String content,String deleteContent){
		Pattern p;
		Matcher m;
		p=Pattern.compile(deleteContent);
		m=p.matcher(content);
		String savedContent=m.replaceAll("");
		return savedContent;
		
	}
	
}
