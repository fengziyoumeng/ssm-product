package com.cn.wubin.dubbo.dubbo_2;

import com.alibaba.fastjson.JSON;
import com.cn.wubin.model.pojo.BannerInfo;
import com.cn.wubin.service.IBannerInfoService;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;

public class StudyConsumer {

    public static void main(String[] args) {
        IBannerInfoService bannerInfoService = (IBannerInfoService) remote(IBannerInfoService.class);
        BannerInfo bannerInfo = bannerInfoService.queryBannerInfo(1l);
        System.out.println("客户端收到结果："+bannerInfo);
    }

    private static Object remote(final Class clazz) {

        return Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                Socket socket = new Socket("127.0.0.1",6666);
                OutputStream os = socket.getOutputStream();
                os.write(String.valueOf(args[0]).getBytes());
                os.flush();

                InputStream in = socket.getInputStream();
                byte[] b = new byte[1024];
                in.read(b);

                String s = new String(b).trim();
                System.out.println("接口返回值："+s);
                BannerInfo bannerInfo = JSON.parseObject(new String(b),BannerInfo.class);

                in.close();
                os.close();
                socket.close();
                return bannerInfo;
            }
        });
    }
}
