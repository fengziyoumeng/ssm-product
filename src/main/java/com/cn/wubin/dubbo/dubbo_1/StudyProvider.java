package com.cn.wubin.dubbo.dubbo_1;

import com.alibaba.fastjson.JSONObject;
import com.cn.wubin.model.pojo.BannerInfo;
import com.cn.wubin.service.IBannerInfoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudyProvider {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:*-beans.xml");
        context.start();

        //解决网络通讯（ServerSocket通信效率不高，之后可以替换）
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            while (true){
                Socket socket = serverSocket.accept();
                InputStream is = socket.getInputStream();
                byte[] b = new byte[16];
                is.read(b);

                System.out.println("服务器收到请求："+new String(b));
                IBannerInfoService bannerInfoService = (IBannerInfoService) context.getBean("bannerInfoService");
                Long l = Long.parseLong(getNumbers(new String(b)));
                System.out.println("请求值l："+new String(b));
                BannerInfo bannerInfo = bannerInfoService.queryBannerInfo(l);
                System.out.println("接口实现类返回值："+JSONObject.toJSONString(bannerInfo));

                OutputStream os = socket.getOutputStream();
                os.write(JSONObject.toJSONString(bannerInfo).getBytes());
                os.flush();

                os.close();
                is.close();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //截取数字  【读取字符串中第一个连续的字符串，不包含后面不连续的数字】
    public static String getNumbers(String content) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            return matcher.group(0);
        }
        return "";
    }
}
