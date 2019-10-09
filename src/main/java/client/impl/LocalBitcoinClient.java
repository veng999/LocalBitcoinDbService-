package client.impl;

import model.local_bitcoin.LocalBitcoinModel;
import model.domain.UsersDataModel;

public interface LocalBitcoinClient {
    LocalBitcoinModel methodGet();
    void methodPost(String url, UsersDataModel fildsInDatabase);
    void methodRemove(String url);
}
