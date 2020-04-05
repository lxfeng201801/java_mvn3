package com.knowyou.cloud.sys.converts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConvert implements Converter<String, Date>
{
	@Override
	public Date convert(String stringDate)
	{
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		try
		{
			return simpleDateFormat.parse(stringDate);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
