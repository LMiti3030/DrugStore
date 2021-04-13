package com.lauramititelu.springboot.drugstore.DrugStore.controllers;

import com.lauramititelu.springboot.drugstore.DrugStore.models.Client;
import com.lauramititelu.springboot.drugstore.DrugStore.repositories.ClientRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientsController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public List<Client> list(){
        return clientRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Client get(@PathVariable Long id){
        return clientRepository.getOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client create(@RequestBody final Client client){
        //TODO: validation that passed in values are ok, otherwise do nothing
        return clientRepository.saveAndFlush(client);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        //TODO: check if client has orders active, if yes delete, if no return message
        clientRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Client update (@PathVariable Long id, @RequestBody Client client){
        //TODO: add validation that all attributes are passed in, otherwise return a 400 bad payload
        Client existingClient = clientRepository.getOne(id);
        BeanUtils.copyProperties(client, existingClient, "clientID");
        return clientRepository.saveAndFlush(existingClient);
    }


}
