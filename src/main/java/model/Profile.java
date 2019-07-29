package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Profile {


    private String username;
    @JsonProperty(value = "feedback_score")
    private Integer feedbackScore;
    @JsonProperty(value = "trade_count")
    private String tradeCount;
    @JsonProperty(value = "last_online")
    private Date lastOnline;
    private String name;

}