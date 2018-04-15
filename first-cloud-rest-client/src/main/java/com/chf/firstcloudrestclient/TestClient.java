package com.chf.firstcloudrestclient;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * ${DESCRIPTION}
 *
 * @author 温柔一刀
 * @create 2018-04-15 15:55
 **/
public class TestClient {
    public static void main(String[] args) throws IOException {
        // 创建默认的 HttpClient
        CloseableHttpClient httpclient = HttpClients.createDefault();
// 调用 6 次服务并输出结果
        for(int i = 0; i < 6; i++) {
// 调用 GET 方法请求服务
            HttpGet httpget = new HttpGet("http://localhost:8888/hello");
// 获取响应
            HttpResponse response = httpclient.execute(httpget);

            // 根据 响应解析出字符串
            System.out.println(EntityUtils.toString(response.getEntity()));
        }
    }
}
