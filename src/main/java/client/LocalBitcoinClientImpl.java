package client;

import client.impl.LocalBitcoinClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import model.domain.UsersDataModel;
import model.local_bitcoin.LocalBitcoinModel;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import java.io.IOException;
import java.net.URI;


public class LocalBitcoinClientImpl implements LocalBitcoinClient {

    @Override
    public LocalBitcoinModel methodGet() {
        try{
            String url = "https://localbitcoins.net//buy-bitcoins-online/RU/Russian_Federation/.json";
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet requestGet = new HttpGet(url);
            HttpResponse response = client.execute(requestGet);
            String responseString = new BasicResponseHandler().handleResponse(response);
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(responseString, LocalBitcoinModel.class);
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("Ошибка при полочении данных от localbitcoin api");
        }
    }

    @Override
    public void methodPost(String url, UsersDataModel fildsInDatabase) {
        try {
            URI uri = new URI(url);
            CloseableHttpClient client = HttpClients.createDefault();
            HttpPost requestPost = new HttpPost(uri);
            Gson gson = new Gson();
            String entity = gson.toJson(fildsInDatabase);
            requestPost.setEntity(new StringEntity(entity));
            requestPost.setHeader("Content-type", "application/json");
            client.execute(requestPost);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void methodRemove(String url) {
            CloseableHttpClient client = HttpClients.createDefault();
            HttpDelete delete = new HttpDelete(url);
        try {
            client.execute(delete);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

