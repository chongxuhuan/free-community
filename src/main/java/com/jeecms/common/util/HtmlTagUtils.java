package com.jeecms.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * html 标签处理类
 * @author HK
 *
 */
public final class HtmlTagUtils {

	/**
	 * 去除标签内的属性-->>例如<div class=... id=...> -->> <div>
	 * @param html
	 * @return
	 */
	public static String clearHtmlTagAtt(String html){
		if(html != null && html != ""){
			String regEx = "(class|id|style|on)[^>]*?[>]";//class | id | style | on 都去除
	        Pattern pattern = Pattern.compile(regEx); 
	        Matcher matcher = pattern.matcher(html); 
	        html = matcher.replaceAll(">");
	        return html;
		}
		return "";
	}
	
	public static void main(String[] args) {
		String html = "<div class=\"fei\" id=\"fei\" style=\"fei\">lsdjf;lksadjflsdajf</div>";
		System.out.println(clearHtmlTagAtt(html));
	}
}
