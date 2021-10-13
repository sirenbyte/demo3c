package com.example.demo.dto;


import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "body",
        "type",
        "senderName",
        "fromMe",
        "author",
        "time",
        "chatId",
        "messageNumber"
})
@Generated("jsonschema2pojo")
@ToString
public class SecondaryDto {

    @JsonProperty("id")
    private String id;
    @JsonProperty("body")
    private String body;
    @JsonProperty("type")
    private String type;
    @JsonProperty("senderName")
    private String senderName;
    @JsonProperty("fromMe")
    private Boolean fromMe;
    @JsonProperty("author")
    private String author;
    @JsonProperty("time")
    private Integer time;
    @JsonProperty("chatId")
    private String chatId;
    @JsonProperty("messageNumber")
    private Integer messageNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("senderName")
    public String getSenderName() {
        return senderName;
    }

    @JsonProperty("senderName")
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    @JsonProperty("fromMe")
    public Boolean getFromMe() {
        return fromMe;
    }

    @JsonProperty("fromMe")
    public void setFromMe(Boolean fromMe) {
        this.fromMe = fromMe;
    }

    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @JsonProperty("time")
    public Integer getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Integer time) {
        this.time = time;
    }

    @JsonProperty("chatId")
    public String getChatId() {
        return chatId;
    }

    @JsonProperty("chatId")
    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    @JsonProperty("messageNumber")
    public Integer getMessageNumber() {
        return messageNumber;
    }

    @JsonProperty("messageNumber")
    public void setMessageNumber(Integer messageNumber) {
        this.messageNumber = messageNumber;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
