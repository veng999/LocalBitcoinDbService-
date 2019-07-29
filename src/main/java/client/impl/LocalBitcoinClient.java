package client.impl;

import model.LocalBitcoinModel;
import model.UsersDataModel;

public interface LocalBitcoinClient {

    LocalBitcoinModel methodGet();
    void methodPost(UsersDataModel fildsInDatabase);


}
