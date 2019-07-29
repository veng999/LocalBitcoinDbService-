package client;

import client.impl.LocalBitcoinClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.LocalBitcoinModel;
import model.UsersDataModel;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import java.io.IOException;
import java.net.URI;



public class LocalBitcoinClientImpl implements LocalBitcoinClient {

    @Override
    public LocalBitcoinModel methodGet()  {
        try{
            String url = "https://localbitcoins.net//buy-bitcoins-online/RU/Russian_Federation/.json";
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet requestGet = new HttpGet(url);
            HttpResponse response = client.execute(requestGet);
            String responseString = new BasicResponseHandler().handleResponse(response);
            ObjectMapper mapper = new ObjectMapper();
            LocalBitcoinModel json = mapper.readValue(responseString, LocalBitcoinModel.class);
            return json;
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Ошибка в методе methodGet()");
        }
        return null;
    }

    @Override
    public void methodPost(UsersDataModel fildsInDatabase) {
        try {
            String string = "";
            URI url = new URI(string);
            HttpClient client = HttpClientBuilder.create().build();
            HttpPost requestPost = new HttpPost(url);
            StringEntity stringEntity = new StringEntity(fildsInDatabase.toString());
            requestPost.setEntity(stringEntity);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ошибка в методе methodPost()");
        }
    }
}

