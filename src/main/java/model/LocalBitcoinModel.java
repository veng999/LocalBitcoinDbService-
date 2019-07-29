package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(as = LocalBitcoinModel.class)
public class LocalBitcoinModel {

    @JsonProperty(value="data")
    private DataMain information;
    @JsonProperty(value="pagination")
    private Pagination pageNumber;
}
