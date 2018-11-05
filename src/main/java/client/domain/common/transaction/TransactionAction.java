package client.domain.common.transaction;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionAction {

    private String account;

    private String name;

    private List<TransactionAuthorization> authorization;

    /*TODO Dynamically Unpack JSON Data */

    private String data;

    public TransactionAction() {

    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TransactionAuthorization> getAuthorization() {
        return authorization;
    }

    public void setAuthorization(List<TransactionAuthorization> authorization) {
        this.authorization = authorization;
    }

    public String setData() {
        return data;
    }

    public void getData(String data) {
        this.data = data;
    }

}
