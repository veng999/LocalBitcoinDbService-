package services;

import client.LocalBitcoinClientImpl;
import client.impl.LocalBitcoinClient;
import model.AdList;
import model.LocalBitcoinModel;
import model.UsersDataModel;

import java.util.ArrayList;
import java.util.List;

public class LocalBitcoinService {

    private LocalBitcoinClient client = new LocalBitcoinClientImpl();
    public void takeUserDataModel() {
        List<UsersDataModel> addv = fillUserDataModel();
        for (UsersDataModel usersDataModel : addv) {
            client.methodPost(usersDataModel);
        }
    }

    private List<UsersDataModel> fillUserDataModel(){
        LocalBitcoinModel json = client.methodGet();
        List<UsersDataModel> addList = new ArrayList<>();
        List<AdList> addvList = json.getInformation().getAddvList();
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






