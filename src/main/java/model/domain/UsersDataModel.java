package model.domain;

import lombok.Data;

@Data
public class UsersDataModel {
    private String username;
    private Integer feedbackScore;
    private String lastOnline;
    private String createdAt;
    private String tradeType;
    private String tempPrice;
    private String bankName;
    private String tempPriceUsd;
    private String locationString;
    private String currency;
}
