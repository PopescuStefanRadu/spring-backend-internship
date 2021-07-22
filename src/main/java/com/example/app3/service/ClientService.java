package com.example.app3.service;

import com.example.app3.entity.Client;
import com.example.app3.mapper.ClientMapper;
import com.example.app3.model.ClientModel;
import com.example.app3.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(final ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


//    public ClientModel getClient() {
//
//
//        return ClientMapper.entityToModel(client);
//    }

    public List<ClientModel> getAllClients() {
        return clientRepository.findAll()  // default:  findAll()  findById()  findByName()      [ (1,Alex), (2,Claudia) ...   ]
                .stream()
                .map(client -> ClientMapper.entityToModel(client))  // entity ->  model
                .collect(Collectors.toList());  // List<modele>
    }
}
