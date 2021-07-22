package com.example.app3.mapper;

import com.example.app3.entity.Client;
import com.example.app3.model.ClientModel;

public class ClientMapper {
    public static ClientModel entityToModel(Client client) {
        return ClientModel.builder()
                .id(client.getId())
                .name(client.getName())
                .build();
    }
}
