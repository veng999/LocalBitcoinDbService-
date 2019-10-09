package model.local_bitcoin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataMain {
    @JsonProperty(value="ad_list")
    List<AdList> addvList;
    @JsonProperty(value="ad_count")
    private Integer adCount;
}
