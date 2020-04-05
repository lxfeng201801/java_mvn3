package com.knowyou.cloud.sys.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.knowyou.cloud.sys.model.mobilebox.Terminal;
import com.knowyou.cloud.sys.service.TerminalService;
import com.knowyou.cloud.sys.tool.DataSourceContextHolder;

@Controller
@RequestMapping(value = "/admin/remote")
public class RemoteController
{
	@Autowired
	public TerminalService terminalService;
	
	public Gson gson = new Gson();


	@RequestMapping(value = "index")
	public String index()
	{
		return "admin/remote/index";
	}

	@RequestMapping(value = "remote")
	public String remote()
	{
		return "admin/remote/remote";
	}

	@ResponseBody()
	@RequestMapping(value = "remote_terminal_list", produces = "text/html;charset=UTF-8")
	/**
	 * 获取盒子终端列表信息
	 */
	public String getTerminalList(HttpServletRequest request, int draw, int start, int length)
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");

		//		if(sn != null && !sn.equals(""))
		//		{
		//			example.createCriteria().andSnLike(sn);
		//		}

		Terminal model = new Terminal();

		return terminalService.getJsonList(draw, start, length, model);
	}

	public static final String PATH_URL = "http://47.92.28.122:8080/mobileboxwebservices/RemoteHelpRequest";
	
	public static final String REMOTE_URL = "http://47.92.28.122:8080/mobileboxwebservices/SendRemoteCommand";
	
	@ResponseBody()
	@RequestMapping(value = "start", produces = "text/html;charset=UTF-8")
	public String start(String id)
	{
		String str = "false";
		
		try {
			str = doPost("id="+id, PATH_URL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}
	
	@ResponseBody()
	@RequestMapping(value = "command", produces = "text/html;charset=UTF-8")
	public String command(String id, Integer code)
	{
		String str = "false";
		
		try {
			str = doPost("id="+id+"&code="+code, REMOTE_URL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}
	
	private String charset = "utf-8";
    
    /**
     * Do POST request
     * @param url
     * @param parameterMap
     * @return
     * @throws Exception 
     */
    public String doPost(String params, String url) throws Exception {
    	StringBuffer parameterBuffer = new StringBuffer();
		parameterBuffer.append(params);
        URL localURL = new URL(url);
        
        URLConnection connection = this.openConnection(localURL);
        HttpURLConnection httpURLConnection = (HttpURLConnection)connection;
        
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Accept-Charset", charset);
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(parameterBuffer.length()));
        httpURLConnection.setConnectTimeout(60000);
        
        OutputStream outputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        StringBuffer resultBuffer = new StringBuffer();
        String tempLine = null;
        
        try {
            outputStream = httpURLConnection.getOutputStream();
            outputStreamWriter = new OutputStreamWriter(outputStream);
            
            outputStreamWriter.write(parameterBuffer.toString());
            outputStreamWriter.flush();
            //响应失败
            if (httpURLConnection.getResponseCode() >= 300) {
                throw new Exception("HTTP Request is not success, Response code is " + httpURLConnection.getResponseCode());
            }
            //接收响应流
         inputStream = httpURLConnection.getInputStream();
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            
            while ((tempLine = reader.readLine()) != null) {
                resultBuffer.append(tempLine);
            }
            
        } finally {
            
            if (outputStreamWriter != null) {
                outputStreamWriter.close();
            }
            
            if (outputStream != null) {
                outputStream.close();
            }
            
            if (reader != null) {
                reader.close();
            }
            
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            
            if (inputStream != null) {
                inputStream.close();
            }
            
        }

        return resultBuffer.toString();
    }

    private URLConnection openConnection(URL localURL) throws IOException {
        URLConnection connection = localURL.openConnection();
        return connection;
    }
    
    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }
}
