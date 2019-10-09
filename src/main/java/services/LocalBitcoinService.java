package services;

import client.LocalBitcoinClientImpl;
import client.impl.LocalBitcoinClient;
import model.local_bitcoin.AdList;
import model.domain.UsersDataModel;

import java.util.ArrayList;
import java.util.List;

public class LocalBitcoinService {
    private LocalBitcoinClient client = new LocalBitcoinClientImpl();

    public void takeUserDataModel() {
        List<UsersDataModel> addv = fillUserDataModel();
        addv.forEach(add -> {
            client.methodPost("http://localhost:8080/users/save", add);
            client.methodPost("http://localhost:8080/usersInformation/save", add);
        });
    }

    public void removeUserById() {
        client.methodRemove("http://localhost:8080/users/remove/1");
    }

    public void removeUsersInformationById() {
        client.methodRemove("http://localhost:8080/usersInformation/remove/148");
    }

    private List<UsersDataModel> fillUserDataModel() {
        List<AdList> addvList = client.methodGet().getInformation().getAddvList();
        List<UsersDataModel> addList = new ArrayList<>();
        addvList.forEach(add -> {
            UsersDataModel bases = new UsersDataModel();
            bases.setUsername(add.getAdDate().getProf().getUsername());
            bases.setFeedbackScore(add.getAdDate().getProf().getFeedbackScore());
            bases.setLastOnline(add.getAdDate().getProf().getLastOnline());
            bases.setCreatedAt(add.getAdDate().getCreatedAt());
            bases.setTradeType(add.getAdDate().getTradeType());
            bases.setTempPrice(add.getAdDate().getTempPrice());
            bases.setBankName(add.getAdDate().getBankName());
            bases.setTempPriceUsd(add.getAdDate().getTempPriceUsd());
            bases.setLocationString(add.getAdDate().getLocationString());
            bases.setCurrency(add.getAdDate().getCurrency());
            addList.add(bases);
        });
        return addList;
    }
}






