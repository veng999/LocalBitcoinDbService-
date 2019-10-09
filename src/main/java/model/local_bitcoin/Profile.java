package model.local_bitcoin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Profile {
    private String username;
    @JsonProperty(value = "feedback_score")
    private Integer feedbackScore;
    @JsonProperty(value = "trade_count")
    private String tradeCount;
    @JsonProperty(value = "last_online")
    private String lastOnline;
    private String name;

}