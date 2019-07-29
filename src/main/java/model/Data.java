package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
    public class Data {

        @JsonProperty(value = "profile")
        Profile prof;
        @JsonProperty(value = "require_feedback_score")
        private Integer requireFeedbackScore;
        @JsonProperty(value = "hidden_by_opening_hours")
        private Boolean hiddenByOpeningHours;
        @JsonProperty(value = "trade_type")
        private String tradeType;
        @JsonProperty(value = "ad_id")
        private Integer adId;
        @JsonProperty(value = "temp_price")
        private String tempPrice;
        @JsonProperty(value = "bank_name")
        private String bankName;
        @JsonProperty(value = "payment_window_minutes")
        private Integer paymentWindowMinutes;
        @JsonProperty(value = "trusted_required")
        private Boolean trustedRequired;
        @JsonProperty(value = "min_amount")
        private String minAmount;
        @JsonProperty(value = "visible")
        private Boolean visible;
        @JsonProperty(value = "require_trusted_by_advertiser")
        private Boolean requireTrustedByAdvertiser;
        @JsonProperty(value = "temp_price_usd")
        private String tempPriceUsd;
        private Integer lat;
        @JsonProperty(value = "is_local_office")
        private Boolean isLocalOffice;
        @JsonProperty(value = "first_time_limit_btc")
        private String firstTimeLimitBtc; // null
        @JsonProperty(value = "atm_model")
        private String atmModel;
        private String city;
        @JsonProperty(value = "location_string")
        private String locationString;
        private String countryCode;
        private String currency;
        @JsonProperty(value = "limit_to_fiat_amounts")
        private String limitToFiatAmounts;
        @JsonProperty(value = "created_at")
        private Date createdAt;
        @JsonProperty(value = "max_amount")
        private Integer maxAmount;
        private Integer lon;
        @JsonProperty(value = "sms_verification_required")
        private Boolean smsVerificationRequired;
        @JsonProperty(value = "require_trade_volume")
        private Double requireTradeVolume;
        @JsonProperty(value = "online_provider")
        private String onlineProvider;
        @JsonProperty(value = "max_amount_available")
        private String maxAmountAvailable;
        private String msg;
        @JsonProperty(value = "require_identification")
        private Boolean requireIdentification;
        @JsonProperty(value = "volume_coefficient_btc")
        private String volumeCoefficientBtc;
    }


