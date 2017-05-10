package fileUpload;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by dw07 on 2017/5/5.
 */
public class FileUploadTest {
    public static void main(String[] args) throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
//        HttpHost target = new HttpHost();
        HttpPost post = new HttpPost("http://localhost:9966/demo/test");
        HttpEntity entity = new InputStreamEntity(new FileInputStream("d:/lg36501000004320150723.zip"));
        post.setEntity(entity);
        CloseableHttpResponse response = client.execute(post);
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);

    }
}
