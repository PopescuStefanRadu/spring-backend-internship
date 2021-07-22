package com.example.app3.mapper;

import com.example.app3.entity.Client;
import com.example.app3.model.ClientModel;

public class ClientMapper {
    public static ClientModel entityToModel(Client client) {
        ClientModel clientModel = new ClientModel();
        clientModel.setId(client.getId());
        clientModel.setName(client.getName());

        return clientModel;
    }
}
