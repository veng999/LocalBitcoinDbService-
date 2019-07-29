package model;

import java.util.Date;

@lombok.Data
public class UsersDataModel {

    private String username;
    private Integer feedbackScore;
    private Date lastOnline;
    private Date createdAt;
    private String tradeType;
    private String tempPrice;
    private String bankName;
    private String tempPriceUsd;
    private String locationString;
    private String currency;
}
