package model.local_bitcoin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdList {
    @JsonProperty(value="data")
    private Data adDate;
    @JsonProperty(value="actions")
    private Actions annPage;

}
