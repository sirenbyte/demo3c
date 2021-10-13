package com.example.demo.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "instanceId",
        "messages"
})
@Generated("jsonschema2pojo")
@ToString
public class WebHookDto {

    @JsonProperty("instanceId")
    private String instanceId;
    @JsonProperty("messages")
    private List<SecondaryDto> messages = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("instanceId")
    public String getInstanceId() {
        return instanceId;
    }

    @JsonProperty("instanceId")
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    @JsonProperty("messages")
    public List<SecondaryDto> getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(List<SecondaryDto> messages) {
        this.messages = messages;
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